package com.example.marcusbuzette.mywebviwer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UCSDActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView ucsd_view = (WebView) findViewById(R.id.webViewUCSD);
        ucsd_view. loadUrl("https://extension.ucsd.edu/");
    }
}
