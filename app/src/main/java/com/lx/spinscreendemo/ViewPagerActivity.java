package com.lx.spinscreendemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 18-2-6 下午3:45
 */

public class ViewPagerActivity extends BaseActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    FragmentAdapter mPagerAdapter;
    private List<BaseFragment> mFragments;

    @Override
    public void onRefreshUI() {
        super.onRefreshUI();
        setContentView(R.layout.activity_view_pager);
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);

        if (mFragments == null) {
            mFragments = new ArrayList<>();

            mFragments.add(getFragment("1"));
            mFragments.add(getFragment("2"));
            mFragments.add(getFragment("3"));
            mFragments.add(getFragment("4"));
        }
        if (mPagerAdapter == null) {
            mPagerAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        }
        mViewPager.setAdapter(mPagerAdapter);
        mPagerAdapter.notifyDataSetChanged();
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private MainFragment getFragment(String tag){
        MainFragment fragment = new MainFragment();
        Bundle bundle = new Bundle();bundle.putString("title",tag);
        fragment.setArguments(bundle);
        return fragment;
    }
}
