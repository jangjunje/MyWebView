package com.example.user.mywebview;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class ImageSlideActivity extends Activity implements View.OnClickListener{

    Button    mbtnPrevious;
    Button    mbtnNext;
    ImageView imgView;

    Integer[] imgList = {
            R.drawable.chrysanthemum, R.drawable.desert, R.drawable.hydrangeas,
            R.drawable.jellyfish, R.drawable.koala, R.drawable.koala,
            R.drawable.lighthouse, R.drawable.penguins, R.drawable.tulips
    };

    int imgPos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);

        mbtnPrevious = (Button) findViewById(R.id.btnPrevious);
        mbtnNext     = (Button) findViewById(R.id.btnNext);
        imgView      = (ImageView) findViewById(R.id.imgViewSlide);

        findViewById(R.id.btnPrevious).setOnClickListener(this);
        findViewById(R.id.btnNext).setOnClickListener(this);

        imgView.setImageResource(imgList[0]);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPrevious:

                if(imgPos>=0)
                    imgView.setImageResource(imgList[imgPos--]);
                else
                    imgPos = 0;

                break;
            case R.id.btnNext:

                if(imgPos<imgList.length)
                    imgView.setImageResource(imgList[imgPos++]);
                else
                    imgPos = imgList.length-1;
                break;
        }

    }
}
