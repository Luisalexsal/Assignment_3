package com.example.cisc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MesaCollegeActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web__view);

        WebView mesaView = (WebView) findViewById(R.id.webViewMesa);

        mesaView.setWebViewClient(new WebViewClient()); //stay within webviewer app

        mesaView.loadUrl("http://www.sdmesa.edu");

    }
}