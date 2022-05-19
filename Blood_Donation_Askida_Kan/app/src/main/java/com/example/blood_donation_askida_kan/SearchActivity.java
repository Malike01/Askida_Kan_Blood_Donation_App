package com.example.blood_donation_askida_kan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private Spinner spinner2;
    private static final String[] paths = {"Oran", "Tlemsen", "Something long"};
    private static final String[] types = {"AB+", "AB-", "O+"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
                android.R.layout.simple_spinner_item, paths);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(SearchActivity.this,
                android.R.layout.simple_spinner_item, types);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void MyProfile(View view)
    {
        Intent intent = new Intent(this, com.example.blood_donation_askida_kan.AccountActivity.class);
        startActivity(intent);
    }
}