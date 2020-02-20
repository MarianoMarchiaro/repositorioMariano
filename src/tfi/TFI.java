/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi;

import controlador.ControladorInicial;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.RepositorioPedido;
import modelo.*;
import vista.*;
import vista.VentanaListaPedidos;

/**
 *
 * @author Mariano
 */
public class TFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EgresoTicket vistaticket = new EgresoTicket();
        //vistaticket.ejecutar();
        //IngresoTicket2 vistaticket = new IngresoTicket2();
        //vistaticket.iniciar();
        ControladorInicial controlador = new ControladorInicial();
        //RepositorioPedido pedido = new RepositorioPedido();
        
        
        /*Date fecha = new Date(2008,5,21);
        Date fecha2 = new Date(2008,5,26);
       
        System.out.println(fecha);
        System.out.println(fecha2);
        Calendar inicio = Calendar.getInstance();
        inicio.setTime(fecha);
        Calendar fin = Calendar.getInstance();
        fin.setTime(fecha2);
        int i=-1;
        while(inicio.before(fin) || inicio.equals(fin)){
            i++;
            inicio.add(Calendar.DATE,1);
        }
        System.out.println("la diferencia es: " + i);
        */
    }
    
}
