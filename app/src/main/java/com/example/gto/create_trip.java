package com.example.gto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class create_trip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_trip);
    }

    public void gotoChoose_baggage(View v) {
        Intent it = new Intent (this, choose_baggage.class);
        startActivity(it);
    }
}
