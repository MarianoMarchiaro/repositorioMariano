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
public class RepositorioEmpresaT {
    private ArrayList<EmpresaTransporte> empresas = new ArrayList<EmpresaTransporte>();
    private ArrayList<Transporte> transportes = new ArrayList<Transporte>();
    private ArrayList<Transportista> transportistas = new ArrayList<Transportista>();
    private ArrayList<Acoplado> acoplados = new ArrayList<Acoplado>();

    public RepositorioEmpresaT() {
        cargarAcoplado();
        cargarTransportistas();
        cargarTransportes();
        cargarEmpresaT();
    }

    public ArrayList<EmpresaTransporte> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<EmpresaTransporte> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(ArrayList<Transporte> transportes) {
        this.transportes = transportes;
    }

    public ArrayList<Transportista> getTransportistas() {
        return transportistas;
    }

    public void setTransportistas(ArrayList<Transportista> transportistas) {
        this.transportistas = transportistas;
    }

    public ArrayList<Acoplado> getAcoplados() {
        return acoplados;
    }

    public void setAcoplados(ArrayList<Acoplado> acoplados) {
        this.acoplados = acoplados;
    }
    
    public void guardarAcoplado(Acoplado acoplado){
        acoplados.add(acoplado);
    }
    public void guardarEmpresa(EmpresaTransporte empresa){
        empresas.add(empresa);
    }
    public void guardarTransporte(Transporte transporte){
        transportes.add(transporte);
    }
    public void guardarTransportista(Transportista transportista){
        transportistas.add(transportista);
    }
    
    public void cargarTransportistas(){
        transportistas.add(new Transportista("Julio Lopez",10256284));
        transportistas.add(new Transportista("Marcos Barraza",12256284));
        transportistas.add(new Transportista("Estaban Quito",11256284));
        transportistas.add(new Transportista("Mario Rosales",13256284));
    }
    public void cargarAcoplado(){
        acoplados.add(new Acoplado("AA456SS"));
        acoplados.add(new Acoplado("AA456CD"));
        acoplados.add(new Acoplado("AA456BB"));
        acoplados.add(new Acoplado("AA125AA"));
        acoplados.add(new Acoplado("AC789SC"));
    }
    
    public void cargarTransportes(){
        transportes.add(new Transporte("VD789FR",4568,acoplados.get(0)));
        transportes.add(new Transporte("FG456LK",4568,acoplados.get(1)));
        transportes.add(new Transporte("VD786MN",4568,acoplados.get(2)));
        transportes.add(new Transporte("AD120CV",4568,acoplados.get(3)));
    }
    public void cargarEmpresaT(){
        empresas.add(new EmpresaTransporte("Tradelog S.A",transportistas,transportes));
        empresas.add(new EmpresaTransporte("El Galgo S.A",transportistas,transportes));
        empresas.add(new EmpresaTransporte("Saeta S.A",transportistas,transportes));
        empresas.add(new EmpresaTransporte("La Nueva Fournier S.A",transportistas,transportes));
    }
}
