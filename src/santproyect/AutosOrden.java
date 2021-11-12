/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santproyect;

/**
 *
 * @author victo
 */
public class AutosOrden implements Comando{
    Ensamblaje ensamblaje;
    String[] chasisLista, colorLista, motorLista;
    String Orden;
    
    public AutosOrden (Ensamblaje ensamblaje, String Orden, String[] chasisLista, String[] colorLista, String[] motorLista){
        this.ensamblaje = ensamblaje;
        this.Orden = Orden;
        this.chasisLista = chasisLista;
        this.colorLista = colorLista;
        this.motorLista = motorLista;
    }

    @Override
    public void Orden() {
        ensamblaje.marca = Orden;
        ensamblaje.chasisLista = this.chasisLista;
        ensamblaje.colorLista = this.colorLista;
        ensamblaje.motorLista = this.motorLista;
        ensamblaje.tomarOrden("Auto");
    }
    
}
