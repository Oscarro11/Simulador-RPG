package Modelos.Entidades.Enemigos;

import Modelos.Acciones.HabilidadEnemiga;

public class Witch extends Enemigo {
    
    public Witch(String nombre){
        super(nombre, 250, 10, 10, 15);
    }

    protected Witch(String nombre, int factor_crecimiento){
        super(nombre, 250 * factor_crecimiento, 10 * factor_crecimiento, 10 * factor_crecimiento, 15 * factor_crecimiento);
    }
}
