package com.example.myapplication.ui.ViewPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.ui.page.page1;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0 :
                return new page1();
            case 1 :
                return new page1();
            case 2 :
                return new page1();
            case 3 :
                return new page1();
            case 4 :
                return new page1();
            case 5 :
                return new page1();
            case 6 :
                return new page1();
            default :
                return new page1();
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}