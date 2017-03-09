package io.crkw.memorytest;

import android.app.ActivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MEMORY", String.format("maxMemory: %d", Runtime.getRuntime().maxMemory()));
        Log.d("MEMORY", String.format("freeMemory: %d", Runtime.getRuntime().freeMemory()));
        Log.d("MEMORY", String.format("totalMemory: %d", Runtime.getRuntime().totalMemory()));
        Log.d("MEMORY", String.format("getMemoryClass: %d", ((ActivityManager) getSystemService(ACTIVITY_SERVICE)).getMemoryClass()));
    }
}
