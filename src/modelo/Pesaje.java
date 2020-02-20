/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mariano
 */
public class Pesaje {
    private double pesoBruto;

    Pesaje() {
        
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Pesaje(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
    
}
