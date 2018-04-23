package com.example.prudhvi.a9menmorris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button play;
    private Button exit;
    //private Button alpha;
    //private Button rotate;
    //private Button scale;
    //private Button transtition;

    public void gamePage(){
        Intent i = new Intent(this,game.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animTranstitionToRight = AnimationUtils.loadAnimation(this, R.anim.anim_transition_to_right);

        play=(Button)findViewById(R.id.play);
        play.setAnimation(animAlpha);
        exit=(Button)findViewById(R.id.exit);
        exit.startAnimation(animAlpha);
        //alpha = (Button)findViewById(R.id.alpha);
        //rotate = (Button)findViewById(R.id.rotate);
        //scale = (Button)findViewById(R.id.scale);
        //transtition = (Button)findViewById(R.id.transtition);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animTranstitionToRight);
                gamePage();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animRotate);
                finish();
                System.exit(0);
            }
        });

        /*alpha.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
            }
        });

        rotate.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animRotate);
            }
        });

        scale.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animScale);
            }
        });

        transtition.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animTranstitionToRight);
            }
        });*/

    }

    @Override
    public void onBackPressed(){
        finish();
        System.exit(0);
    }
}
