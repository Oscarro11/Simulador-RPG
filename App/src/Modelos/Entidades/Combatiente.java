package Modelos.Entidades;

import java.util.ArrayList;
import Modelos.Acciones.Status;

public abstract class Combatiente {
    protected String nombre;
    protected int max_vida;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int evasion;
    protected ArrayList<Status> lista_status = new ArrayList<Status>();

    protected Combatiente(String nombre, int max_vida, int ataque, int defensa, int evasion){
        this.nombre = nombre;
        this.max_vida = max_vida;
        this.vida = max_vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.evasion = evasion;
    }

    public boolean recibirDano(int dano){
        vida = vida - dano;
        return vida <= 0;
    }

    public void recibirCuracion(int curacion){
        vida = Math.min(max_vida, vida + curacion);
    }

    public void recibirBuff(ArrayList<Integer> atributos, int cantidad){
        for (Integer atributo : atributos) {
            switch (atributo) {
                case 4:
                    ataque += cantidad;
                    break;
            
                case 5:
                    defensa += cantidad;
                    break;

                case 6:
                    evasion += cantidad;
                    break;

                default:
                    break;
            }
        }
    }

    public boolean agregarStatus(Status nuevo_Status){
        for (Status status : lista_status) {
            if (status.getTipo_status() == nuevo_Status.getTipo_status()) {
                return false;
            }
        }
        lista_status.add(nuevo_Status);
        return true;
    } 

    public boolean removerStatus(int tipo_status){
        for (Status status : lista_status) {
            if (status.getTipo_status() == tipo_status) {
                lista_status.remove(status);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String msj = "- Name: " + nombre + "\n" +
                    "- HP: " + vida + "/" + max_vida + "\n" +
                    "- Attack: " + ataque + "\n" +
                    "- Defense: " + defensa + "\n" +
                    "- Evasion: " + evasion + "\n" +
                    "- Current Status: ";

        int cont_status = 0;
        for (Status status : lista_status) {
            String tipo_status = "";
            switch (status.getTipo_status()) {
                case 1:
                    tipo_status = "Posioned";
                    break;
            
                case 2:
                    tipo_status = "Revitalized";
                    break;

                default:
                    break;
            }
            cont_status += 1;
            msj += "\n    * " + tipo_status;
        }

        if (cont_status == 0) {
            msj += "None";
        }

        return msj;
    }


    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getEvasion() {
        return evasion;
    }
    public ArrayList<Status> getLista_status() {
        return lista_status;
    }
    public int getMax_vida() {
        return max_vida;
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
}
