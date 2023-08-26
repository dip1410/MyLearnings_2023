package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.mvc.MVCActivity;
import com.example.myapplication.mvp.MVPActivity;
import com.example.myapplication.mvvm.MVVMActivity;


public class ArchitecturesActivity extends AppCompatActivity {

    Button btnMVC,btnMVP,btnMVVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architectures);
        btnMVC = (Button)findViewById(R.id.buttonMVC);
        btnMVP = (Button)findViewById(R.id.buttonMVP);
        btnMVC = (Button)findViewById(R.id.buttonMVVM);

        btnMVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ArchitecturesActivity.this, MVCActivity.class);
                ArchitecturesActivity.this.startActivity(myIntent);
            }
        });
        btnMVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ArchitecturesActivity.this, MVPActivity.class);
                ArchitecturesActivity.this.startActivity(myIntent);
            }
        });
        btnMVVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ArchitecturesActivity.this, MVVMActivity.class);
                ArchitecturesActivity.this.startActivity(myIntent);
            }
        });
    }



}