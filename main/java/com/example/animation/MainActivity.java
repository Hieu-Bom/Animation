package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
Button btok,btnext,btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh);
        imageView =(ImageView) findViewById(R.id.imv);
        btok =(Button) findViewById(R.id.btnok);
        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationSet anim = (AnimationSet) AnimationUtils.loadAnimation(MainActivity.this,R.anim.shrink);
                imageView.startAnimation(anim);
            }
        });
        btnext=(Button) findViewById(R.id.btnnext);
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),manhinh2.class);
                startActivity(i);
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