package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page61;

public class ViewPagerAdapter6 extends FragmentStateAdapter {


    public ViewPagerAdapter6(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page61();
            case 1 :
                return new page61();
            case 2 :
                return new page61();
            case 3 :
                return new page61();
            case 4 :
                return new page61();
            case 5 :
                return new page61();
            case 6 :
                return new page61();
            default :
                return new page61();
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}