package org.example;

public class Recurso {
    private String titulo;
    private int añoPublicacion;
    private String resumen;


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
    public String getResumen(){
        return resumen;
    }
    public void setResumen(String resumen){
        this.resumen = resumen;
    }
}
