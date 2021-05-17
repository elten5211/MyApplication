package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page51;

public class ViewPagerAdapter5 extends FragmentStateAdapter {


    public ViewPagerAdapter5(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page51();
            case 1 :
                return new page51();
            case 2 :
                return new page51();

            default :
                return new page51();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}