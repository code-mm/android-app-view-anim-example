package com.ms.app;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private Button buttonShow;
    private Button buttonHide;

    private Button buttonShow1;
    private Button buttonHide1;


    private ImageView imageView;
    private ImageView imageView1;

    private TranslateAnimation lr;
    private TranslateAnimation rl;


    private TranslateAnimation bt;
    private TranslateAnimation tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);

        buttonShow = findViewById(R.id.buttonShow);
        buttonHide = findViewById(R.id.buttonHide);
        buttonShow1 = findViewById(R.id.buttonShow1);
        buttonHide1 = findViewById(R.id.buttonHide1);


        lr = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, -1.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        lr.setDuration(500);

        rl = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, -1.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        rl.setDuration(500);

        bt = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.0f);
        bt.setDuration(500);

        tb = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 1.0f);
        tb.setDuration(500);


        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(lr);
                imageView.setVisibility(View.VISIBLE);
            }
        });

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(rl);
                imageView.setVisibility(View.GONE);
            }
        });

        buttonShow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.startAnimation(bt);
                imageView1.setVisibility(View.VISIBLE);
            }
        });

        buttonHide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.startAnimation(tb);
                imageView1.setVisibility(View.GONE);
            }
        });
    }
}