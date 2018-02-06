package com.lx.spinscreendemo;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;

/**
 * Created on 18-2-6 下午1:54
 */

public class MTextView extends android.support.v7.widget.AppCompatTextView {
    public MTextView(Context context) {
        super(context);
    }

    public MTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Logger.d("textView onConfigurationChanged");
    }
}
