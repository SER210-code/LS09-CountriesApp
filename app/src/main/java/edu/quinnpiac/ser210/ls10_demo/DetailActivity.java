package edu.quinnpiac.ser210.ls10_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity{

    private int countryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        countryId = getIntent().getExtras().getInt("countryid");
        CountryDetail frag = (CountryDetail) getSupportFragmentManager().findFragmentById(R.id.fragment_country_detail);
        frag.setCountryId(countryId);
      
    }
}
