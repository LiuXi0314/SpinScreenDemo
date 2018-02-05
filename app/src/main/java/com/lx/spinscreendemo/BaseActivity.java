package com.lx.spinscreendemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created on 18-2-5 下午5:25
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onRefreshUI();
    }

    /**
     * 设置View
     * 测量绘制View
     */
    public void onRefreshUI() {

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Logger.d("横屏");
        } else {
            Logger.d("竖屏");
        }
        onRefreshUI();
    }

}
