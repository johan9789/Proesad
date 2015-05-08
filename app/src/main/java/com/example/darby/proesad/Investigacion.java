package com.example.darby.proesad;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Investigacion extends ActionBarActivity {
    private View rootview;
    private ListView listaInv;
    private ArrayAdapter<String> adapterListaInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investigacion);

        start();

     // color == pascual
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable1 = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable1);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootview = inflater.inflate(R.layout.activity_investigacion, container, false);
        return rootview;
    }

    private void start(){
        // FLECHA ATRAS
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal

        listaInv = (ListView)findViewById(R.id.listaInv);

    }

    private void mostrarLista(){
        String[] elementos = {"Reglamento", "Recursos del investigador", "Repositorio"};
        adapterListaInv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elementos);
        listaInv.setAdapter(adapterListaInv);
    }

}