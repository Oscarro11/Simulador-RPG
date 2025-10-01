package Modelos.Acciones;

import Modelos.Entidades.Combatiente;
import java.util.ArrayList;

public class Status extends Accion{
    private int tipo_status;
    private int duracion;
    private int tipo_activacion;

    public Status(int tipo_status, int duracion, int tipo_activacion){
        super();

        this.tipo_status = tipo_status;
        this.duracion = duracion;
        this.tipo_activacion = tipo_activacion;

        String nombre = "";
        int velocidad = 0;
        int intencion = 0;

        switch (tipo_status) {
            case 1:
                nombre = "Dano por veneno";
                velocidad = 1;
                intencion = 2;
                break;
        
            default:
                break;
        }

        super.setNombre(nombre);
        super.setVelocidad(velocidad);
        super.setIntencion(intencion);
    }

    public Accion generarAccionFinDeRonda(Combatiente portador){
        ArrayList<Combatiente> temp = new ArrayList<Combatiente>();
        temp.add(portador);
        return super.generarAccionConObjetivo(portador, temp, 6);
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
