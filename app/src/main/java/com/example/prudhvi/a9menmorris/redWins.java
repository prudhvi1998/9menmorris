package com.example.prudhvi.a9menmorris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class redWins extends AppCompatActivity {

    private Button redHome;

    public  void toHomeFromRedWins(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_wins);

        redHome = (Button) findViewById(R.id.homeButtonInBlueWins);

        redHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHomeFromRedWins();
            }

        });
    }

    @Override
    public void onBackPressed(){
        Intent i = new Intent(redWins.this,MainActivity.class);
        startActivity(i);
    }
}
