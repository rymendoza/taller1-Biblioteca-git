package com.mycompany.biblioteca;

public class Libro extends Material {
    
    String autor;
    boolean disponible;
    
    public Libro() {
    }
    
    public Libro(String autor, boolean disponible, String codigo, String titulo, String anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.autor = autor;
        this.disponible = disponible;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}