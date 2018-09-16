package com.example.rish.fragmentssample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

     int PageCount=3;
    private Context context;
    private String tabTitles[] = new String[]{"Fruits","Vegetables","Stationary"};

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context =context;
    }

    @Override
    public Fragment getItem(int position) {
     if(position==0)
     {
         return new FruitsFragment();
     }
     else if(position==1)
     {
         return new VegetablesFragment();
     }
else
     {
         return new StationaryFragment();
     }


    }

    @Override
    public int getCount() {
        return PageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];

    }
}
