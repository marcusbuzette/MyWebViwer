package com.example.marcusbuzette.mywebviwer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonUCSD:
                Intent u;
                u = new Intent(this,UCSDActivity.class);
                startActivity(u);
                break;

            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this,YahooActivity.class);
                startActivity(y);
                break;

        }
    }

    Button buttonYahoo, buttomUCSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this); //create a listener method

        buttomUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttomUCSD.setOnClickListener(this);
    }




}
