package com.welson.plugintest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = new Random(1).nextInt();
        if (i == 0) {
            test1();
        } else {
            test2();
        }
    }

    public void test1() {
        Intent intent = new Intent(this, TestActivity1.class);
        startActivity(intent);
    }

    public void test2() {
        Intent intent = new Intent(this, TestActivity2.class);
        startActivity(intent);
    }
}