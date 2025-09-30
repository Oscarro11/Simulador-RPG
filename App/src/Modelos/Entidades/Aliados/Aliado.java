package Modelos.Entidades.Aliados;

import Modelos.Entidades.Combatiente;
import Modelos.Entidades.Aliados.Inventario;
import Modelos.Acciones.Accion;
import java.util.ArrayList;

import Modelos.Acciones.Tecnica;

public abstract class Aliado extends Combatiente{
    protected Inventario inventario = new Inventario();
    protected ArrayList<Tecnica> lista_tecnicas = new ArrayList<Tecnica>();
    protected int max_mana;
    protected int mana; 

    public Aliado(String nombre, int max_vida, int ataque, int defensa, int evasion, int max_mana){
        super(nombre, max_vida, ataque, defensa, evasion);
        this.max_mana = max_mana;
        this.mana = max_mana;
    }

    protected void gastarMana(int cantidad_mana){
        mana = Math.max(0, mana - cantidad_mana);
    }

    public void recuperarMana(int cantidad_mana){
        mana = Math.min(max_mana, mana + cantidad_mana);
    }

    @Override
    public String toString(){
        String msj = super.toString();

        StringBuilder temporal_msj = new StringBuilder(msj);
        int insert_index = temporal_msj.indexOf("- C");
        temporal_msj.insert(insert_index, "- Mana: " + mana + "/" + max_mana + "\n");
        msj = temporal_msj.toString();

        return msj;
    }

    //public Accion usarObjeto(String nombre_objeto, ArrayList<Combatiente> objetivos){}
    //public Accion usarTecnica(String nombre_tecnica, ArrayList<Combatientes> objetivos){}
    //protected Tecnica buscarTecnica(String nombre_tecnica){}
    //public verificarGastoMana(String nombre_tecnica){}

    public int getMana() {
        return mana;
    }
    public int getMax_mana() {
        return max_mana;
    }
    public ArrayList<Tecnica> getLista_tecnicas() {
        return lista_tecnicas;
    }
    public Inventario getInventario() {
        return inventario;
    }
}
