package com.example.darby.proesad;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by darby on 23/04/2015.
 */
public class NavegationAdapter_MenuLateral {// extends BaseAdapter {

     /*

    // Creamos la base Adamter
    //
    private Activity activity;
    ArrayList<item_imagen_MenuLateral> arraytms;


    private NavegationAdapter_MenuLateral(Activity activity,ArrayList<item_imagen_MenuLateral> listarry ){
      super();
        this.activity  = activity;
        this.arraytms = listarry;
      }


    @Override
    public int getCount() {
        return arraytms.size(); // de mi proyectommmmmm
    }

    // para retornar el item objeto del array lista
    @Override
    public Object getItem(int position) {
        return arraytms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    // declaramos la clase estatica la cual representa a la fila
    public static class Fila
    {
        TextView titulo_itm;
        ImageView icono;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fila view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if (convertView == null)
        {
            view = new Fila();
            // creo y lo obtengo del array
            item_imagen_MenuLateral itm = arraytms.get(position);
            convertView = inflator.inflate(R.layout.head_menu_lateral, null);
            convertView = inflator.inflate(R.layout.head_menu_lateral, null);

            // tituloo
            view.titulo_itm=(TextView) convertView.findViewById(R.id.title_item); // title mmmmmmmmmmmm
           view.titulo_itm.setText(itm.getTitulo());
            // icono
            view.icono = (ImageView) convertView.findViewById(R.id.icon);
            view.icono.setImageResource(itm.getIcono());   // seteo el icono
            convertView.setTag(view);
         }
        else
        {
            view =(Fila) convertView.getTag();
        }
        return convertView;
 }
   */




}
