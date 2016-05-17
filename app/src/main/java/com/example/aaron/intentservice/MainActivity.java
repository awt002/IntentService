package com.example.aaron.intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void starter(View view)
    {
        Intent intent = new Intent(MainActivity.this, MyService.class);
        startService(intent);
    }

    public void stopper(View view)
    {
        Intent intent = new Intent(MainActivity.this, MyService.class);
        stopService(intent);
    }
}
