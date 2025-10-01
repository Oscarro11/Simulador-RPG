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

    public Accion(String nombre, int velocidad, int intencion, int tipo, Combatiente emisor, ArrayList<Combatiente> recipientes){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.emisor = emisor;
        this.recipientes = recipientes;

        ArrayList<Integer> array_intencion = new ArrayList<Integer>();
        array_intencion.add(intencion);
        this.intencion = array_intencion;
    }

    protected Accion(String nombre, int velocidad, ArrayList<Integer> intencion){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.intencion = intencion;
    }

    protected Accion(String nombre, int velocidad, int intencion){
        this.nombre = nombre;
        this.velocidad = velocidad;

        ArrayList<Integer> array_intencion = new ArrayList<Integer>();
        array_intencion.add(intencion);
        this.intencion = array_intencion;
    }

    protected Accion(){}

    protected Accion generarAccionConObjetivo(Combatiente emisor, ArrayList<Combatiente> recipientes, int tipo){
        return new Accion(nombre, velocidad, intencion, tipo, emisor, recipientes);
    }

    public Combatiente getEmisor() {
        return emisor;
    }
    public ArrayList<Integer> getIntencion() {
        return intencion;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Combatiente> getRecipientes() {
        return recipientes;
    }
    public int getTipo() {
        return tipo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setIntencion(ArrayList<Integer> intencion) {
        this.intencion = intencion;
    }
    public void setIntencion(int intencion) {
        ArrayList<Integer> array_intencion = new ArrayList<Integer>();
        array_intencion.add(intencion);
        this.intencion = array_intencion;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
