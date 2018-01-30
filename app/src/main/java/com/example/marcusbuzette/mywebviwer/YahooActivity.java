package com.example.marcusbuzette.mywebviwer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);


        WebView yahoo_view = (WebView) findViewById(R.id.webViewYahoo);
        yahoo_view.loadUrl("https://yahoo.com/");
    }
}
