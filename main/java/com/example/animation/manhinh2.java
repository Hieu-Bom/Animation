package com.example.animation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class manhinh2 extends AppCompatActivity {
ImageView imageView;
Button ok,ok1 , btnthoat;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        ok =(Button) findViewById(R.id.btfly);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView =(ImageView) findViewById(R.id.imv1);
                imageView.setBackgroundResource(R.drawable.frame);
                AnimationDrawable a = (AnimationDrawable) imageView.getBackground();
                a.start();
            }
        });
        ok1 =(Button) findViewById(R.id.btfly2);
        ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView =(ImageView) findViewById(R.id.imv1);
                imageView.setBackgroundResource(R.drawable.frame);
                AnimationSet anim = (AnimationSet) AnimationUtils.loadAnimation(manhinh2.this,R.anim.translate);
                imageView.startAnimation(anim);
            }
        });
        btnthoat=findViewById(R.id.btnThoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}