package edu.quinnpiac.ser210.ls10_demo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements CountryList.CountryListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClickedMoveToDetail(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("countryid", position);
        startActivity(intent);
    }
}