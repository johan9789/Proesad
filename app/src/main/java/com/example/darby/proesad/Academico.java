package com.example.darby.proesad;

import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by darby on 19/04/2015.
 */
public class Academico extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout
        setContentView(R.layout.activity_academico);

        // FLECHA ... luego al manifes para dar privilegios
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
    }



    View rootview;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_academico, container, false);
        return rootview;
    }
}
