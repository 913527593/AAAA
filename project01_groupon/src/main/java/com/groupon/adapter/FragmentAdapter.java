package com.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.groupon.fragment.FragmentA;
import com.groupon.fragment.FragmentB;
import com.groupon.fragment.FragmentC;
import com.groupon.fragment.FragmentD;

import java.util.ArrayList;
import java.util.List;

/**
 * 引导页adapter
 * Created by Administrator on 2017/6/15.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments = new ArrayList<>();

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new FragmentA());
        fragments.add(new FragmentB());
        fragments.add(new FragmentC());
        fragments.add(new FragmentD());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
