package com.example.darby.proesad;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by darby on 19/04/2015.
 */
public class ProyeccionSocial extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_proyec_social);

        // IMPLEMENTAMOS MENU PASANTE JEJEJ

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);
        mViewPager.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab = actionBar.newTab().setText("base profesores").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("modelo de informacion").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("beneficiario").setTabListener(this);
        actionBar.addTab(tab);





        // colores instanciando a values color.xml  ========   pascual
       /* ColorDrawable colorDrawable = new ColorDrawable(R.color.verde);
        actionBar.setBackgroundDrawable(colorDrawable); */
 //  ColorDrawable colorDrawable1 = new ColorDrawable(R.color.verde);

          // FLECHA ... luego al manifes para dar privilegios
                         // ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
    }


    private void actionbar(){
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#2979FF"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }

              // clase manejador  3 la cantidad de elementos = pascual
    public class PagerAdapter extends FragmentPagerAdapter {
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }
            public Fragment getItem (int arg0){
                 switch (arg0) {
                   case 0:
                        return new Proyeccion_Base();
                   case 1:
                       return new Proyeccion_Modelo();
                   case 2:
                       return new Proyeccion_Beneficiario();
                   default:
                        return null;
                  }
            }
                public int getCount() {
            return 3;
        }
           }

                                  // llamando a mi vista
         View rootview;
        @Nullable
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
             rootview = inflater.inflate(R.layout.activity_proyec_social, container, false);
             return rootview;
        }


                             //  se genera solo estos metodos  =======   pascual

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
       getSupportActionBar().setSelectedNavigationItem(position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
         mViewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
