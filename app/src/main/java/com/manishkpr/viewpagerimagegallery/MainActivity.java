package com.manishkpr.viewpagerimagegallery;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends Activity {
  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
    ImageAdapter adapter = new ImageAdapter(this);
    viewPager.setAdapter(adapter);
    //Bind the title indicator to the adapter



  /*
   this is for indicator of image viewPager . I have used inicator library
    http://viewpagerindicator.com/*/

    CirclePageIndicator titleIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
    titleIndicator.setFillColor(Color.BLACK);
    titleIndicator.setViewPager(viewPager);

   /* end of viwe pager titleIndicator*/








  }




}
