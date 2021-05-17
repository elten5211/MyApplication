package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page81;

public class ViewPagerAdapter8 extends FragmentStateAdapter {


    public ViewPagerAdapter8(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page81();
            case 1 :
                return new page81();
            case 2 :
                return new page81();
            case 3 :
                return new page81();
            case 4 :
                return new page81();

            default :
                return new page81();
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}