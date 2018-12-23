package com.lukahdev.todo_list_ui.managers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NavigationManager {

    private FragmentActivity activity;
    private FragmentManager fragmentManager;

    /* State variables */
    private LinkedList<Integer> flowMarkers;

    public NavigationManager(Fragment fragment) {
        this(fragment.getActivity(), fragment.getChildFragmentManager());
    }

    private NavigationManager(FragmentActivity activity, FragmentManager manager) {
        this.activity = activity;
        this.fragmentManager = manager;

        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {

            @Override
            public void onBackStackChanged() {
                //This is ugly, but we don't have a way to determine which was the entry that was removed!
                List<Integer> backStackEntries = new ArrayList<>();
                for (int j = 0; j < fragmentManager.getBackStackEntryCount(); j++) {
                    FragmentManager.BackStackEntry entry = fragmentManager.getBackStackEntryAt(j);
                    backStackEntries.add(entry.getId());
                }
                flowMarkers.retainAll(backStackEntries);
            }
        });
    }
}
