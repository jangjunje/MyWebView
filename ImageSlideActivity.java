package com.example.user.mywebview;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageSlideActivity extends Activity implements View.OnClickListener{

    Button mbtnPrevious;
    Button mbtnNext;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);

        mbtnPrevious = (Button) findViewById(R.id.btnPrevious);
        mbtnNext = (Button) findViewById(R.id.btnNext);
        imgView = (ImageView) findViewById(R.id.imgViewSlide);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPrevious:
                break;
            case R.id.btnNext:
                break;
        }

    }
}
