package com.androidpractice.abha.smarttablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SectionsPagerAdapter sectionsPagerAdapter;
//    private TabLayout tabLayout;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewPager();
    }

    private void setupViewPager(){
        viewPager = (ViewPager) findViewById(R.id.container);
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
        smartTabLayout = (SmartTabLayout) findViewById(R.id.tabs);

        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), 3);
        sectionsPagerAdapter.addFragment(new FragmentOne(), "Frag One");
        sectionsPagerAdapter.addFragment(new FragmentTwo(), "Frag Two");
        sectionsPagerAdapter.addFragment(new FragmentThree(), "Frag Three");

        viewPager.setAdapter(sectionsPagerAdapter);
//        tabLayout.setupWithViewPager(viewPager);
        smartTabLayout.setViewPager(viewPager);


    }
}
