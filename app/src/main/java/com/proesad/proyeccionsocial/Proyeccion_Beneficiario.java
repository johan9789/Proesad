package com.proesad.proyeccionsocial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.darby.proesad.R;

/**
 * Created by darby on 29/04/2015.
 */
public class Proyeccion_Beneficiario extends Fragment {

    View rootView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.proyeccion_beneficiarios,container,false);
        return rootView;


    }

}
