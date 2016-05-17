package com.example.aaron.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;


public class MyService extends IntentService
{
    public MyService()
    {
        super("worker");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Toast.makeText(MyService.this, "Service Started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        Toast.makeText(MyService.this, "Service Stopped", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {
        if(intent != null)
        {
            synchronized (this)
            {
                try
                {
                    wait(15000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            stopService(intent);
        }
    }

}
