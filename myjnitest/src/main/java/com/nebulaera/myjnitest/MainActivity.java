package com.nebulaera.myjnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.loadLibrary("MyCustom");
        HelloWorld helloWorld = new HelloWorld();
        int add = helloWorld.add(2, 3);
        Log.i("LYJ_Result", "result=" + add);
    }
}
