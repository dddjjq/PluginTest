package com.welson.plugintest;

import android.app.Activity;
import android.content.Intent;

/**
 * @author : dingyl
 * @date : 2021/1/26
 */
public class Test {
    public static void test1(Activity activity) {
        Intent intent = new Intent(activity, TestActivity1.class);
        activity.startActivity(intent);
    }
}
