package com.example.darby.proesad;

/**
 * Created by User on 11/05/2015.
 */
public class OSub_DesarrolloEspiritual {

    private String titulo;
    private String descripcion;
    private int iconID;

    public OSub_DesarrolloEspiritual(String titulo, String descripcion, int iconID) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.iconID = iconID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIconID() {
        return iconID;
    }
}
