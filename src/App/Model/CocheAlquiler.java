package App.Model;

import java.util.ArrayList;

public class CocheAlquiler extends Coche{

    float precioDia;
    ArrayList<Uso> usos;

    public CocheAlquiler() {
    }

    public CocheAlquiler(String codigo, String marca, String modelo, float precioDia, ArrayList<Uso> usos) {
        super(codigo, marca, modelo);
        this.precioDia = precioDia;
        this.usos = usos;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public ArrayList<Uso> getUsos() {
        return usos;
    }

    public void setUsos(ArrayList<Uso> usos) {
        this.usos = usos;
    }
}
