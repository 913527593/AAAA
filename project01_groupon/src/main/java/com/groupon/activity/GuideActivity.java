package com.groupon.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.groupon.R;
import com.groupon.adapter.FragmentAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends FragmentActivity {

    @BindView(R.id.view_page)
    ViewPager viewPage;
    @BindView(R.id.indicator)
    CirclePageIndicator indicator;
    private FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

        initViewPager();

    }

    private void initViewPager() {
        adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPage.setAdapter(adapter);
        indicator.setViewPager(viewPage);
    }
}
