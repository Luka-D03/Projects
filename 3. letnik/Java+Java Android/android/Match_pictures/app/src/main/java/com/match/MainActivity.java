package com.match;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ourView = null;
    private int countPair = 0;
    final int[] drawable = new int[] (R.drawable.sample_0, R.drawable.sample_1,
              R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5,
              R.drawable.sample_6,R.drawable.sample_7);

    int[] pos = {0,1,2,3,4,5,6,7,0,1,2, 3,4,5,6,7};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById (R.id.gridview);
        ImageAdapter imageAdapter = new ImageAdapter (this);
        gridview.setAdapter (imageAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
            public void onItemclick (AdapterView<?> parent, View view, int position, long id) {
                if(currentPos < 0) {
                    currentPos = position;
                    curView = (ImageView)view;
                    ((ImageView) view).setImageResource (drawable [pos [position]]);
                }
            }
        }
    }
}