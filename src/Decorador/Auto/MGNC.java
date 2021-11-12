package Decorador.Auto;

public class MGNC extends MotorDecorador {
    Autos.Auto auto;

    public MGNC(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 250000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion()+ "Motor de Gas Natural Comprimido = $250,000\n";
    }
    
}
