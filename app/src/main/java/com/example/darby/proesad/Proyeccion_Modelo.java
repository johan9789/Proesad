package com.example.darby.proesad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by darby on 29/04/2015.
 */
public class Proyeccion_Modelo extends Fragment {

    View rootView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.proyeccion_modelo,container,false);
        return rootView;



    }


}

