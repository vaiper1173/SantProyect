/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador.Auto;

import Autos.Chevrolet;

public class MGasolina extends MotorDecorador{    
    Autos.Auto auto;

    public MGasolina(Autos.Auto auto){
        this.auto = auto;
    }

    @Override
    public double costo() {
        return 200000.0 + auto.costo();
    }
    
    @Override
    public String tomarDescripcion() {
        return auto.tomarDescripcion()+ "Motor a Gasolina = $200,000\n";
    }
    
}
