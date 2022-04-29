package edu.upc.dsa;

import edu.upc.dsa.models.Compra;
import edu.upc.dsa.models.Objeto;
import edu.upc.dsa.models.Usuario;

import java.util.List;

public interface GameManager {
    //Añadir usuario
    public void addUsuario(String nombre, String apellidos, String fecha, String correo, String contraseña, String id, int saldo, List<Objeto> objetoUsuario);

    //Listado de usuarios ordenado alfabéticamente
    public List<Usuario> listaUsuariosOrdenados();

    //Añadir nuevo Objeto
    public void addObjeto(Objeto objeto);

    //Listado de Objetos ordenado por precio
    public List<Objeto> listaObjetosOrdenados();

    //Compra de un objeto por un usuario
    public void realizarCompra(String UsuarioId, Compra compra);


    //Listado objetos coprados por un usuario
    public List<Usuario> listaObjetosUsuarios(String UsuarioId);


    //Funciones auxiliares
    public void clear();

    public String getUserByName(String nombre);

    public Objeto getObjetoByName(String nombre);
}







