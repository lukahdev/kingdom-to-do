/**
 * MIT License
 * Copyright (c) 2018 Angelica Lorraine Santiago
 */
package com.lukahdev.todo_list_ui.ui.activities;

import android.content.Context;
import android.content.Intent;

public class ToDoListLauncher {

    private final Context context;

    public ToDoListLauncher(Context context) {
        this.context = context;
    }

    public Intent buildToDoListIntent() {
        return ToDoMainActivity.createIntent(context);
    }
}
