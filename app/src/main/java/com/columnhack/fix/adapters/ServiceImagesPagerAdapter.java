package com.columnhack.fix.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ServiceImagesPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> mFragments;

    public ServiceImagesPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<Fragment> fragments) {
        super(fm, behavior);
        mFragments = fragments;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
