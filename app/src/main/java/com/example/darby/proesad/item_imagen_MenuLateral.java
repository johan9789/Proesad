package com.example.darby.proesad;

/**
 * Created by darby on 23/04/2015.
 */
public class item_imagen_MenuLateral {

   private String titulo;
    private  int icono;

    public  item_imagen_MenuLateral(String title, int icon){
        this.titulo =title;
        this.icono=icon;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getIcono(){
        return icono;
    }
    public void setIcono(int icono){
        this.icono=icono;
    }

}
