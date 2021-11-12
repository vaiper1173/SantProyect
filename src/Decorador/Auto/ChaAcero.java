package Decorador.Auto;

public class ChaAcero extends ChasisDecorador {
    Autos.Auto auto;

    public ChaAcero(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 25000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion()+ "Chasis de Acero = $25,000\n";
    }
}
