package Modelos.Entidades.Enemigos;

import java.util.ArrayList;

import Modelos.Acciones.HabilidadEnemiga;
import Modelos.Entidades.Combatiente;

public abstract class Enemigo extends Combatiente{
    protected ArrayList<HabilidadEnemiga> habilidades = new ArrayList<HabilidadEnemiga>();

    protected Enemigo(String nombre, int max_vida, int ataque, int defensa, int evasion){
        super(nombre, max_vida, ataque, defensa, evasion);
    }

    protected void addHabilidad(HabilidadEnemiga habilidadEnemiga){
        habilidades.add(habilidadEnemiga);
    }

    /**public Accion usarHabilidad(String nombre_habilidad){
        for (HabilidadEnemiga habilidad : habilidades) {
            if (habilidad.) {
                
            }
        }
    
    }**/

    public ArrayList<HabilidadEnemiga> getHabilidades() {
        return habilidades;
    }
}
