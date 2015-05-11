package com.example.darby.proesad;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11/05/2015.
 */
public class DesarrolloEspiritual_PCP extends ActionBarActivity {

    private List<OSub_DesarrolloEspiritual> myListDE_subitems = new ArrayList<OSub_DesarrolloEspiritual>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pcp);

        // FLECHA ... luego al manifes para dar privilegios
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
        ColorDrawable colorDrawable1 = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable1);

        //Código para insertar la lista: [Pablo]
        populateDesarrolloEspiritualList();
        populateListView();
        registerClickCallback();
    }

    private void populateListView() {
        // Create list of items
        //Build Adapter
        ArrayAdapter<OSub_DesarrolloEspiritual> adapter = new MyListAdapter();
        //Configure the list view
        ListView list = (ListView) findViewById(R.id.listViewPCP);
        list.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<OSub_DesarrolloEspiritual> {

        public MyListAdapter(){
            super(DesarrolloEspiritual_PCP.this, R.layout.subitem_layout_desarrollo_espiritual, myListDE_subitems);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.subitem_layout_desarrollo_espiritual, parent, false);
            }

            OSub_DesarrolloEspiritual objListSubitems = myListDE_subitems.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.iconDE);
            imageView.setImageResource(objListSubitems.getIconID());

            TextView titulo = (TextView)itemView.findViewById(R.id.tvTitulo);
            titulo.setText(objListSubitems.getTitulo());

            TextView descripcion = (TextView)itemView.findViewById(R.id.tvDescripcion);
            descripcion.setText(objListSubitems.getDescripcion());

            return itemView;
        }
    }

    private void populateDesarrolloEspiritualList() {
        myListDE_subitems.add(new OSub_DesarrolloEspiritual("AMIS", "Descripción de Amis...", R.drawable.globe));
        myListDE_subitems.add(new OSub_DesarrolloEspiritual("Teoterapia", "Descripción de teoterapia...", R.drawable.globe));
        myListDE_subitems.add(new OSub_DesarrolloEspiritual("PROESAD TV", "Canal de Youtube...", R.drawable.globe));
        myListDE_subitems.add(new OSub_DesarrolloEspiritual("RIEE", "Descripción de valor...", R.drawable.globe));
    }

    private void registerClickCallback() {

        ListView list = (ListView) findViewById(R.id.listViewPCP);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                OSub_DesarrolloEspiritual subitemClicked = myListDE_subitems.get(position);
                String message = "Clicked " + subitemClicked.getTitulo();
                Toast.makeText(DesarrolloEspiritual_PCP.this, message, Toast.LENGTH_LONG).show();

            }
        });
    }

    View rootview;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.guia_espiritual, container, false);
        return rootview;
    }
}
