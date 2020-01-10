package com.example.gto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoCreate(View v) {
        Intent it = new Intent(this, create_trip.class);
        startActivity(it);
    }

    public void gotoEdit(View v) {
        Intent it = new Intent(this, edit_trip.class);
        startActivity(it);
    }
}
