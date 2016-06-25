package com.example.user.mywebview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ImageListActivity extends ListActivity {

    static final String[] arr = new String[]{
            "chrysanthemum", "desert", "hydrangeas",
            "jellyfish", "koala", "koala",
            "lighthouse", "penguins", "tulips"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_imag_list);
        setListAdapter(new ArrAdapter(this, arr));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        String selectedValue = (String) getListAdapter().getItem(position);

        Toast.makeText(this, selectedValue, Toast.LENGTH_LONG).show();

    }
}
