package Decorador.Auto;

public class ChaMagnesio extends ChasisDecorador {
    Autos.Auto auto;

    public ChaMagnesio(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 45000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion()+ "Chasis de Magnesio = $45,000 \n";
    }
}
