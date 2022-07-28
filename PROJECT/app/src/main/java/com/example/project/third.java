package com.example.project;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class third extends Activity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        webview = (WebView) findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("https://www.google.com/search?sxsrf=AOaemvI7CWZoN_Rg_rIdCdvlkFU1C6gv7g:1639985209606&q=hospitals+near+me&npsic=0&rflfq=1&rldoc=1&rllag=16305589,80435415,381&tbm=lcl&sxsrf=AOaemvI7CWZoN_Rg_rIdCdvlkFU1C6gv7g:1639985209606&sa=X&ved=2ahUKEwjJuuv-7PH0AhUKzzgGHQSNAwsQtgN6BAgEEGU&biw=1536&bih=714&dpr=1.25#rlfi=hd:;si:;mv:[[16.3134497,80.45217149999999],[16.291985999999998,80.41710839999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!1m4!1u16!2m2!16m1!1e1!1m4!1u16!2m2!16m1!1e2!2m1!1e2!2m1!1e16!2m1!1e3!3sIAE,lf:1,lf_ui:2");
    }
}