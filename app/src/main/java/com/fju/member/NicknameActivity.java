package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class NicknameActivity extends AppCompatActivity {

    private EditText edName;
    private ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        edName = findViewById(R.id.nickname);
        next = findViewById(R.id.next3);
        Intent intent =new Intent(this,AgeActivity.class);

    }
}

