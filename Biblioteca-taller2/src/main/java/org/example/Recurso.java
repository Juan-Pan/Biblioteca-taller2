package org.example;

public class Recurso {
    public String titulo;
    public int añoPublicacion;
    public String resumen;


    public Recurso(String titulo, int añoPublicacion, String resumen)
    {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.resumen = resumen;
    }
//getters and setters
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAñoPublicacion()
    {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion){
        this.añoPublicacion = añoPublicacion;
    }
}
