package com.hcoven.host22.hcoven;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        @SuppressWarnings("UnusedAssignment") SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    private void  setupViewPager(ViewPager mViewPager){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WorkoutFragment(), "WorkOut");
        adapter.addFragment(new DietingFragment(), "Dieting");
        adapter.addFragment(new FlexFragment(), "Flexibility");
        adapter.addFragment(new WeightFragment(), "Weight Training");
        adapter.addFragment(new WeekFragment(), "Weekly Program");
        adapter.addFragment(new DetoxFragment(), "Detox");
        adapter.addFragment(new AbsFragment(), "Abs");
        mViewPager.setAdapter(adapter);
    }

    }