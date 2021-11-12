package com.example.viewpager2tabs;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    Context context;
    int totalTabCount;

    public FragmentAdapter(Context context, @NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int totalTabCount) {
        super(fragmentManager, lifecycle);
        this.context = context;
        this.totalTabCount = totalTabCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1 :
                return new SecondFragment();
            case 2 :
                return new ThirdFragment();
        }

        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return totalTabCount;
    }
}
