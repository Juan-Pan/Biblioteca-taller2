package org.example;

public class Libro extends Recurso{
    public String autor;
    public int numeroPaginas;
    public String genero;


    public Libro(String titulo, int añoPublicacion, String resumen, String autor, int numeroPaginas, String genero) {
        super(titulo, añoPublicacion, resumen);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }
    // getters y setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor)
    {
        this.autor= autor;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas (int numeroPaginas)
    {
        this.numeroPaginas= numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}