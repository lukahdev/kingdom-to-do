package com.kingdom.techtest.kingdomtodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lukahdev.todo_list_ui.ui.activities.ToDoListLauncher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.bg_blackImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new ToDoListLauncher(getApplicationContext()).buildToDoListIntent());
            }
        });
    }
}
