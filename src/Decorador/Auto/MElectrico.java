package Decorador.Auto;

public class MElectrico extends MotorDecorador {
    Autos.Auto auto;

    public MElectrico(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 300000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion() + "Motor Electrico = $300,000 \n";
    }
}