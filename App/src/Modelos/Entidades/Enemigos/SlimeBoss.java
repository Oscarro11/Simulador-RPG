package Modelos.Entidades.Enemigos;

import Modelos.Acciones.HabilidadEnemiga;

public class SlimeBoss extends Slime{
    
    public SlimeBoss(String nombre){
        super(nombre, 2);

        //super.addHabilidad(new HabilidadEnemiga("Disolver Items", vida, evasion, defensa, ataque, vida));
    }

}
