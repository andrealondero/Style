package com.example.styleout12;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapeterFragment adapterFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main2);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.container);
        adapterFragment = new ViewPagerAdapeterFragment(getSupportFragmentManager());

        adapterFragment.AddFragment(new FragmentTop(), "TOP");
        adapterFragment.AddFragment(new FragmentUp(), "UP");
        adapterFragment.AddFragment(new FragmentDown(), "DOWN");
        adapterFragment.AddFragment(new FragmentDone(), "DONE");
        viewPager.setAdapter(adapterFragment);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.falpa_cappuccio_tascone);
        tabLayout.getTabAt(1).setIcon(R.drawable.tshirt_taschino);
        tabLayout.getTabAt(2).setIcon(R.drawable.pantaloni_sigaretta_tasconi);
        tabLayout.getTabAt(3).setIcon(R.drawable.appendino);

    }
}
