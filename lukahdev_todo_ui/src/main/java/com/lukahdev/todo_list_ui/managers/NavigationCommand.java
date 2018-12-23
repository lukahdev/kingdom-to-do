package com.lukahdev.todo_list_ui.managers;

import android.support.v4.app.Fragment;

public interface NavigationCommand {
    void navigateTo(Fragment fragment);
}