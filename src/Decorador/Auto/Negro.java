package Decorador.Auto;

import Autos.Chevrolet;


public class Negro extends ColorDecorador{
    Autos.Auto auto;

    public Negro(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 1900.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion() + "Pintura Negra = $1,900\n";
    }
}
