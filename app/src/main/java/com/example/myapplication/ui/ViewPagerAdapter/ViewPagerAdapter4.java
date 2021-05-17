package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page41;

public class ViewPagerAdapter4 extends FragmentStateAdapter {


    public ViewPagerAdapter4(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page41();
            case 1 :
                return new page41();
            case 2 :
                return new page41();
            case 3 :
                return new page41();
            case 4 :
                return new page41();
            case 5 :
                return new page41();
            case 6 :
                return new page41();
            default :
                return new page41();
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}