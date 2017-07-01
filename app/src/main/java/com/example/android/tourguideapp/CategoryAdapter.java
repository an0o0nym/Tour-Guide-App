package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by an0o0nym on 25/06/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private int[] categories = new int[] {R.string.poi, R.string.historic, R.string.nature,
            R.string.restaurants};
    private int noOfCategories = 4;

    public CategoryAdapter(FragmentManager fm, Context c) {
        super(fm);
        mContext = c;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new PoiFragment();
            case 1:
                return new HistoricalFragment();
            case 2:
                return new NatureFragment();
            case 3:
                return new RestaurantFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfCategories;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(categories[position]);
    }
}
