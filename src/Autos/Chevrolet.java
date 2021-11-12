/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autos;

/**
 *
 * @author victo
 */
public class Chevrolet extends Auto{
    public Chevrolet(){
        descripcion = "Autos de Verdad, Gente de Verdad \n";
    }

    @Override
    public double costo() {
        return 5000.0;
    }
    
}
