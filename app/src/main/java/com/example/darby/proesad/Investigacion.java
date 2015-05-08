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

import com.proesad.investigacion.Reglamento;

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
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable1 = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable1);

        listaInv = (ListView)findViewById(R.id.listaInv);
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
                        break;
                    case 2:
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Error.", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

}