package layoutdemo.androidacademia.com.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_demo);
        webView = findViewById(R.id.webView);
        webView.loadUrl("http://www.google.com");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());

    }

    private class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

            return super.shouldOverrideUrlLoading(view, request);
        }
    }

}
