package Modelos.Acciones;

import Modelos.Entidades.Combatiente;
import java.util.ArrayList;

public class Status{
    private int tipo_status;
    private int duracion;
    private int tipo_activacion;

    public Status(int tipo_status, int duracion, int tipo_activacion){
        this.tipo_status = tipo_status;
        this.duracion = duracion;
        this.tipo_activacion = tipo_activacion;
    }

    public Accion generarAccion(Combatiente portador){
        String nombre = "";
        int velocidad = 0;
        ArrayList<Integer> intencion = new ArrayList<Integer>();

        switch (tipo_status) {
            case 1:
                nombre = "Dano por veneno";
                velocidad = 1;
                intencion.add(2);
                break;
        
            default:
                break;
        }

        ArrayList<Combatiente> recipiente = new ArrayList<Combatiente>();
        recipiente.add(portador);

        return new Accion(nombre, velocidad, intencion, 6, portador, recipiente);
    }

    public int getTipo_status() {
        return tipo_status;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getTipo_activacion() {
        return tipo_activacion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
