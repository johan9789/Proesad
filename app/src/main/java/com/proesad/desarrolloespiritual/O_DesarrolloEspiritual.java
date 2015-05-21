package com.proesad.desarrolloespiritual;

/**
 * Created by User on 11/05/2015.
 */
public class O_DesarrolloEspiritual {

    private String titulo;
    private int iconID;

    public O_DesarrolloEspiritual(String titulo, int iconID) {
        this.titulo = titulo;
        this.iconID = iconID;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIconID() {
        return iconID;
    }
}
