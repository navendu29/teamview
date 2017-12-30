package com.example.navendu.final2018;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //]]  setSupportActionBar(toolbar);

        ImageView ii=(ImageView)findViewById(R.id.jk);
        Picasso.with(this)
                .load(R.drawable.iiii
                )

                .into(ii);





    }
}
