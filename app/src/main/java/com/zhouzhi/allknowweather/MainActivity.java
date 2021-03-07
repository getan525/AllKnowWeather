package com.zhouzhi.allknowweather;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DialogTitle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zhouzhi.allknowweather.base.BaseActivity;
import com.zhouzhi.allknowweather.base.BaseFragment;
import com.zhouzhi.allknowweather.net.RetrofitManager;
import com.zhouzhi.allknowweather.ui.activity.AreaSelectActivity;
import com.zhouzhi.allknowweather.ui.activity.CityManagerActivity;
import com.zhouzhi.allknowweather.ui.fragment.FourthFragment;
import com.zhouzhi.allknowweather.ui.fragment.HomeFragment;
import com.zhouzhi.allknowweather.ui.fragment.SecondFragment;
import com.zhouzhi.allknowweather.ui.fragment.ThirdFragment;
import com.zhouzhi.allknowweather.ui.fragment.WeatherFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.zhouzhi.allknowweather.ui.activity.AreaSelectActivity.RESULT_OK_1;
import static com.zhouzhi.allknowweather.ui.activity.AreaSelectActivity.RESULT_OK_2;

public class MainActivity extends BaseActivity {
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.nav_bottom)
    BottomNavigationView mBottomNavigationView;
    private BaseFragment currentFragment;
    FragmentManager mSupportFragmentManager;



    /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mBottomNavigationView = findViewById(R.id.nav_bottom);
        *//*setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_action_home);
        }*//*
        mSupportFragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = mSupportFragmentManager.beginTransaction();
        currentFragment = HomeFragment.newInstance();
        transaction.replace(R.id.fl_container,currentFragment).commit();
        //transaction.replace(R.id.fl_container,currentFragment);
        //mBottomNavigationView.inflateMenu(R.menu.nav_bottom);
    }*/


    @Override
    protected void initView() {
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mBottomNavigationView = findViewById(R.id.nav_bottom);
        mSupportFragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = mSupportFragmentManager.beginTransaction();
        currentFragment = WeatherFragment.newInstance();
        transaction.replace(R.id.fl_container, currentFragment).commit();

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction1 = mSupportFragmentManager.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.nav_bottom_1:
                        if (currentFragment == WeatherFragment.newInstance()) {
                            break;
                        } else {
                            currentFragment = WeatherFragment.newInstance();
                        }

                        break;
                    case R.id.nav_bottom_2:
                        currentFragment = SecondFragment.newInstance();
                        break;
                    case R.id.nav_bottom_3:
                        currentFragment = ThirdFragment.newInstance();
                        break;
                    case R.id.nav_bottom_4:
                        currentFragment = FourthFragment.newInstance();
                        break;
                }
                transaction1.replace(R.id.fl_container, currentFragment);
                transaction1.commit();
                return true;

            }
        });


        requestPermission();


    }

    private void requestPermission() {
        List<String> permissionList = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)!= PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.READ_PHONE_STATE);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }
        if (!permissionList.isEmpty()){
            String[] permissions = permissionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(MainActivity.this,permissions,1);
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    public void setToolbar(Toolbar toolbar) {
        mToolbar = toolbar;
        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.toolbar_meun, menu);
        int menuId = R.menu.menu_home;
        if (currentFragment instanceof WeatherFragment) {
            menuId = R.menu.menu_home;
        } else if (currentFragment instanceof SecondFragment) {
            menuId = R.menu.menu_other;
        }
        getMenuInflater().inflate(menuId, menu);
        currentFragment.onCreateOptionsMenu(menu, getMenuInflater());//這一句不太明白
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.back:
                break;
            case R.id.city:
                break;
            case R.id.setting:
                break;
            case R.id.action_add:
                Intent intent = new Intent(MainActivity.this, CityManagerActivity.class);
                startActivityForResult(intent, 100);
                break;
            default:
                break;
        }
        return true;
    }


    private Pattern intPattern = Pattern.compile("^[-\\+]?[\\d]*\\.0*$");

    public String getString(Map map, String key, String defaultValue) {
        Object obj = map.get(key);
        return obj == null ? defaultValue : (obj instanceof Number && intPattern.matcher(obj.toString()).matches() ? String.valueOf(Long.valueOf(((Number) obj).longValue())) : obj.toString());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {

            case 100:
                if (data != null) {

                    final Map map = (Map) data.getSerializableExtra("addressInfo");

                    if (resultCode == RESULT_OK) {

                        String areaName = String.format("%s %s %s", getString(map, "provinceName", ""),
                                getString(map, "cityName", ""), getString(map, "districtName", ""));
                        //areaTv.setText(areaName);
                        Toast.makeText(this, "哈哈哈", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "onActivityResult: " + areaName);
                    } else if (resultCode == RESULT_OK_1) {
                        String areaName = String.format("%s", getString(map, "cityName", ""));
                        Log.d(TAG, "onActivityResult: " + areaName);
                    } else if (resultCode == RESULT_OK_2) {
                        String areaName = String.format("%s", getString(map, "districtName", ""));
                        Log.d(TAG, "onActivityResult: " + areaName);
                    }
                }
                break;
            default:
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if (grantResults.length>0){
                    for (int grantResult : grantResults) {
                        if (grantResult != PackageManager.PERMISSION_GRANTED){
                            Toast.makeText(this,"必须同意所有权限才能使用本程序",Toast.LENGTH_SHORT).show();
                            finish();
                            return;
                        }
                    }
                    //requestLocation();
                }else {
                    Toast.makeText(this,"发生未知错误",Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
            default:
        }
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}