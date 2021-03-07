package com.zhouzhi.allknowweather.base;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.zhouzhi.allknowweather.R;

public abstract class BaseActivity extends AppCompatActivity {
    protected  final String TAG = getClass().getSimpleName();
    protected Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initToolbar();
        initView();
    }

    protected abstract void initView();

    public void initToolbar() {
        mToolbar = findViewById(R.id.toolbar);
        if (null != mToolbar){
            setSupportActionBar(mToolbar);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(getMenuId(),menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Log.d(TAG, "onOptionsItemSelected: "+"点击了home按钮");
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public int getMenuId() {
        return R.menu.menu_empty;
    }

    protected abstract int getLayoutId();
}
