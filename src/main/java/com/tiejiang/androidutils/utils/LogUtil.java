package com.tiejiang.androidutils.utils;

import android.util.Log;

/**
 * Created by yinyu-tiejiang on 17-7-22.
 */


public class LogUtil{
    /**
     * debug util
     * @param tag
     * @param str
     * */
    public static void e(String tag, String str){
        Log.e(tag, str);
    }
    public void d(String tag, String str){
        Log.d(tag, str);
    }
    public void v(String tag, String str){
        Log.v(tag, str);
    }
}

