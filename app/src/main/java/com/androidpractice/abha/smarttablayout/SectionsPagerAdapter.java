package com.androidpractice.abha.smarttablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHA on 22-08-2017.
 */

/*
  class for storing fragments for pager in memory
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPagerAdapter";
    private List<Fragment> mFragmentsList = new ArrayList<>();
    private List<String> mFragmentsTitleList = new ArrayList<>();
    private int numOfTabs;

    public SectionsPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    public void addFragment(Fragment fragment, String title){
        mFragmentsList.add(fragment);
        mFragmentsTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentsTitleList.get(position);
    }
}
