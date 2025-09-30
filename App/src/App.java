import Modelos.Acciones.Status;
import Modelos.Entidades.Combatiente;
import Modelos.Entidades.Aliados.*;

public class App {
    public static void main(String[] args) throws Exception {
        Combatiente mage1 = new Mage("Jaina");
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
        System.out.println("\n\n" + support1.toString());
    }
}
