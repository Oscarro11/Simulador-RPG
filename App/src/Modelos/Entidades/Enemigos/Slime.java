package Modelos.Entidades.Enemigos;

import Modelos.Acciones.HabilidadEnemiga;

public class Slime extends Enemigo{

    public Slime(String nombre){
        super(nombre, 300, 30, 20, 10);

        super.addHabilidad(new HabilidadEnemiga("Division", 3, 9, 0, 3, 1));
    }

    protected Slime(String nombre, int factor_crecimiento){
        super(nombre, 300 * factor_crecimiento, 30 * factor_crecimiento, 20 * factor_crecimiento, 10);

        super.addHabilidad(new HabilidadEnemiga("Division", 3, 9, 0, 3, 1));
    }
}
