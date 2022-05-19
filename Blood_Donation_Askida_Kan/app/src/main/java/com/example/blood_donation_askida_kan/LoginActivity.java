package com.example.blood_donation_askida_kan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdonation);
    }

    public void GoToDonnors(View view) {
        Intent intent = new Intent(LoginActivity.this,DonnorActivity.class);
        startActivity(intent);
    }
}
