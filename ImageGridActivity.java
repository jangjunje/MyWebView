package com.example.user.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class ImageGridActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_grid);

        final GridView gv = (GridView) findViewById(R.id.gridView);

        GridAdapter gAdapter = new GridAdapter(this);
        gv.setAdapter(gAdapter);
    }
}
