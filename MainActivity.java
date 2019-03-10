package example.com.prince.usamp13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = (WebView) findViewById(R.id.webView);
       // mywebview.loadUrl("http://www.google.com");


      /*  String data = "<html><body><h1>Hello, Prince!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8");*/

        mywebview.loadUrl("file:///android_asset/contactus.html");
    }
}
