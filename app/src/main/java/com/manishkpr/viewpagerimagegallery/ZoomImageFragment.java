package com.manishkpr.viewpagerimagegallery;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.viewpagerindicator.CirclePageIndicator;

/**
 * Created by arifhasnat on 1/21/16.
 */
public class ZoomImageFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.zoom_image_fragment);


        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);


        /*
   this is for indicator of image viewPager . I have used inicator library
    http://viewpagerindicator.com/*/

        CirclePageIndicator titleIndicator = (CirclePageIndicator)findViewById(R.id.indicator_zoom);
        titleIndicator.setFillColor(Color.BLACK);
        titleIndicator.setViewPager(viewPager);

   /* end of viwe pager titleIndicator*/

        ImageButton imageButton= (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
