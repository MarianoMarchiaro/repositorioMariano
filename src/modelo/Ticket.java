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
public class Ticket {
    private Pesaje pes = new Pesaje();
    private EmpresaTransporte et = new EmpresaTransporte();
    private Transportista transportista = new Transportista();
    private Acoplado acoplado = new Acoplado();
    private Transporte transporte = new Transporte();
    private String observaciones;
    private int cantidadBinesIngreso;
    private int numero;
    private Date fecha;
    private float pesoSalida;
    private int cantidadBinesSalida;
    private String observaciones2;
    private float pesoEntrada;
    private float neto;
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public float getPesoSalida() {
        return pesoSalida;
    }

    public void setPesoSalida(float pesoSalida) {
        this.pesoSalida = pesoSalida;
    }

    public int getCantidadBinesSalida() {
        return cantidadBinesSalida;
    }

    public void setCantidadBinesSalida(int cantidadBinesSalida) {
        this.cantidadBinesSalida = cantidadBinesSalida;
    }

    public String getObservaciones2() {
        return observaciones2;
    }

    public void setObservaciones2(String observaciones2) {
        this.observaciones2 = observaciones2;
    }

    public Pesaje getPes() {
        return pes;
    }

    public void setPes(Pesaje pes) {
        this.pes = pes;
    }

    public EmpresaTransporte getEt() {
        return et;
    }

    public void setEt(EmpresaTransporte et) {
        this.et = et;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCantidadBinesIngreso() {
        return cantidadBinesIngreso;
    }

    public void setCantidadBinesIngreso(int cantidadBinesIngreso) {
        this.cantidadBinesIngreso = cantidadBinesIngreso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    public Ticket(){
       Date fecha = new Date();
    }
    public void asociar(Pesaje pes, EmpresaTransporte et,int cantidad,String observaciones){
        
        this.pes = pes;
        this.et=et;
        this.cantidadBinesIngreso=cantidad;
        this.observaciones=observaciones;
    }

    public Ticket(EmpresaTransporte et, String observaciones, int cantidadBinesIngreso, int numero, Date fecha,String NombreConductor, int dniConductor,String PatenteChasis, String patenteAcoplado, float neto, float pesoEntrada,float tara,float bruto){
        this.et = et;
        this.observaciones = observaciones;
        this.cantidadBinesIngreso = cantidadBinesIngreso;
        this.numero = numero;
        this.fecha = fecha;
        this.neto = neto;
        this.acoplado.setPatenteAcoplado(patenteAcoplado);
        this.transporte.setPatenteChasis(PatenteChasis);
        this.transportista.setNombre(NombreConductor);
        this.transportista.setDni(dniConductor);
        this.pesoEntrada = pesoEntrada;
        this.transporte.setTARA(tara);
        this.pes.setPesoBruto(bruto);
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public Acoplado getAcoplado() {
        return acoplado;
    }

    public void setAcoplado(Acoplado acoplado) {
        this.acoplado = acoplado;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public float getPesoEntrada() {
        return pesoEntrada;
    }

    public void setPesoEntrada(float pesoEntrada) {
        this.pesoEntrada = pesoEntrada;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }
    
    public void asignar(EmpresaTransporte empresa,int cantidadBinesIngreso,Acoplado acoplado, Pesaje pes, Transporte transporte, 
            Transportista conductor,int numero, String observaciones){
        this.setEt(empresa);
        this.setCantidadBinesIngreso(cantidadBinesIngreso);
        this.setFecha(new Date());
        this.setAcoplado(transporte.getAcoplado());
        this.setPes(pes);
        this.setTransporte(transporte);
        this.setTransportista(conductor);
        this.setNumero(numero);
        this.setObservaciones(observaciones);
    }
}
