package com.example.sunilm.module4asynctasks;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Handler handler;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                return false;
            }
        })


        class DoWork implements Runnable
        {
            static final int STATUS_start = 0;
             Message msg = new Message();

            @Override
            public void run() {
                for(int j = 0; j<100;j++) {
                    for (int i = 0; i < 100000; i++) {

                    }
                }
            }
        }
    }
}
