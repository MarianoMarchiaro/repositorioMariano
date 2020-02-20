/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;
/**
 *
 * @author Mariano
 */
public class ControladorGestionarEgresoTransporte implements ActionListener{
    private EgresoTicket vistaEgreso;
    private RepositorioTicket repoTicket;
    private Ticket ticket;
    private Pedido pedido;
    private RepositorioPedido pedidos;
    
    
    public ControladorGestionarEgresoTransporte(Pedido pedido,RepositorioTicket repoTicket,RepositorioPedido repoPedido){ 
        vistaEgreso = new EgresoTicket();
        vistaEgreso.ejecutar();
        vistaEgreso.setControlador(this);
        //this.ticket = vistaEgreso.cargarTicket();
        this.pedido = pedido;
        this.repoTicket= repoTicket;
        vistaEgreso.repoTicket=repoTicket;
        //vistaEgreso.cargarTabla(repoTicket);
        pedidos   = repoPedido;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaEgreso.BOTON_CONFIRMAR)){
            Ticket ticket = new Ticket();
            repoTicket.añadirPedidos(pedidos);
            //ticket = vistaEgreso.cargarTicket();
            //if(ticket.getCantidadBinesIngreso() == vistaEgreso.getCantidadBinesSalida()){
            GestorGestionEgresoTransporte gestor = new GestorGestionEgresoTransporte(ticket,vistaEgreso,repoTicket,pedidos);
            SalidaTicketEgreso salidaEgreso = new SalidaTicketEgreso();
            salidaEgreso.ejecutar();
            //}else{
               
            
        }
    }
    
    
    
}
