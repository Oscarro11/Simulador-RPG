package Modelos.Acciones;

import java.util.ArrayList;


public class HabilidadEnemiga extends Accion{
    
    public HabilidadEnemiga(String nombre, int velocidad, ArrayList<Integer> intencion, int potencia, int forma_activacion, int cantidad_activacion){
        super(nombre, velocidad, intencion);
    }

    public HabilidadEnemiga(String nombre, int velocidad, int intencion, int potencia, int forma_activacion, int cantidad_activacion){
        super(nombre, velocidad, intencion);
    }

}
