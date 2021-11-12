package Decorador.Auto;

public class Plata extends ColorDecorador{
    Autos.Auto auto;

    public Plata(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 1000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion() + "Pintura Plateada = $1,000\n";
    }

}
