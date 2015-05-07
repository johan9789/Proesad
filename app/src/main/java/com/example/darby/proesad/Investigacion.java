package com.example.darby.proesad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Investigacion extends ActionBarActivity {
    private View rootview;
    private Spinner spnRecursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investigacion);

        start();
        verListaRecursos();
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_investigacion, container, false);
        return rootview;
    }

    private void start(){
        // FLECHA ATRAS
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
        spnRecursos = (Spinner)findViewById(R.id.spnRecursos);
    }

    private void verListaRecursos(){
        String[] recursos = {"Formato APA", "Bases de datos científicas", "Bibliotecas electrónicas"};
        spnRecursos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, recursos));
        spnRecursos.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id){
                Toast.makeText(adapterView.getContext(), (String)adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){}
        });
    }

}