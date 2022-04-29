package edu.upc.dsa;

import edu.upc.dsa.models.Compra;
import edu.upc.dsa.models.Objeto;
import edu.upc.dsa.models.Usuario;
import org.apache.log4j.Logger;

import java.util.*;

public class GameManagerImpl implements GameManager {

    HashMap<String, String> listausuarios = new HashMap<String, String>();
    List<Objeto> listaobjetos = new LinkedList<>();
    Queue<Compra> cuaCompra= new LinkedList<Compra>();
    static final Logger logger = Logger.getLogger(GameManagerImpl.class.getName());
    private static GameManagerImpl manager;

    //Singleton
    public static GameManagerImpl getInstance() {
        if (manager == null) {
            manager = new GameManagerImpl();
        }
        return manager;
    }

    public GameManagerImpl() {
    }


    @Override
    public void addUsuario(String nombre, String apellidos, String fecha, String correo, String contraseña, String id, int saldo, List<Objeto> objetoUsuario) {
        Usuario usuario = new Usuario(nombre, apellidos, fecha, correo, contraseña, id, saldo);
        listausuarios.put(correo, contraseña);
        logger.info("S'ha afegit un nou usuari: " + usuario.getNombre() + " " + usuario.getId() + " " + usuario.getApellidos() + " " + usuario.getFecha() + " " + usuario.getCorreo() + " " + usuario.getContraseña() + " " + usuario.getSaldo() + "" + usuario.getObjetoUsuario());

    }

    @Override
    public List<Usuario> listaUsuariosOrdenados() {
        List<Usuario> r = new LinkedList<>(listausuarios.values());
        Collections.sort(r, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                if (o1.getApellidos() != o2.getApellidos()) {
                    return o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
                }
            });
        }
        logger.info("Llista ordenada alfabeticament: "+r.toString())
        );
        return r;
    }
    @Override
    public void addObjeto(Objeto objeto) {
    this.listaobjetos.add(objeto);
    }

    @Override
    public List<Objeto> listaObjetosOrdenados() {
        List<Objeto> resultado = new LinkedList<>(this.listaobjetos);

        Collections.sort(resultado, new Comparator<Objeto>() {
            @Override
            public int compare(Objeto p1, Objeto p2) {
                return Integer.compare(p1.getCoins(), p2.getCoins());
            }
        });
        Collections.reverse(resultado);
        logger.info("Lista de objetos ordenados por precio (descendente): " + resultado.toString());
        return resultado;
    }

    @Override
    public void realizarCompra(String UserId, Compra compra) {
    compra.setUser(compra);
    this.cuaCompra.add(compra);
    }

    @Override
    public List<Usuario> listaObjetosUsuarios(String UsuarioId) {
        Objeto objeto = getObjetoByName(UsuarioId);
        return objeto.getListaUsuario();
    }

    @Override
    public void clear() {
        listaobjetos.clear();
        listausuarios.clear();
    }

    @Override
    public String getUserByName(String nombre) {
        String usuario = this.listausuarios.get(nombre);
        return usuario;
    }

    @Override
    public Objeto getObjetoByName(String nombre) {
        Objeto obt=null;
        for(Objeto objeto: this.listaobjetos){
            if(objeto.getNombre().compareTo(String.valueOf(obt))==0){
                obt=objeto;
            }
        }
        return obt;
    }
    }
}


