package com.example.prudhvi.a9menmorris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class blueWins extends AppCompatActivity {

    private Button blueHome;

    public  void toHomeFromBlueWins(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_wins);

        blueHome = (Button) findViewById(R.id.homeButtonInBlueWins);

        blueHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHomeFromBlueWins();
            }

        });

    }

    @Override
    public void onBackPressed(){
        Intent i = new Intent(blueWins.this,MainActivity.class);
        startActivity(i);
    }

}
