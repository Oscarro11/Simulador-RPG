package Modelos.Entidades.Enemigos;

public class Golem extends Enemigo{
    
    public Golem(String nombre){
        super(nombre, 800, 10, 30, 5);
    }

    protected Golem(String nombre, int factor_crecimiento){
        super(nombre, 800 * factor_crecimiento, 10 * factor_crecimiento, 30 * factor_crecimiento, 5);
    }

}
