package com.xmh.fragmentviewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*fragment pages start*/
    private ViewPager vpPages;
    private List<Fragment> mFragmentList;
    private MainFragment mMainFragment;
    private CookFragment mCookFragment;
    private MeFragment mMeFragment;
    FragmentsAdapter mFragmentsAdapter;
    /*fragment pages start*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        vpPages= (ViewPager) findViewById(R.id.vp_pages);
        mFragmentList=new ArrayList<>();
        mMainFragment=new MainFragment();
        mCookFragment=new CookFragment();
        mMeFragment=new MeFragment();
        mFragmentList.add(mMainFragment);
        mFragmentList.add(mCookFragment);
        mFragmentList.add(mMeFragment);
        mFragmentsAdapter=new FragmentsAdapter(getSupportFragmentManager());
        mFragmentsAdapter.setList(mFragmentList);
        vpPages.setAdapter(mFragmentsAdapter);
    }
}
