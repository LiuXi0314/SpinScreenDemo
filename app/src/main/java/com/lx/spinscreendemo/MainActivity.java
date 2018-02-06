package com.lx.spinscreendemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private final String TAG = "fragment_main";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((TextView)findViewById(R.id.textView)).setText("test");
    }

    @Override
    public void onRefreshUI() {
        super.onRefreshUI();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SpinScreen");
//
        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentByTag(TAG);
        if (mainFragment == null) {
            mainFragment = new MainFragment();
        }
        Logger.d("mainFragment=" +mainFragment.toString());

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if (!mainFragment.isAdded()) {
            fragmentTransaction.add(R.id.container, mainFragment, TAG);
        } else {
            return;
//            fragmentTransaction.show(mainFragment);
        }
        fragmentTransaction.commit();
    }


}
