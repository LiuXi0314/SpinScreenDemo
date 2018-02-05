package com.lx.spinscreendemo;

import android.util.Log;

/**
 * Created on 18-2-5 下午3:38
 */

public class Logger {

    private static final String TAG = "test";

    public static void d(String str) {
        Log.d(TAG, str);
    }
}
