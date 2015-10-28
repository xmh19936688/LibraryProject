package com.xmh.fragmentviewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengh on 2015/10/28 028.
 */
public class FragmentsAdapter extends FragmentPagerAdapter{

    private List<Fragment> mFragmentList =new ArrayList<>();

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
    }

    public FragmentsAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        setList(list);
    }

    public void setList(List<Fragment> list){
        mFragmentList.clear();
        if(list!=null&&!list.isEmpty()){
            mFragmentList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
