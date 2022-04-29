package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class Objeto {
    private String nombre;
    private String descripcion;
    private int coins;
    private List<Usuario>listaUsuario = new ArrayList<>();

    public Objeto( String nombre, String descripcion, int coins){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.coins=coins;
        this.listaUsuario=listaUsuario;
    }

    public Objeto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}


