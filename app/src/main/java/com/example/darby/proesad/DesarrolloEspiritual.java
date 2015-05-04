package com.example.darby.proesad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;

/**
 * Created by darby on 19/04/2015.
 */
public class DesarrolloEspiritual extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout
        setContentView(R.layout.activity_desarrolloespirit);

        // FLECHA ... luego al manifes para dar privilegios
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
    }



    View rootview;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_desarrolloespirit, container, false);
        return rootview;
    }


}
