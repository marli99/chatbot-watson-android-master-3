package com.example.vmac.WatBot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlideActivity extends AppCompatActivity  {

    ViewPager viewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_pager_activity);

        viewpager=findViewById(R.id.vpMain);
        viewpager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));



//        skipButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//
//            public void onClick(View v){
//                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
//            }
//        });

    }
}