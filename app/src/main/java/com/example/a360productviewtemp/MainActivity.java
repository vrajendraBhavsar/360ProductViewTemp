package com.example.a360productviewtemp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductShowCaseWebView wv = (ProductShowCaseWebView) findViewById(R.id.web_view);

        String imagesTag360="";
        /*Taking images from the assert folder*/
        for(int i=1;i<19;i++)
        {
            imagesTag360 = imagesTag360+"<img src=\"file:///android_asset/images/image1_"+i+".jpg\"/>" ;
        }
        /* For Showing Images from image url just use the image url in the src field*/

//        for(int i=1;i<5;i++)
//        {
////            imagesTag360=imagesTag360+"<img src=\"http://imageurl.com/image1_.jpg\"/>" ;
//            imagesTag360=imagesTag360+"<img src=\"https://github.com/hd-motion/flutter_imageview_360/blob/master/example/assets/sample/"+i+".png\"/>" ;
//        }
        Log.d("",imagesTag360);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadDataWithBaseURL("",
                imagesTag360, "text/html", "UTF-8", null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}