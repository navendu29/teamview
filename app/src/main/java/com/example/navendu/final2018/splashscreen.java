package com.example.navendu.final2018;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class splashscreen extends AppCompatActivity {


    protected void onCreate(Bundle sa){


        super.onCreate(sa);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);

        getSupportActionBar().hide();


        VideoView v=(VideoView)findViewById(R.id.v1);

        Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        v.setVideoURI(path);
        v.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {


            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                jump();
            }


        });
        v.start();



//        catch(Exception e){
//
//            jump();
//
//        }
    }
    private void jump(){

        if(isFinishing())
            return;
        startActivity(new Intent(this,ScrollingActivity.class));
        finish();

    }

}
