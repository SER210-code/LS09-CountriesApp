package edu.quinnpiac.ser210.ls10_demo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CountryList.CountryListListener{

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.refresh:
                Toast.makeText(this,"Refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.location:
                break;
            case R.id.search:
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void itemClickedMoveToDetail(int position) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            CountryDetail countryDetail = new CountryDetail();
            countryDetail.setCountryId(position);
            ft.replace(R.id.fragment_container,countryDetail);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();


        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("countryid", position);
            startActivity(intent);
        }
    }
}