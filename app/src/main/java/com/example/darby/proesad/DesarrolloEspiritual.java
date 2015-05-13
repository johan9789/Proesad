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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by darby on 19/04/2015.
 */
public class DesarrolloEspiritual extends ActionBarActivity {

    private List<O_DesarrolloEspiritual> myList = new ArrayList<O_DesarrolloEspiritual>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout
        setContentView(R.layout.activity_desarrolloespirit);

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

        ArrayAdapter<O_DesarrolloEspiritual> adapter = new MyListAdapter();

        //Configure the list view
        ListView list = (ListView) findViewById(R.id.listViewDesEsp);
        list.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<O_DesarrolloEspiritual> {

        public MyListAdapter(){
            super(DesarrolloEspiritual.this, R.layout.item_view_desarrollo_espiritual, myList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.item_view_desarrollo_espiritual, parent, false);
            }

            O_DesarrolloEspiritual objList = myList.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.icon_desarrollo_espiritual);
            imageView.setImageResource(objList.getIconID());

            TextView titulo = (TextView)itemView.findViewById(R.id.tvTitulo);
            titulo.setText(objList.getTitulo());

            return itemView;
        }
    }

    private void populateDesarrolloEspiritualList() {
        myList.add(new O_DesarrolloEspiritual("PMDE", R.drawable.iglesia));
        myList.add(new O_DesarrolloEspiritual("PCP", R.drawable.globe)); // globe
        myList.add(new O_DesarrolloEspiritual("Guía Espiritual", R.drawable.hojas)); // hojas
    }

    private void registerClickCallback() {

        ListView list = (ListView) findViewById(R.id.listViewDesEsp);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {

                switch (position){
                    case 0:
                        startActivity(new Intent(DesarrolloEspiritual.this, DesarrolloEspiritual_PMDE.class));
                        break;
                    case 1:
                        startActivity(new Intent(DesarrolloEspiritual.this, DesarrolloEspiritual_PCP.class));
                        break;
                    case 2:
                        startActivity(new Intent(DesarrolloEspiritual.this, DesarrolloEspiritual_GuiaEspiritual.class));
                        break;
                }
                //
            }
        });
    }

    View rootview;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_desarrolloespirit, container, false);
        return rootview;
    }

}
