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
import modelo.*;
import vista.*;

/**
 *
 * @author Mariano
 */
public class ControladorListaPedidos implements ActionListener{
    private VentanaListaPedidos vistaPedidos;
    private RepositorioPedido repoPedido;
    private RepositorioTicket repoTicket = new RepositorioTicket();
    public ControladorListaPedidos(){
        vistaPedidos = new VentanaListaPedidos();
        vistaPedidos.ejecutar();
        vistaPedidos.setControlador(this);
        repoPedido = new RepositorioPedido();
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaPedidos.ESTADO_NOPAGADO)){
            EstadoPedido estado = EstadoPedido.NO_PAGADO;
            vistaPedidos.cargarTabla(estado);
        }
        if(e.getActionCommand().equals(vistaPedidos.ESTADO_PAGADO)){
            EstadoPedido estado = EstadoPedido.PAGADO;
            vistaPedidos.cargarTabla(estado);
        }
        if(e.getActionCommand().equals(vistaPedidos.ESTADO_ENPROCESO)){
            EstadoPedido estado = EstadoPedido.EN_PROCESO;
            vistaPedidos.cargarTabla(estado);
        }
        if(e.getActionCommand().equals(vistaPedidos.ESTADO_PARARETIRAR)){
            EstadoPedido estado = EstadoPedido.PARA_RETIRAR;
            vistaPedidos.cargarTabla(estado);
        }
        if(e.getActionCommand().equals(vistaPedidos.ESTADO_FINALIZADO)){
            EstadoPedido estado = EstadoPedido.FINALIZADO;
            vistaPedidos.cargarTabla(estado);
        }
        if(e.getActionCommand().equals(vistaPedidos.BOTON_BUSCAR)){
            int numero = vistaPedidos.cargarNumero();
            vistaPedidos.cargarTabla(numero);
        }
        if(e.getActionCommand().equals(vistaPedidos.BOTON_INGRESOTRANSPORTE)){
            
            int numero = vistaPedidos.jTable1.getSelectedRow();
            Pedido pedido = repoPedido.getPedidos().get(numero);
            if(pedido.getEstado().toString().equals(EstadoPedido.PAGADO.toString())){
            ControladorGestionIngresoTransporte controlador = new ControladorGestionIngresoTransporte(pedido, vistaPedidos,repoTicket);
            }else{
            JOptionPane.showMessageDialog(vistaPedidos,"Elija un pedido con estado Pagado");
        }
        }
        if(e.getActionCommand().equals(vistaPedidos.BOTON_EGRESOTRANSPORTE)){
            int numero = vistaPedidos.jTable1.getSelectedRow();
            Pedido pedido = repoPedido.getPedidos().get(numero);
            repoTicket.añadirPedidos(repoPedido);
            ControladorGestionarEgresoTransporte controlador = new ControladorGestionarEgresoTransporte(pedido,repoTicket,repoPedido);
            
        }
    }
    public Ticket conseguirTicket(Pedido pedido,ArrayList<Ticket> tickets){
        Ticket ticket = new Ticket();
        for(int i=0; i<tickets.size()-1;i++){
            if(pedido.getNumero() == tickets.get(i).getPedido().getNumero()){
                ticket = tickets.get(i);
            }
        }
        return ticket;
    }
}
