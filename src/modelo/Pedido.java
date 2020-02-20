/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mariano
 */
public class Pedido {
    private int numero;
    private int cantidadMercaderia;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private float total;
    private Cliente cliente;
    private Producto producto;
    private Seleccion seleccion;
    private EstadoPedido estado;

    public Pedido(int numero, int cantidadMercaderia, Date fechaRegistro, Date fechaEntrega, Cliente cliente, Producto producto,EstadoPedido estado) {
        this.numero = numero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.producto = producto;
        this.estado = estado;
        this.cantidadMercaderia = cantidadMercaderia;
    }

    public Pedido() {

    }

    public int getCantidadMercaderia() {
        return cantidadMercaderia;
    }

    public void setCantidadMercaderia(int cantidadMercaderia) {
        this.cantidadMercaderia = cantidadMercaderia;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
   /* public float calcularTotal(int cantidadMercaderia,Date fechaRegistro,Date fechaEntrega){
        Calendar inicio = Calendar.getInstance();
        inicio.setTime(fechaRegistro);
        Calendar fin = Calendar.getInstance();
        fin.setTime(fechaEntrega);
        int diasDiferencia = -1;
        while(inicio.before(fin)||inicio.equals(fin)){
            diasDiferencia++;
            inicio.add(Calendar.DATE,1);
        }
        if()
    }*/   
    
    public Date calcularFechaEntrega(int i,Date fechaRegistro){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(fechaRegistro);
        Calendar fechaEntrega = Calendar.getInstance();
        int j = 0;
        while(j<i){
            fecha.add(Calendar.DATE,1);
            j++;
        }
        fechaEntrega = fecha;
        Date fechaEntregada = new Date(fechaEntrega.YEAR,fechaEntrega.MONTH,fechaEntrega.DATE);
        return fechaEntregada;
    }
}
