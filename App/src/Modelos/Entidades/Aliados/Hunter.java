package Modelos.Entidades.Aliados;

public class Hunter extends Aliado{
    private int max_NPCAliado = 2;

    public Hunter(String nombre){
        super(nombre, 250, 30, 20, 15, 200);
    }

    public int getMax_NPCAliado() {
        return max_NPCAliado;
    }
}
