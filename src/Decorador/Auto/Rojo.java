package Decorador.Auto;

public class Rojo extends ColorDecorador{
    Autos.Auto auto;

    public Rojo(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 2000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion() + "Pintura Roja = $2,000\n";
    }
}
