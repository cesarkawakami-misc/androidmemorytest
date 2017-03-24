package io.crkw.memorytest;

import android.app.ActivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityManager activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        Runtime runtime = Runtime.getRuntime();

        TextView text = (TextView) findViewById(R.id.mainText);
        text.setText(String.format(
                "getLargeMemoryClass() = %.2f MiB\ngetMemoryClass() = %.2f MiB\nmaxMemory() = %.2f MiB\ntotalMemory() = %.2f MiB\n",
                (float) activityManager.getLargeMemoryClass(),
                (float) activityManager.getMemoryClass(),
                ((float) runtime.maxMemory()) / 1024 / 1024,
                ((float) runtime.totalMemory()) / 1024 / 1024
        ));
    }
}
