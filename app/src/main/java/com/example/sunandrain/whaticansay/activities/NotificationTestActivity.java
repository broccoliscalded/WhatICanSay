package com.example.sunandrain.whaticansay.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sunandrain.whaticansay.R;

public class NotificationTestActivity extends AppCompatActivity {

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context,NotificationTestActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);
    }
}
