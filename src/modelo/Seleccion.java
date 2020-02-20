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
public class Seleccion {
    private double pesoIndustrializacion;
    private double pesoMInterno;
    private double pesoMExterno;

    public Seleccion(double pesoIndustrializacion, double pesoMInterno, double pesoMExterno) {
        this.pesoIndustrializacion = pesoIndustrializacion;
        this.pesoMInterno = pesoMInterno;
        this.pesoMExterno = pesoMExterno;
    }

    public double getPesoIndustrializacion() {
        return pesoIndustrializacion;
    }

    public void setPesoIndustrializacion(double pesoIndustrializacion) {
        this.pesoIndustrializacion = pesoIndustrializacion;
    }

    public double getPesoMInterno() {
        return pesoMInterno;
    }

    public void setPesoMInterno(double pesoMInterno) {
        this.pesoMInterno = pesoMInterno;
    }

    public double getPesoMExterno() {
        return pesoMExterno;
    }

    public void setPesoMExterno(double pesoMExterno) {
        this.pesoMExterno = pesoMExterno;
    }
    
}
