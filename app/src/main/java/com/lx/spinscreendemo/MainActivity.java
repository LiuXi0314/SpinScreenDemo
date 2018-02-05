package com.lx.spinscreendemo;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("onCreate");
    }

    @Override
    public void onRefreshUI() {
        super.onRefreshUI();
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.text)).setText("hello screen");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Logger.d("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Logger.d("onRestoreInstanceState");
    }

}
