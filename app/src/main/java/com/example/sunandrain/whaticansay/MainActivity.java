package com.example.sunandrain.whaticansay;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sunandrain.whaticansay.activities.NotificationTestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewPager myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        findViewById(R.id.notification_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.notification_button:
                Intent intent = NotificationTestActivity.newIntent(MainActivity.this);
                startActivity(intent);
                break;
        }
    }
}
