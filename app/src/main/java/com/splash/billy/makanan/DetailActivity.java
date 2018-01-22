package com.splash.billy.makanan;

import android.app.FragmentManager;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrive the data coming from MainActivity.java
        Menu menu = getIntent().getParcelableExtra("menu");
        //Parcelable[] menu = getIntent().getParcelableArrayExtra("menu");
        // Pass the data to DetailFragmentB.java to display it
        FragmentManager  fragmentManager  = getFragmentManager();
        FragmentDetail  detailFragment  = (FragmentDetail) fragmentManager.findFragmentById(R.id.fragmentD);
       // FragmentManager detailFragment = (FragmentDetail) fragmentManager.findFragmentById(R.id.fragmentD);
        detailFragment.displayData(menu);
    }
}
