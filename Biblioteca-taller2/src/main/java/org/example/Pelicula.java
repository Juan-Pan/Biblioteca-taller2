package org.example;

public class Pelicula extends Recurso {
    public String director;
    public int duracion;
    public String genero;

    public Pelicula(String titulo, int añoPublicacion, String resumen, String director, int duracion, String genero) {
        super(titulo, añoPublicacion, resumen);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }
}
