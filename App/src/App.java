import Modelos.Acciones.Status;
import Modelos.Entidades.Combatiente;
import Modelos.Entidades.Aliados.*;
import Modelos.Entidades.Enemigos.Goblin;
import Modelos.Entidades.Enemigos.Golem;
import Modelos.Entidades.Enemigos.Slime;
import Modelos.Entidades.Enemigos.Witch;

public class App {
    public static void main(String[] args) throws Exception {
        /**Combatiente mage1 = new Mage("Jaina");
        Combatiente warrior1= new Warrior("Garrosh");
        Combatiente rogue1 = new Rogue("Valeera");
        Combatiente hunter1 = new Hunter("Rexxar");
        Combatiente support1 = new Support("Anduin");

        mage1.agregarStatus(new Status(1, 2, 2));
        mage1.agregarStatus(new Status(2, 3, 3));

        System.out.println(mage1.toString());
        System.out.println("\n\n" + warrior1.toString());
        System.out.println("\n\n" + rogue1.toString());
        System.out.println("\n\n" + hunter1.toString());
        System.out.println("\n\n" + support1.toString());**/

        Combatiente goblin1 = new Goblin("Smeargle");
        Combatiente slime1 = new Slime("Jeff");
        Combatiente witch1 = new Witch("Gruntilda");
        Combatiente golem1 = new Golem("The Defect");

        System.out.println("\n\n" + goblin1.toString());
        System.out.println("\n\n" + slime1.toString());
        System.out.println("\n\n" + witch1.toString());
        System.out.println("\n\n" + golem1.toString());
    }
}
