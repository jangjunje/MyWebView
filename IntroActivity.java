package com.example.user.mywebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ((Button) findViewById(R.id.btnWebView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImgView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImgSlide)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImgList)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnWebView:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btImgView:
                startActivity(new Intent(this, ImageViewActivity.class));
                break;
            case R.id.btImgSlide:
                startActivity(new Intent(this, ImageSlideActivity.class));
                break;
            case R.id.btImgList:
                startActivity(new Intent(this, ImageListActivity.class));
                break;
        }
    }
}
