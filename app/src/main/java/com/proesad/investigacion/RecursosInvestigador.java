package com.proesad.investigacion;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.darby.proesad.R;

public class RecursosInvestigador extends ActionBarActivity {
    private ListView listaRecursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos_investigador);

        start();
        mostrarRecursos();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recursos_investigador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void start(){
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable1 = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable1);

        listaRecursos = (ListView)findViewById(R.id.listaRecursos);
    }

    private void mostrarRecursos(){
        String[] lista = {"Formato APA", "Bases de datos científicas", "Bibliotecas Electrónicas"};
        ArrayAdapter<String> adapterListaInv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listaRecursos.setAdapter(adapterListaInv);
        listaRecursos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch(position){
                    case 0:
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