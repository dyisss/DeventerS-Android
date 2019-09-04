package com.example.deventers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void startProcess(View view) {
        Intent intent = new Intent(this,test.class);
        startActivity(intent);
    }
}
