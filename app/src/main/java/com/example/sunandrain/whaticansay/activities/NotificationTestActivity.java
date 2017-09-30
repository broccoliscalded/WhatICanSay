package com.example.sunandrain.whaticansay.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sunandrain.whaticansay.R;

public class NotificationTestActivity extends AppCompatActivity implements View.OnClickListener {
    

    public static Intent newIntent(Context context){
        return new Intent(context,NotificationTestActivity.class);
//        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);

        initView();
    }

    private void initView() {
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                break;
            case R.id.button2:
                break;
        }
    }
}
