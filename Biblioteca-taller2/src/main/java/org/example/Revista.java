package org.example;

public class Revista extends Recurso{
    private String editor;
    private int numeroEdicion;
    private String tema;

    public Revista(String titulo, int añoPublicacion, String resumen, String editor, int numeroEdicion, String tema) {
        super(titulo, añoPublicacion, resumen);
        this.editor = editor;
        this.numeroEdicion = numeroEdicion;
        this.tema = tema;
    }
    // getters and setters
    public int getNumeroEdicion(){
        return numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion)
    {
        this.numeroEdicion = numeroEdicion;
    }

    public String getEditor(){
        return editor;
    }

    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getTema(){
        return tema;
    }
    public void setTema(String tema){
        this.tema = tema;
    }
}