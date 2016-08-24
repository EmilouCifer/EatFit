package com.emilou.eatfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by MuhammadRoqiAli on 8/24/2016.
 */
public class LaunchScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, WelcomeLayout.class));
        finish();
    }
}
