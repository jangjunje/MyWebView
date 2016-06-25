package com.example.user.mywebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-25.
 */
public class ArrAdapter extends android.widget.ArrayAdapter<String> {

    private  Context context;
    private  String[] values;

    public ArrAdapter(Context context, String[] values) {
        super(context, R.layout.activity_imag_list, values);
        this.context = context;
        this.values  = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_imag_list, parent, false);

        ImageView imgView = (ImageView) rowView.findViewById(R.id.logo);
        TextView textView = (TextView) rowView.findViewById(R.id.label);


        textView.setText(values[position]);

        String s = values[position];

        switch (s){
            case  "desert":
                imgView.setImageResource(R.drawable.desert);
                break;
            case "chrysanthemum":
                imgView.setImageResource(R.drawable.chrysanthemum);
                break;
            case  "hydrangeas":
                imgView.setImageResource(R.drawable.hydrangeas);
                break;
            case  "jellyfish":
                imgView.setImageResource(R.drawable.jellyfish);
                break;
            case  "koala":
                imgView.setImageResource(R.drawable.koala);
                break;
            case  "lighthouse":
                imgView.setImageResource(R.drawable.lighthouse);
                break;
            case  "penguins":
                imgView.setImageResource(R.drawable.penguins);
                break;
            case  "tulips":
                imgView.setImageResource(R.drawable.tulips);
                break;
        }

        //return super.getView(position, convertView, parent);
        return null;
    }
}
