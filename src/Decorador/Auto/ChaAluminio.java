/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador.Auto;
/**
 *
 * @author victo
 */
public class ChaAluminio extends ChasisDecorador{
    Autos.Auto auto;

    public ChaAluminio(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 40000.0 + auto.costo();
    }

    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion()+ "Chasis de Aluminio = $40,000\n";
    }
 
}
