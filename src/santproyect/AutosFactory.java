/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santproyect;

import Autos.Chevrolet;
import Autos.Ford;

/**
 *
 * @author victo
 */
public class AutosFactory {
    
    public Autos.Auto hacerAuto (String marca) {
        if (marca.equals(null)){
            return null;
        }
        else if (marca.equals("Chevrolet")) {
            return new Chevrolet();
        }
        else if (marca.equals("Ford")) {
            return new Ford();
        }
        return null;
    }
}
