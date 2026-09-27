package org.example;

public class Revista extends Recurso{
    public String editor;
    public int numeroEdicion;
    public String tema;

    public Revista(String titulo, int añoPublicacion, String resumen, String editor, int numeroEdicion, String tema) {
        super(titulo, añoPublicacion, resumen);
        this.editor = editor;
        this.numeroEdicion = numeroEdicion;
        this.tema = tema;
    }
}