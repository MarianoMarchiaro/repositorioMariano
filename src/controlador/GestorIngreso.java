/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;
/**
 *
 * @author Mariano
 */
class GestorIngreso {
    private Ticket ticket;
    private RepositorioPedido repoPedido;    
    private RepositorioEmpresaT repoEmpresa;    
    private RepositorioTicket repoTicket;
    
    public GestorIngreso(RepositorioPedido pedidos,RepositorioEmpresaT repoEmpresas,RepositorioTicket repoTicket){
        this.repoPedido = pedidos;
        this.repoEmpresa=repoEmpresas;
        this.repoTicket= repoTicket;
    }
    
    public Ticket  iniciarGestionTicket(Pedido pedido){
        this.ticket = new Ticket();
        ticket.setPedido(pedido);
        return ticket;
    }
    
    public Ticket ingresarDatosIngreso(Pedido pedido,String nombreEmpresa,String nombreConductor,String patenteChasis,
    String patenteAcoplado,String observaciones,int cantidadBinesIngreso,float pesoBruto, float pesoNeto,float tara){
        Ticket t = new Ticket();
        t.setPedido(pedido);
        Pesaje pes = new Pesaje(pesoBruto);        
        ArrayList<EmpresaTransporte> empresas = new ArrayList<EmpresaTransporte>();
        empresas = repoEmpresa.getEmpresas();
        EmpresaTransporte empresa = new EmpresaTransporte();
        for(EmpresaTransporte c : empresas){
            if(c.getNombre().equals(nombreEmpresa)){
                empresa = c;
            }
        }
        ArrayList<Transportista> conductores = empresa.getTransportistas();
        Transportista conductor = new Transportista();
        for(Transportista c : conductores){
            if(c.getNombre().equals(nombreConductor)){
                conductor = c;
            }
        }
        ArrayList<Transporte> transportes = empresa.getTransportes();
        Transporte transporte = new Transporte();
        for(Transporte c : transportes){
            if(c.getPatenteChasis().equals(patenteChasis)){
                c.setTARA(tara);
                transporte = c;
            }
        }
        t.getPedido().getProducto().setNeto(pesoNeto);
        ArrayList<Ticket> tickets = repoTicket.getTickets();
        int numero= repoTicket.calcularNumero()+1;
        t.asignar(empresa, cantidadBinesIngreso, transporte.getAcoplado(), pes, transporte, conductor, numero, observaciones);
        t.getPedido().setEstado(EstadoPedido.EN_PROCESO);
        repoTicket.guardarTicket(t);
        return t;
    }
    
    public Pedido buscarPedido(int numero){
        RepositorioPedido repoPedido = new RepositorioPedido();
        Pedido pedido = repoPedido.getPedidos().get(numero);
        return pedido;
    }
}
