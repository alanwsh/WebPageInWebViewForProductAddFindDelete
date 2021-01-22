package com.ebookfrenzy.roomdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView = (WebView) findViewById(R.id.webView1);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://sites.google.com/student.mmu.edu.my/wongshouhongtutorial8/home");
        webView.setWebViewClient(new WebViewClient());
    }

}
