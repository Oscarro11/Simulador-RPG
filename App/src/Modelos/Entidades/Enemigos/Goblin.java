package Modelos.Entidades.Enemigos;

import Modelos.Entidades.Aliados.Item;
import Modelos.Entidades.Aliados.Aliado;

import java.util.ArrayList;

public class Goblin extends Enemigo{
    ArrayList<Item> Items_robados = new ArrayList<Item>();
    ArrayList<Aliado> Aliados_robados = new ArrayList<Aliado>();

    public Goblin(String nombre){
        super(nombre, 100, 10, 10, 15);
    }

    protected Goblin(String nombre, int factor_crecimiento){
        super(nombre, 100 * factor_crecimiento, 10 * factor_crecimiento, 10 * factor_crecimiento, 15);
    }

}
