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
import android.widget.Toast;
import com.proesad.investigacion.RecursosInvestigador;
import com.proesad.investigacion.Reglamento;
import com.proesad.investigacion.Repositorio;

public class Investigacion extends ActionBarActivity {
    private ListView listaInv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.investigacion);
        start();
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.investigacion, container, false);
    }

    private void start(){
        listaInv = (ListView)findViewById(R.id.listaInv);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2979FF")));

        mostrarLista();
    }

    private void mostrarLista(){
        String[] lista = {"Reglamento", "Recursos del investigador", "Repositorio"};
        ArrayAdapter<String> adapterListaInv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaInv.setAdapter(adapterListaInv);
        listaInv.setOnItemClickListener(new MyListener());
    }

    class MyListener implements AdapterView.OnItemClickListener {

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

    }

}