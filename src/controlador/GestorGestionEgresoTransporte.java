/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;
import vista.*;
/**
 *
 * @author Mariano
 */
public class GestorGestionEgresoTransporte {
    private RepositorioTicket repoTicket;
    private Ticket ticket;
    private Pedido pedido;
    private EgresoTicket ventanaEgreso;
    private RepositorioPedido repoPedido;
    
    public GestorGestionEgresoTransporte(Ticket ticket,EgresoTicket ventanaEgreso,RepositorioTicket repoTicket,RepositorioPedido repoPedido){
        this.ticket = ticket;
        this.pedido = ticket.getPedido();
        this.repoTicket= repoTicket;
        this.ventanaEgreso= ventanaEgreso;
        this.repoPedido = repoPedido;
    }
    
    public void ingresar(float pesoEgreso,int cantidadBinesEgreso,String observaciones2){
        ticket.setObservaciones2(observaciones2);
        ticket.setPesoSalida(pesoEgreso);
        ticket.setCantidadBinesSalida(cantidadBinesEgreso);
        ticket.getPedido().setEstado(EstadoPedido.FINALIZADO);
        repoPedido.cargarPedido(ticket.getPedido());
        repoTicket.guardarTicket(ticket);
    }
}
