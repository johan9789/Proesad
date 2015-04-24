package com.example.darby.proesad;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.Header;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private CharSequence mTitle;

    // menu lateral
       //private  DrawerLayout NavDrawerLayout;
       //private ListView NavList;
       //private String[] titulos;
       //private ArrayList<item_imagen_MenuLateral> NavItms;
       //private TypedArray NavIcons;
       //NavegationAdapter_MenuLateral NavAdapter;
    // fin


  // declaraciones de botones

    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // menu lateral pascual
           //NavDrawerLayout =(DrawerLayout) findViewById(R.id.drawer_layout);
           //NavList = (ListView) findViewById(R.id.list_item);  // es lista mmmmmmmmmmmmmmmmmmm

          // View header = getLayoutInflater().inflate(R.layout.head_menu_lateral, null);
          // NavList.addHeaderView(header);

          // imagenes
           //NavIcons = getResources().obtainTypedArray(R.array.navigation_icons);
           //titulos = getResources().getStringArray(R.array.nav_options);
          // lista de titulos
     //    NavIcons = new ArrayList<item_imagen_MenuLateral>();
          // agregamos objetos
                   // perfil
           //NavItms.add(new item_imagen_MenuLateral(titulos[0], NavIcons.getResourceId(0, -1)));
                  // lugare
           //NavItms.add(new item_imagen_MenuLateral(titulos[1], NavIcons.getResourceId(1, -1)));
           //NavItms.add(new item_imagen_MenuLateral(titulos[2], NavIcons.getResourceId(2, -1)));
           //NavItms.add(new item_imagen_MenuLateral(titulos[3], NavIcons.getResourceId(3, -1)));
          // declaramos ,,,,, seteamos nnuestro adpter
     //    NavAdapter= new NavegationAdapter_MenuLateral(this.NavItms);
           //NavList.setAdapter(NavAdapter);
    // fin


    // comparacion de botones
        btnIngresar =(Button) findViewById(R.id.btnAcademico);

        btnIngresar =(Button) findViewById(R.id.btnDesarrollo);
        btnIngresar =(Button) findViewById(R.id.btnInvestigacion);
        btnIngresar =(Button) findViewById(R.id.btnProesad_B);
        btnIngresar =(Button) findViewById(R.id.btnProyeccionSo);

        actionbar();

    //fin


        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));


    }




     // codigo del mennu princpal no mas
    private void actionbar(){
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable);
        }

     // click del boton ......... cierra tus ojos que a si me gustas mas

    public void onClicAcademico(View view){
        startActivity(new Intent(MainActivity.this,Academico.class));
        }

    public void onClicProySocExt(View view){
        startActivity(new Intent(MainActivity.this,ProyeccionSocial.class));
       }


    public void onClickInvestigacion(View view){
        startActivity(new Intent(MainActivity.this,Investigacion.class));
       }

    public void onClickDesarrolloESP(View view){
        startActivity(new Intent(MainActivity.this,DesarrolloEspiritual.class));
       }

    public void onClickProesadB(View view){
        startActivity(new Intent(MainActivity.this,Proesad_B.class));
        }

     // fin





    @Override
    public void onNavigationDrawerItemSelected(int position) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
