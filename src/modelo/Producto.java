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
public class Producto {
    private double neto;
    private TipoProducto estado;

    public Producto() {
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public TipoProducto getEstado() {
        return estado;
    }

    public void setEstado(TipoProducto estado) {
        this.estado = estado;
    }

    public Producto(double neto, TipoProducto estado) {
        this.neto = neto;
        this.estado = estado;
    }
    
}
