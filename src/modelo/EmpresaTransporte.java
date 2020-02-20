/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Mariano
 */
public class EmpresaTransporte {
    private String nombre;
    private Transportista transportista;
    private Transporte transporte;
    private ArrayList<Transportista> transportistas;

    public EmpresaTransporte() {
    }
    private ArrayList<Transporte> transportes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public ArrayList<Transportista> getTransportistas() {
        return transportistas;
    }

    public void setTransportistas(ArrayList<Transportista> transportistas) {
        this.transportistas = transportistas;
    }

    public ArrayList<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(ArrayList<Transporte> transportes) {
        this.transportes = transportes;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public EmpresaTransporte(String nombre, ArrayList<Transportista> transportistas, ArrayList<Transporte> transportes) {
        this.nombre = nombre;
        this.transportistas = transportistas;
        this.transportes = transportes;
    }

    
    
    public EmpresaTransporte(String nombre, String nombreConductor, int dniConductor,String patenteChasis, String patenteAcoplado, float tara,int pesoNeto,TipoProducto producto) {
        this.nombre = nombre;
        transportista.setNombre(nombreConductor);
        transportista.setDni(dniConductor);
        transporte.setPatenteChasis(patenteChasis);
        transporte.setTARA(tara);
        //transporte.asignarAcoplado(patenteAcoplado,pesoNeto,producto);
    }
    public Acoplado buscarAcoplado(){
        Acoplado acoplado;
        return acoplado = transporte.getAcoplado();
    }
    
}
