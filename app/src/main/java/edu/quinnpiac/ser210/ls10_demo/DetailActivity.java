package edu.quinnpiac.ser210.ls10_demo;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    private int countryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        countryId = getIntent().getExtras().getInt("countryid");
        CountryDetail frag = (CountryDetail) getFragmentManager().findFragmentById(R.id.fragment_country_detail);
        frag.setCountryId(countryId);
      
    }
}
