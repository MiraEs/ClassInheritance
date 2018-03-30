package com.example.android.classinheritance;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookieTapped(View view) {
        ImageView androidCookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        androidCookieImageView.setImageResource(R.drawable.after_cookie);
    };

}
