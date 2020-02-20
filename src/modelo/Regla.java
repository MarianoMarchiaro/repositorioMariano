/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Mariano
 */
public class Regla {
    private static Regla regla;
    private int precioBase=50;
    private Regla(){}
    
    public static Regla getInstance(){
        if(regla == null){
            regla = new Regla();
        }
        return regla;
    }
    
    public int calcularDias(int cantidadMerc){
        int pesoBase = 200;
        int total = cantidadMerc/pesoBase;
        return total;
    }
    public float calcularTotal(int cantidadMerc){
        int precioBase = 50;
        float total = cantidadMerc * 50 ;
        return total;
    }
}
