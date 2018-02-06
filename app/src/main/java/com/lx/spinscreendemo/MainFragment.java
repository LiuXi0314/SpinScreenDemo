package com.lx.spinscreendemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created on 18-2-6 上午10:40
 */

public class MainFragment extends BaseFragment {

    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        textView = new TextView(getContext());
        textView.setText("Fragment");
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundResource(R.color.colorAccent);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return textView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.setText("test");
    }
}
