package com.example.navendu.final2018;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class EngiteamActivity extends AppCompatActivity {


    ImageView i1;

    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    ImageView i6;
    TextView t1;

    TextView t11;
    TextView t12;

    TextView t21;
    TextView t22;

    TextView t31;
    TextView t32;

    TextView t41;
    TextView t42;

    TextView t51;
    TextView t52;



    TextView t61;
    TextView t62;







    ConstraintLayout c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engiteam);

        t1=(TextView)findViewById(R.id.text);
        t1.setText("cultural council");





        i1=(ImageView)findViewById(R.id.i1);
        Picasso.with(this)
                .load(R.drawable.parteek)
                .resize(300,300)
                .into(i1);

        i2=(ImageView)findViewById(R.id.i2);
        Picasso.with(this)
                .load(R.drawable.nikhil)
                .resize(300,300)
                .into(i2);



        i3=(ImageView)findViewById(R.id.i3);
        Picasso.with(this)
                .load(R.drawable.shivam)

                .resize(300,300)
                .into(i3);




        i4=(ImageView)findViewById(R.id.i4);
        Picasso.with(this)
                .load(R.drawable.janvi)

                .resize(300,300)
                .into(i4);


        i5=(ImageView)findViewById(R.id.i5);
        Picasso.with(this)
                .load(R.drawable.utkarsh)

                .resize(300,300)
                .into(i5);

        c=(ConstraintLayout)findViewById(R.id.hid);
        c.setVisibility(View.GONE);



    }
    public void cc(View view)
    {


        t1=(TextView)findViewById(R.id.text);
        t1.setText("cultural council");

         i1=(ImageView)findViewById(R.id.i1);
        Picasso.with(this)
                .load(R.drawable.parteek)
                .resize(300,300)
                .into(i1);

        i2=(ImageView)findViewById(R.id.i2);
        Picasso.with(this)
                .load(R.drawable.nikhil)
                .resize(300,300)
                .into(i2);



        i3=(ImageView)findViewById(R.id.i3);
        Picasso.with(this)
                .load(R.drawable.shivam)

                .resize(300,300)
                .into(i3);




        i4=(ImageView)findViewById(R.id.i4);
        Picasso.with(this)
                .load(R.drawable.janvi)

                .resize(300,300)
                .into(i4);


        i5=(ImageView)findViewById(R.id.i5);
        Picasso.with(this)
                .load(R.drawable.utkarsh)

                .resize(300,300)
                .into(i5);

c=(ConstraintLayout)findViewById(R.id.hid);
c.setVisibility(View.GONE);


        t11=(TextView)findViewById(R.id.t1);
        t11.setText("parteek singhal");

        t12=(TextView)findViewById(R.id.t2);

        t21=(TextView)findViewById(R.id.t3);
        t21.setText("nikhil arora");


        t22=(TextView)findViewById(R.id.t4);

        t31=(TextView)findViewById(R.id.t5);
        t31.setText("shivam arora");


        t32=(TextView)findViewById(R.id.t6);

        t41=(TextView)findViewById(R.id.t7);
        t41.setText("jahnvi singh");


        t42=(TextView)findViewById(R.id.t8);


        t51=(TextView)findViewById(R.id.t9);
        t51.setText("utkarsh arora");
        t52=(TextView)findViewById(R.id.t10);

        t61=(TextView)findViewById(R.id.t11);
        t61.setText("divyendu thakur");

        t62=(TextView)findViewById(R.id.t12);
        t62.setVisibility(View.VISIBLE);
        t52.setVisibility(View.VISIBLE);

        t42.setVisibility(View.VISIBLE);
        t32.setVisibility(View.VISIBLE);
        t22.setVisibility(View.VISIBLE);
        t12.setVisibility(View.VISIBLE);


    }

    public void ct(View view)
    {


        t1=(TextView)findViewById(R.id.text);
        t1.setText("core team");


        i1=(ImageView)findViewById(R.id.i1);
        Picasso.with(this)
                .load(R.drawable.gunik)
                .resize(300,300)
                .into(i1);

        i2=(ImageView)findViewById(R.id.i2);
        Picasso.with(this)
                .load(R.drawable.arpit)
                .resize(300,300)
                .into(i2);



        i3=(ImageView)findViewById(R.id.i3);
        Picasso.with(this)
                .load(R.drawable.dhruv)
                .resize(300,300)
                .into(i3);




        i4=(ImageView)findViewById(R.id.i4);
        Picasso.with(this)
                .load(R.drawable.akriti)

                .resize(300,300)
                .into(i4);


        i5=(ImageView)findViewById(R.id.i5);
        Picasso.with(this)
                .load(R.drawable.shikher)


                .resize(300,300).into(i5);



        c=(ConstraintLayout)findViewById(R.id.hid);
        c.setVisibility(View.VISIBLE);



        i6=(ImageView)findViewById(R.id.i6);
        Picasso.with(this)
                .load(R.drawable.divyendu)
                .into(i6);


        t11=(TextView)findViewById(R.id.t1);
        t11.setText("Gunik goel");

        t12=(TextView)findViewById(R.id.t2);

        t21=(TextView)findViewById(R.id.t3);
        t21.setText("arpit nagpal");


        t22=(TextView)findViewById(R.id.t4);

        t31=(TextView)findViewById(R.id.t5);
        t31.setText("dhruv dua");


        t32=(TextView)findViewById(R.id.t6);

        t41=(TextView)findViewById(R.id.t7);
        t41.setText("akriti tewari");


        t42=(TextView)findViewById(R.id.t8);


        t51=(TextView)findViewById(R.id.t9);
        t51.setText("shikher sachdeva");
        t52=(TextView)findViewById(R.id.t10);

        t61=(TextView)findViewById(R.id.t11);
        t61.setText("divyendu thakur");

        t62=(TextView)findViewById(R.id.t12);
t62.setVisibility(View.INVISIBLE);
        t52.setVisibility(View.INVISIBLE);

        t42.setVisibility(View.INVISIBLE);
        t32.setVisibility(View.INVISIBLE);
        t22.setVisibility(View.INVISIBLE);
        t12.setVisibility(View.INVISIBLE);

    }

}
