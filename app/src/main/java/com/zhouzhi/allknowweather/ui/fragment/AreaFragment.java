package com.zhouzhi.allknowweather.ui.fragment;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseFragment;
import com.zhouzhi.allknowweather.bean.CityInfo;

import java.util.List;

import butterknife.BindView;

public class AreaFragment extends BaseFragment implements AdapterView.OnItemClickListener {
    private static final String ARG_PARAM1 = "parentCode";
    @BindView(R.id.lv_area)
    ListView mListView;
    private OnFragmentInteractionListener mListener;
    private List<CityInfo> mCityInfos;

    public static AreaFragment newInstance(List<CityInfo> cityInfos) {
        AreaFragment areaFragment = new AreaFragment();
        Bundle bundle = new Bundle();
        areaFragment.mCityInfos = cityInfos;
        //bundle.putBundle(ARG_PARAM1,cityInfos);
        areaFragment.setArguments(bundle);
        return areaFragment;
    }

    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView =inflater.inflate(R.layout.fragment_area,container,false);
        mListView = mRootView.findViewById(R.id.lv_area);
    }

    @Override
    protected void initEvent() {
        AreaAdapter areaAdapter = new AreaAdapter(getContext(), mCityInfos);
        mListView.setAdapter(areaAdapter);
        mListView.setOnItemClickListener(this);
    }

    @Override
    protected void initData(boolean isSavedInstanceState) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener){
            mListener = (OnFragmentInteractionListener) context;
        }else {
            throw new RuntimeException(context.toString()+ " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
         CityInfo cityInfo = (CityInfo) adapterView.getAdapter().getItem(i);
         if (cityInfo==null) return;
         if (mListener!=null){
             mListener.onInteraction(cityInfo);
         }
    }

    public interface OnFragmentInteractionListener {
        void onInteraction(CityInfo cityInfo);
    }

    class AreaAdapter extends BaseAdapter{
        private int lastPosition;
        List<CityInfo> mList;
        public AreaAdapter(Context context, List<CityInfo> cityInfos) {
            mList = cityInfos;
        }

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int i) {
            return mList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            AreaViewHold viewHold = null;
            if (convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.area_list_item,parent,false);
                viewHold = new AreaViewHold();
                viewHold.mTextView  = (TextView)convertView.findViewById(R.id.item_area);
                convertView.setTag(viewHold);
            }
            viewHold = (AreaViewHold) convertView.getTag();
            CityInfo cityInfo = mList.get(position);
            viewHold.mTextView.setText(cityInfo.getAreaName());
            if (lastPosition<position&&lastPosition!=0){
                ObjectAnimator.ofFloat(convertView,"translationY",convertView.getHeight()*2,0).setDuration(500).start();
            }
            lastPosition = position;
            return convertView;
        }

        private class AreaViewHold {
            TextView mTextView;
        }
    }
}
