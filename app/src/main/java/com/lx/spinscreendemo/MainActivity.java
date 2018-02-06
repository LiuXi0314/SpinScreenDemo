package com.lx.spinscreendemo;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends BaseActivity {

    private final String TAG = "fragment_main";

    @Override
    public void onRefreshUI() {
        super.onRefreshUI();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("SpinScreenAdapter");
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));
            }
        });
        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentByTag(TAG);
        if (mainFragment == null) {
            mainFragment = new MainFragment();
        }
        Logger.d("mainFragment= " + mainFragment.toString());
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        if (!mainFragment.isAdded()) {
            fragmentTransaction.replace(R.id.container, mainFragment, TAG);
        }
        fragmentTransaction.show(mainFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);

    }
}
