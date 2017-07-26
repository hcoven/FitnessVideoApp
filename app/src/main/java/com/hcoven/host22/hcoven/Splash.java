package com.hcoven.host22.hcoven;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Runnable r= new Runnable() {
            @Override
            public void run() {
                Thread myThread = new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(1000);
                            Intent n = new Intent(getApplicationContext(), Home.class);
                            startActivity(n);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                myThread.start();

            }
        };
        Thread newThread= new Thread(r);
        newThread.start();
    }
}
