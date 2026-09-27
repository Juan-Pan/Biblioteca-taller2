package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int edad;
    private int idUsuario;
    private List<Recurso> recursosPrestados;

    // constructor
    public Usuario (String nombre, int edad, int idUsuario, List<Recurso> recursosPrestados) {
        this.nombre = nombre;
        this.edad = edad;
        this.idUsuario = idUsuario;
        this.recursosPrestados = new ArrayList<>();
    }

    // getters and setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int Edad){
        this.edad = edad;
    }

    public int getIdusuario(){
        return idUsuario;
    }
    public void SetidUsuario(int idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public List<Recurso> getRecursosPrestados(){
        return recursosPrestados;
    }

    public void setRecursosPrestados(List<Recurso> recursosPrestados){
        this.recursosPrestados = recursosPrestados;
    }

    //metodos
    public void agregarRecurso(Recurso recurso)
    {
        recursosPrestados.add(recurso);
    }
    public boolean quitarRecurso(Recurso recurso)
    {
        return recursosPrestados.remove(recurso);
    }
}

