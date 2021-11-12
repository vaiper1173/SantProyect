package Decorador.Auto;

public class Azul extends ColorDecorador {
    Autos.Auto auto;

    public Azul(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 3000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion() + "Pintura Azul = $3,000 \n";
    }
}
