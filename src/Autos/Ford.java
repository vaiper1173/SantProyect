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
public class Ford extends Auto{
    
    public Ford (){
        descripcion = "Nacidos Fuertes \n";
    }

    @Override
    public double costo() {
        return 5000.0;
    }
    
}
