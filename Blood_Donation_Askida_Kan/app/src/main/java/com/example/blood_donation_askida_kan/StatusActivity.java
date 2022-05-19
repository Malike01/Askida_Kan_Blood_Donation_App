package com.example.blood_donation_askida_kan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToDonnors(View view) {
        Intent intent = new Intent(this, com.example.blood_donation_askida_kan.DonnorActivity.class);
        startActivity(intent);
    }

    public void SocialMedia(View view) {
        Intent textShareIntent = new Intent(Intent.ACTION_SEND);
        textShareIntent.putExtra(Intent.EXTRA_TEXT, "");
        textShareIntent.setType("text/plain");
        startActivity(textShareIntent);
    }
    public void MyProfile(View view)
    {
        Intent intent = new Intent(this, com.example.blood_donation_askida_kan.AccountActivity.class);
        startActivity(intent);
    }


}
