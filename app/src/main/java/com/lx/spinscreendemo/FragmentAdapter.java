package com.lx.spinscreendemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created on 18-2-6 下午4:08
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private FragmentManager mFragmentManager;
    private List<BaseFragment> mFragments;

    public FragmentAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        mFragmentManager = fm;
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        BaseFragment fragment = mFragments.get(position % mFragments.size());
        String title = fragment.getArguments().getString("title");
        return title;
    }
}
