package com.example.darby.proesad;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private CharSequence mTitle;
    private Button btnIngresar;
    private Button btnFacebook;
    private Button btnGoogle;
    private Button btnTwitter;
    private Button btnYoutube;
    private Button btnSkype;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();
        actionbar();

        mTitle = getTitle();

        mNavigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mNavigationDrawerFragment.setUp(R.id.navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    private void start(){
        btnIngresar = (Button)findViewById(R.id.btnAcademico);
        btnIngresar = (Button)findViewById(R.id.btnDesarrollo);
        btnIngresar = (Button)findViewById(R.id.btnInvestigacion);
        btnIngresar = (Button)findViewById(R.id.btnProesad_B);
        btnIngresar = (Button)findViewById(R.id.btnProyeccionSo);

        btnFacebook = (Button)findViewById(R.id.btnFacebook);
        btnGoogle = (Button)findViewById(R.id.btnGoogle);
        btnTwitter = (Button)findViewById(R.id.btnTwitter);
        btnYoutube = (Button)findViewById(R.id.btnYoutube);
        btnSkype = (Button)findViewById(R.id.btnSkype);
        goLinks();
    }

    private void goLinks(){
        btnFacebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/proesad.upeu.edu"));
                startActivity(intent);
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://plus.google.com/u/2/115657786865639813183/posts"));
                startActivity(intent);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/proesad"));
                startActivity(intent);
            }
        });
        btnYoutube.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UClYPX9Hc3kwmZM3sAm5n0PQ"));
                startActivity(intent);
            }
        });
        btnSkype.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Codigo del mennu princpal COLOR
     */
    private void actionbar(){
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#3E87B2"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }
    // click del boton .........
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
        fragmentManager.beginTransaction().replace(R.id.container, PlaceholderFragment.newInstance(position + 1)).commit();
    }

    public void onSectionAttached(int number){
        switch (number){
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

    public void restoreActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        if(!mNavigationDrawerFragment.isDrawerOpen()){
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment(){}

        public static PlaceholderFragment newInstance(int sectionNumber){
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity){
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(getArguments().getInt(ARG_SECTION_NUMBER));
        }

    }

}