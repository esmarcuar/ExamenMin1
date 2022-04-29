package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String id;
    private String fecha;
    private String correo;
    private String contraseña;
    private int saldo=50;

    private List<Objeto>objetoUsuario=new ArrayList<>();

    public Usuario(String nombre, String apellidos, String fecha, String correo, String contraseña, String id, int saldo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fecha=fecha;
        this.correo=correo;
        this.contraseña=contraseña;
        this.saldo=saldo;
        this.id= this.id;
    }

    public Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Objeto> getObjetoUsuario() {
        return objetoUsuario;
    }

    public void setObjetoUsuario(List<Objeto> objetoUsuario) {
        this.objetoUsuario = objetoUsuario;
    }
}
