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
public abstract class Auto {
    String descripcion = "";
    
    public abstract double costo();
    
    public String tomarDescripcion(){
        return descripcion;
    }
    
    public void prepararplanos(String marca) {
        System.out.println("Preparando los planos de " + marca + "\n");
    }

    public void material(String marca) {
        System.out.println("Preprando materiales para " + marca + "\n");
    }

    public void seleccionado(String marca) {
        System.out.println("Seleccionado piezas para " + marca + "\n");
    }
    
}
