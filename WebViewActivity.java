package tr.edu.medipol.ybs95170017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView web = findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        String connect = getIntent().getStringExtra("connect");
        web.loadUrl(connect);


    }
}