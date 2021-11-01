package com.example.vmac.WatBot;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.gms.games.internal.events.EventIncrementEntry;


public class MyPagerAdapter extends FragmentPagerAdapter {

    InfoFragment page1, page2, page3;

//    Context ctx;

    public MyPagerAdapter(FragmentManager fm){
//        this.ctx = ctx;
        super(fm);
        page1 = new InfoFragment();
        page1.setCurPos(0);

        page2 = new InfoFragment();
        page2.setCurPos(1);

        page3 = new InfoFragment();
        page3.setCurPos(2);
    }

    @Override
    public Fragment getItem(int i){
        switch (i){
            case 0:
                return page1;

            case 1:
                return page2;

            case 2:
                return page3;
        }
        return null;
    }

    @Override
    public int getCount() {

        return 3;
    }

//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view==object;
//    }

//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position){
//        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
//                View view=layoutInflater.inflate(R.layout.slide_screen, container, false);
//
//                ImageView logoBackground=view.findViewById(R.id.logoBackground);
//                ImageView logo=view.findViewById(R.id.logo);
//
//                TextView title=view.findViewById(R.id.title);
//                TextView description= view.findViewById(R.id.description);
//
//                ImageView skipbtnBackground=view.findViewById(R.id.skipbtnBackground);
//                ImageView imagebtn1=view.findViewById(R.id.imagebtn1);
//                ImageView imagebtn2=view.findViewById(R.id.imagebtn2);
//                ImageView imagebtn3=view.findViewById(R.id.imagebtn1);

//                Button skipButton=view.findViewById(R.id.skipButton);

//                switch(position)
//                {
//                    case 0:
//                        logo.setImageResource(R.drawable.logowhite);
//                        imagebtn1.setImageResource(R.drawable.selected);
//                        imagebtn2.setImageResource(R.drawable.selected);
//                        imagebtn3.setImageResource(R.drawable.selected);
//
//                        title.setText("Gill will be your guide");
//                        description.setText("Every Day you will have an interesting Question" +
//                                "to think about." +
//                                "Take a minute or two" +
//                                "to write/talk" +
//                                "About your thoughts.");
//                     break;
//
//                     case 1:
//                         logo.setImageResource(R.drawable.logowhite);
//                         imagebtn1.setImageResource(R.drawable.selected);
//                         imagebtn2.setImageResource(R.drawable.selected);
//                         imagebtn3.setImageResource(R.drawable.selected);
//
//                         title.setText("Gill will be your guide");
//                         description.setText("Every Day you will have an interesting Question" +
//                                 "to think about." +
//                                 "Take a minute or two" +
//                                 "to write/talk"+
//                                 "About your thoughts. ");
//                         break;
//
//                    case 2:
//                        logo.setImageResource(R.drawable.logowhite);
//                        imagebtn1.setImageResource(R.drawable.selected);
//                        imagebtn2.setImageResource(R.drawable.selected);
//                        imagebtn3.setImageResource(R.drawable.selected);
//
//                        title.setText("Gill will be your guide");
//                        description.setText("Every Day you will have an interesting Question to think about. " +
//                                        "Take a minute or two to write/talk About your thoughts. ");
//                        break;
//                }
//                container.addView(view);
//                return view;
//    }
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((View) object);
//    }
}
