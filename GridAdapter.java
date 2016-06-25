package com.example.user.mywebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by USER on 2016-06-25.
 */
public class GridAdapter extends BaseAdapter{

    private Context context;

    Integer[] imgList = {
            R.drawable.chrysanthemum, R.drawable.desert, R.drawable.hydrangeas,
            R.drawable.jellyfish, R.drawable.koala, R.drawable.lighthouse,
            R.drawable.penguins, R.drawable.tulips
    };

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview = new ImageView(this.context);
        imageview.setLayoutParams(new GridView.LayoutParams(100,150));
        imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageview.setPadding(5,5,5,5);

        imageview.setImageResource(imgList[position]);

        return imageview;
    }
}
