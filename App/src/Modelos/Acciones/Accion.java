package Modelos.Acciones;

import Modelos.Entidades.Combatiente;
import java.util.ArrayList;

public class Accion {
    protected String nombre;
    protected int velocidad;
    protected ArrayList<Integer> intencion;
    protected int tipo;
    protected Combatiente emisor;
    protected ArrayList<Combatiente> recipientes;

    public Accion(String nombre, int velocidad, ArrayList<Integer> intencion, int tipo, Combatiente emisor, ArrayList<Combatiente> recipientes){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.intencion = intencion;
        this.tipo = tipo;
        this.emisor = emisor;
        this.recipientes = recipientes;
    }
}
