package com.example.darby.proesad;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBar;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.proesad.investigacion.RecursosInvestigador;
import com.proesad.investigacion.Reglamento;
import com.proesad.investigacion.Repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Investigacion extends ActionBarActivity {
    private View rootview;
    private ListView listaInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investigacion);

        start();
        mostrarLista();
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootview = inflater.inflate(R.layout.activity_investigacion, container, false);
        return rootview;
    }

    private void start(){
        listaInv = (ListView)findViewById(R.id.listaInv);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        ColorDrawable color = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(color);
    }

    private void mostrarLista(){
        String[] lista = {"Reglamento", "Recursos del investigador", "Repositorio"};
        ArrayAdapter<String> adapterListaInv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaInv.setAdapter(adapterListaInv);
        listaInv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            switch(position){
                case 0:
                    startActivity(new Intent(Investigacion.this, Reglamento.class));
                    break;
                case 1:
                    startActivity(new Intent(Investigacion.this, RecursosInvestigador.class));
                    break;
                case 2:
                    startActivity(new Intent(Investigacion.this, Repositorio.class));
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Error.", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        });
    }

}