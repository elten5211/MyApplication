package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page31;

public class ViewPagerAdapter3 extends FragmentStateAdapter {


    public ViewPagerAdapter3(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page31();
            case 1 :
                return new page31();
            case 2 :
                return new page31();
            case 3 :
                return new page31();
            case 4 :
                return new page31();
            case 5 :
                return new page31();
            case 6 :
                return new page31();
            case 7 :
                return new page31();
            case 8 :
                return new page31();
            case 9 :
                return new page31();
            case 10 :
                return new page31();
            case 11 :
                return new page31();

            default :
                return new page31();
        }
    }

    @Override
    public int getItemCount() {
        return 13;
    }
}