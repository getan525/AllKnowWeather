package com.zhouzhi.allknowweather.ui.activity;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseActivity;
import com.zhouzhi.allknowweather.bean.AreaInfo;
import com.zhouzhi.allknowweather.bean.CityInfo;
import com.zhouzhi.allknowweather.ui.fragment.AreaFragment;
import com.zhouzhi.allknowweather.utils.FileUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class AreaSelectActivity extends BaseActivity implements AreaFragment.OnFragmentInteractionListener {
    public static final int RESULT_OK_1 = -2;
    public static final int RESULT_OK_2 = -3;
    @BindView(R.id.fl_container_area)
    FrameLayout mFrameLayout;
    Fragment provinceFragment;
    Fragment cityFragment;
    private Map mMap= new HashMap();
    @Override
    protected void initView() {
        String areaString = FileUtil.readAssets(this, "city.json");
        Gson gson = new Gson();
        try {
            JSONObject jsonObject = new JSONObject(areaString);
            JSONArray citylist = jsonObject.getJSONArray("citylist");
            Type type = new TypeToken<List<CityInfo>>() {
            }.getType();
            List<CityInfo> cityInfos = gson.fromJson(citylist.toString(), type);
            provinceFragment = AreaFragment.newInstance(cityInfos);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.beginTransaction().replace(R.id.fl_container_area,provinceFragment).commit();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_area_select;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                FragmentManager fragmentManager = getSupportFragmentManager();
                if (fragmentManager.getBackStackEntryCount()>0){
                    fragmentManager.popBackStack();
                }else{
                    finish();
                }
        }
        return true;
    }

    @Override
    public void onInteraction(CityInfo cityInfo) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        int level = cityInfo.getLevel();
        switch (level){
            case 1:
                mMap.put("provinceId",cityInfo.getId());
                mMap.put("provinceName",cityInfo.getAreaName());
                if (cityInfo.isLeaf()){
                    Intent intent = new Intent();
                    intent.putExtra("addressInfo", (Serializable) mMap);
                    setResult(RESULT_OK,intent);
                    finish();
                }else {
                    transaction.hide(provinceFragment);
                    transaction.add(R.id.fl_container_area,cityFragment = AreaFragment.newInstance(cityInfo.getCitys())).addToBackStack(null).commit();
                }
                break;
            case 2:
                mMap.put("cityId",cityInfo.getId());
                mMap.put("cityName",cityInfo.getAreaName());
                if (cityInfo.isLeaf()){
                    Intent intent = new Intent();
                    intent.putExtra("addressInfo", (Serializable) mMap);
                    setResult(RESULT_OK_1,intent);
                    finish();
                }else {
                    transaction.hide(cityFragment);
                    transaction.add(R.id.fl_container_area,AreaFragment.newInstance(cityInfo.getCitys())).addToBackStack(null).commit();
                }
                break;
            case 3:
                mMap.put("districtId",cityInfo.getId());
                mMap.put("districtName",cityInfo.getAreaName());
                Intent intent = new Intent();
                intent.putExtra("addressInfo", (Serializable) mMap);
                setResult(RESULT_OK_2,intent);
                finish();
                break;
        }
    }
}
