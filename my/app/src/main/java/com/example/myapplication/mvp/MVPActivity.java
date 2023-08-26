package com.example.myapplication.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.mvc.MVCActivity;

public class MVPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpactivity);
    }
    public static Intent getIntent(Context context){
        return new Intent(context, MVPActivity.class);
    }
}