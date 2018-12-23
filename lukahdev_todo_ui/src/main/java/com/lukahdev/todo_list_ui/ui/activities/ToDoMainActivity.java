/**
 * MIT License
 * Copyright (c) 2018 Angelica Lorraine Santiago
 */
package com.lukahdev.todo_list_ui.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public final class ToDoMainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, ToDoMainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentManager = getSupportFragmentManager();
    }
}
