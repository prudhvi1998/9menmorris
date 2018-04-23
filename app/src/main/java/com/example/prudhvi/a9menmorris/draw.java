package com.example.prudhvi.a9menmorris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class draw extends AppCompatActivity {

    private Button Home;

    public  void toHomeFromDraw(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        Home = (Button) findViewById(R.id.homeButtonInBlueWins);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHomeFromDraw();
            }

        });

    }

    @Override
    public void onBackPressed(){
        Intent i = new Intent(draw.this,MainActivity.class);
        startActivity(i);
    }

}
