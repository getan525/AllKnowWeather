package com.zhouzhi.allknowweather.ui.activity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseActivity;

import butterknife.BindView;

public class CityManagerActivity extends BaseActivity {
//    @BindView(R.id.toolbar_city_manager)
//    Toolbar mToolbar;
    @Override
    protected void initView() {


    }

    @Override
    public void initToolbar() {
        super.initToolbar();
        Log.d(TAG, "initView: ///////////////////////////////////");
        //mToolbar.setTitle("城市管理");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_city_manager;
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_city_manager,menu);
        return true;

    }*/

    @Override
    public int getMenuId() {
        return R.menu.menu_city_manager;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.city_edit:
                break;
            case R.id.city_refresh:
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
