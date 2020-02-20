/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 *
 * @author Mariano
 */
public class ControladorGestionIngresoTransporte implements ActionListener{
    private IngresoTicket2 vistaIngreso;
    private EgresoTicket vistaEgreso;
    private Pedido pedido;
    private RepositorioPedido repoPedido;
    private VentanaListaPedidos vistaLista;
    private RepositorioEmpresaT repoEmpresa = new RepositorioEmpresaT();
    private RepositorioTicket repoTicket;
    
    
    public ControladorGestionIngresoTransporte(Pedido pedido,VentanaListaPedidos vistaLista,RepositorioTicket repoTicket){
        vistaIngreso = new IngresoTicket2();
        vistaIngreso.iniciar();
        vistaIngreso.setControlador(this);
        this.pedido = pedido;
        repoPedido = new RepositorioPedido();
        vistaIngreso.tomarPedido(pedido);
        this.vistaLista = vistaLista;
        this.repoTicket=repoTicket;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaIngreso.BOTON_AÑADIREMPRESA)){
            ControladorEmpresa controlador = new ControladorEmpresa(repoEmpresa,vistaIngreso);            
        }
        if(e.getActionCommand().equals(vistaIngreso.BOTON_AÑADIRCONDUCTOR)){
            ControladorTransportista controlador = new ControladorTransportista(repoEmpresa,vistaIngreso);
            
        }
        if(e.getActionCommand().equals(vistaIngreso.BOTON_AÑADIRTRANSPORTE)){
            ControladorTransporte controlador = new ControladorTransporte(repoEmpresa,vistaIngreso);
        }
        if(e.getActionCommand().equals(vistaIngreso.BOTON_GUARDAR)){
            GestorIngreso gestor = new GestorIngreso(repoPedido,repoEmpresa,repoTicket);
            if((float)pedido.getCantidadMercaderia() == vistaIngreso.getPesoNeto() && pedido.getEstado().equals(EstadoPedido.PAGADO)){
                if(calcularNeto(vistaIngreso.getPesoBruto(),vistaIngreso.getTARA(),vistaIngreso.getPesoNeto())){
                    Ticket t = gestor.ingresarDatosIngreso(pedido,vistaIngreso.getEmpresaTransp(), vistaIngreso.getNombreConductor(), vistaIngreso.getPatenteChasis(), 
                    vistaIngreso.getPatenteAcoplado(), vistaIngreso.getObservaciones(), vistaIngreso.getCantidadBinesIngreso(), 
                    vistaIngreso.getPesoBruto() ,vistaIngreso.getPesoNeto(), vistaIngreso.getTARA());
                    JOptionPane.showMessageDialog(vistaIngreso, "El ticket se creo de manera exitosa \n Numero de ticket:" + t.getNumero());
                    VistaImpresionIngreso vistaImpresion = new VistaImpresionIngreso();
                    repoPedido.cargarPedido(t.getPedido());
                    vistaLista.cargarTabla(repoPedido);
                }
            }else{
                  JOptionPane.showMessageDialog(vistaIngreso,"Error");
            }
        }
    }
    
    public boolean calcularNeto(float bruto,float tara,float neto){
        if(bruto - tara == neto){
            return true;
        }else{
            return false;
        }
    }
}
/*
    System.out.println("bien");
            
*/