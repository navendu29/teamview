package com.example.navendu.final2018;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dteam extends AppCompatActivity {



    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    ImageView i6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dteam);




        i1=(ImageView)findViewById(R.id.gg);
        i2=(ImageView)findViewById(R.id.ll);

        i3=(ImageView)findViewById(R.id.gg3);
        i4=(ImageView)findViewById(R.id.ll3);
        i5=(ImageView)findViewById(R.id.gg4);
        i6=(ImageView)findViewById(R.id.ll4);




        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/navendu29"));
                startActivity(link);
            }
        });



        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/navendu-gupta-7844ab137?trk=public-profile-join-page"));
                startActivity(link);
            }
        });





        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/sjain281297"));
                startActivity(link);
            }
        });



        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shubham-jain-010915136/"));
                startActivity(link);
            }
        });



        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/batbrain7"));
                startActivity(link);
            }
        });



        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mohit-kumar-a793a0135/"));
                startActivity(link);
            }
        });















    }
}
