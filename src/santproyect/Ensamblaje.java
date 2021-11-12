/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santproyect;

import Decorador.Auto.Azul;
import Decorador.Auto.ChaAcero;
import Decorador.Auto.ChaAluminio;
import Decorador.Auto.ChaMagnesio;
import Decorador.Auto.MElectrico;
import Decorador.Auto.MGNC;
import Decorador.Auto.MGasolina;
import Decorador.Auto.Negro;
import Decorador.Auto.Plata;
import Decorador.Auto.Rojo;

/**
 *
 * @author victo
 */
public class Ensamblaje {
    public static String marca="";
    public static String[] chasisLista = null;
    public static String[] colorLista = null;
    public static String[] motorLista = null;
    Autos.Auto auto;
    public static Autos.Auto DetallesAuto;
    
    public void tomarOrden (String factoryTipo){
        if (factoryTipo.equals("Auto")) {
            System.out.println("Preparando un " + marca);
            
            AutosFactory factory = new AutosFactory();
            auto = factory.hacerAuto(marca);
            
            auto.prepararplanos(marca);
            auto.material(marca);
            auto.seleccionado(marca);
            auto = decorado(chasisLista, colorLista, motorLista);
            
            System.out.println(auto.tomarDescripcion() + "Orden Completada");
            System.out.println("Costo Total: $" + auto.costo());
            DetallesAuto = auto;
        }
    }
    
    public Autos.Auto decorado (String[] chasisLista, String[] colorLista, String[] motorLista){
        for (int i = 0; i < chasisLista.length; i++) {
            String chasis = chasisLista[i];
            if (chasis.equals("Acero")) {
                auto = new ChaAcero(auto);
            }
            else if (chasis.equals("Aluminio")) {
                auto = new ChaAluminio(auto);
            }
            else if (chasis.equals("Magnesio")) {
                auto = new ChaMagnesio(auto);
            }
        }
        
        for (int i = 0; i < colorLista.length; i++) {
            String color = colorLista[i];
            if (color.equals("Azul")) {
                auto = new Azul(auto);
            }
            else if (color.equals("Rojo")) {
                auto = new Rojo(auto);
            }
            else if (color.equals("Plata")) {
                auto = new Plata(auto);
            }
            else if (color.equals("Negro")) {
                auto = new Negro(auto);
            }
        }
        
        for (int i = 0; i < motorLista.length; i++) {
            String motor = motorLista[i];
            if (motor.equals("Electrico")) {
                auto = new MElectrico(auto);
            }
            else if (motor.equals("Gas")) {
                auto = new MGNC(auto);
            }
            else if (motor.equals("Gasolina")) {
                auto = new MGasolina(auto);
            }
        }
        return auto;
    }
}