package com.manuelsarante.tarealist;

import android.graphics.drawable.Drawable;

public class DatosList {

    private String titulo;
    private String descripcion;
    private Drawable imagen;

    public DatosList(){

    }

    public DatosList(String titulo, String descripcion, Drawable imagen){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }
}
