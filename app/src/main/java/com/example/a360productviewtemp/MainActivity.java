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
        ProductShowCaseWebView shoes = (ProductShowCaseWebView) findViewById(R.id.web_view1);
        ProductShowCaseWebView car = (ProductShowCaseWebView) findViewById(R.id.web_view2);

        String shoesImagesTag360="";
        String carImagesTag360="";
        /*Taking images from the assert folder*/
        for(int i=52;i>=1;i--)
        {
            shoesImagesTag360 = shoesImagesTag360+"<img src=\"file:///android_asset/images/car/"+i+".png\"/>" ;
        }
        for(int i=1;i<19;i++) {
            carImagesTag360 = carImagesTag360+"<img src=\"file:///android_asset/images/shoes/image1_"+i+".jpg\"/>" ;
        }
        /* For Showing Images from image url just use the image url in the src field*/
/*        for(int i=1;i<5;i++){
//            carImagesTag360=carImagesTag360+"<img src=\"http://imageurl.com/image1_.jpg\"/>" ;
            carImagesTag360=carImagesTag360+"<img src=\"https://github.com/hd-motion/flutter_imageview_360/blob/master/example/assets/sample/"+i+".png\"/>" ;
        }*/
        Log.d("",shoesImagesTag360);
        Log.d("",carImagesTag360);
        shoes.loadDataWithBaseURL("", shoesImagesTag360, "text/html", "UTF-8", null);
        car.loadDataWithBaseURL("", carImagesTag360, "text/html", "UTF-8", null);
    }
}