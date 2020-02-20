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
public class Acoplado {
    private String patenteAcoplado;
    //private Producto producto;

    public Acoplado() {
    }

    public String getPatenteAcoplado() {
        return patenteAcoplado;
    }

    public void setPatenteAcoplado(String patenteAcoplado) {
        this.patenteAcoplado = patenteAcoplado;
    }

   /* public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }*/

    public Acoplado(String patenteAcoplado) {
        this.patenteAcoplado = patenteAcoplado;
        //this.producto = producto;
    }
    
    /*public void asignar(int pesoNeto,EstadoProducto producto){
        this.producto.setNeto(pesoNeto);
        this.producto.setEstado(producto);        
    }*/
    
}
