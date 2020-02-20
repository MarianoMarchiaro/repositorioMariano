/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariano
 */
public class PruebasUnitarias {
    
    public PruebasUnitarias() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Ticket ticket = new Ticket();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void probarQueLaCantidadDeBinesNoSeaIgual(){
        Ticket ticket = new Ticket();
        int binesIngreso = 5;
        int binesEgreso = 4;
        ticket.setCantidadBinesIngreso(binesIngreso);
        ticket.setCantidadBinesSalida(binesEgreso);
        int primero = ticket.getCantidadBinesIngreso();
        int segundo = ticket.getCantidadBinesSalida();
        assertFalse((ticket.getCantidadBinesIngreso() == ticket.getCantidadBinesSalida()));
        
    }
    
    @Test
    public void probarQueNetoEsBrutoMenosTara(){
        Ticket ticket = new Ticket();
        Transporte transporte = new Transporte();
        Producto prod = new Producto();
        ticket.setPesoEntrada(9000);
        transporte.setTARA(1500);
        prod.setNeto(7500);
        double resultado = ticket.getPesoEntrada() - transporte.getTARA();
        assertEquals(7500, resultado, 0);
        
    }

    @Test
    public void probarQuePesoNetoEsIgualACantidadMercaderiaDelPedido(){
        Pedido pedido = new Pedido();
        Producto producto = new Producto();
        pedido.setCantidadMercaderia(8500);
        producto.setNeto(4523);
        assertFalse(pedido.getCantidadMercaderia() == producto.getNeto());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
