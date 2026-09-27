package org.example;

public class Pelicula extends Recurso {
    private String director;
    private int duracion;
    private String genero;

    //contructor
    public Pelicula(String titulo, int añoPublicacion, String resumen, String director, int duracion, String genero) {
        super(titulo, añoPublicacion, resumen);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }
    // getters and setters
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
}
