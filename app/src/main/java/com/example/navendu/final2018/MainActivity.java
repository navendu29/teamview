package com.example.navendu.final2018;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ii=(ImageView)findViewById(R.id.ij);
        Picasso.with(this)
                .load("https://www.nativeplanet.com/img/2016/08/1indiagate-23-1471954379.jpg")
                .into(ii);






    }
}
