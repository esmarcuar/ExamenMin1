package edu.upc.dsa.models;
import java.util.HashMap;


public class Compra {
    private String id;
    private HashMap<Integer,String> listaCompra = null;
    private String userId; //usuari que ha fet la comanda

    public Compra() {}

    public Compra(String id) {
        this.id = id;
        this.listaCompra = new HashMap<Integer,String>();
    }

    public Compra(String id, String userId) {
        this.id = id;
        this.listaCompra = new HashMap<Integer,String>();
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() { return userId; }

    public void setUser(Compra userId) {

        this.userId = String.valueOf(userId); }

    public HashMap<Integer,String> getCompra()  {return listaCompra; }

    public void setCompra(HashMap<Integer,String> pedido) { this.listaCompra = pedido; }

    public void addProduct(int cantidad, String nombre) {
        this.listaCompra.put(cantidad,nombre);
    }
}

