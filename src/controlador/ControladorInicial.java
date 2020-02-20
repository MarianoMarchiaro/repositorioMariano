/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.EgresoTicket;
import vista.IngresoTicket;
import vista.VentanaListaPedidos;
import vista.VistaAgregarEMPRESAT;
import vista.VistaInicial;

/**
 *
 * @author Mariano
 */
public class ControladorInicial implements ActionListener {
    private VistaInicial vistaInicial;
    private VentanaListaPedidos vistaListaPedidos;
    private ControladorListaPedidos controlador;
    
    
    public ControladorInicial(){
        vistaInicial = new VistaInicial();
        vistaInicial.setControlador(this);
        vistaListaPedidos = new VentanaListaPedidos();
        vistaInicial.ejecutar();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaInicial.VISTA_LISTAPEDIDO)){
            controlador  = new ControladorListaPedidos();
            
        }
        
    }
    
}
