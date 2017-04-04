package com.codeandsee.chapter2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.codeandsee.chapter2.fragments.ContactFragment;
import com.codeandsee.chapter2.fragments.ListFragment;
import com.codeandsee.chapter2.fragments.SettingsFragment;

/**
 * Created by antonio on 28/04/2015.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0 :
                return new ListFragment();
            case 1 :
                return new ContactFragment();
            case 2 :
                return new SettingsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 :
                return "LIST";
            case 1 :
                return "CONTACT";
            case 2 :
                return "SETTINGS";
            default:
                return null;
        }
    }

}
