/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mariano
 */
public class RepositorioTicket {
    private Ticket ticket;
    private int numero;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private RepositorioPedido pedidos = new RepositorioPedido();
    
    
    public RepositorioTicket(){
        agregarTickets();
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    public void guardarTicket(Ticket ticket){
                tickets.add(ticket);
    }
    public int calcularNumero(){
        int j = 0;
        for(int i=0;i<tickets.size();i++){
            j=j+1;
        }
        return j;
    }
    
    public ArrayList<Ticket> buscarTickets(){
        return tickets;
    }
    public Ticket buscarTicket(int numero){
        Ticket tick = new Ticket();
        for(Ticket c : tickets){
            if(numero == c.getNumero()){
                tick = c;
            }
        }
        return tick;
    }
    
    public void agregarTickets(){
        EstadoTicket estado= null;
        RepositorioEmpresaT empresa = new RepositorioEmpresaT();
        tickets.add(new Ticket(empresa.getEmpresas().get(1),"",7,1,new Date(2020,01,28),empresa.getTransportistas().get(1).getNombre(),empresa.getTransportistas().get(1).getDni(),empresa.getTransportes().get(1).getPatenteChasis(),empresa.getAcoplados().get(1).getPatenteAcoplado(),4500,8000,1500,4000));
        tickets.add(new Ticket(empresa.getEmpresas().get(1),"",4,2,new Date(2020,01,20),empresa.getTransportistas().get(1).getNombre(),empresa.getTransportistas().get(1).getDni(),empresa.getTransportes().get(2).getPatenteChasis(),empresa.getAcoplados().get(2).getPatenteAcoplado(),3500,7000,1500,2300));
        tickets.add(new Ticket(empresa.getEmpresas().get(0),"",8,3,new Date(2020,01,22),empresa.getTransportistas().get(0).getNombre(),empresa.getTransportistas().get(0).getDni(),empresa.getTransportes().get(1).getPatenteChasis(),empresa.getAcoplados().get(1).getPatenteAcoplado(),1500,4000,1500,1800));
        tickets.add(new Ticket(empresa.getEmpresas().get(2),"",2,4,new Date(2020,01,14),empresa.getTransportistas().get(2).getNombre(),empresa.getTransportistas().get(2).getDni(),empresa.getTransportes().get(1).getPatenteChasis(),empresa.getAcoplados().get(1).getPatenteAcoplado(),4500,8000,1500,3000));
        tickets.add(new Ticket(empresa.getEmpresas().get(3),"",1,5,new Date(2020,01,26),empresa.getTransportistas().get(3).getNombre(),empresa.getTransportistas().get(3).getDni(),empresa.getTransportes().get(1).getPatenteChasis(),empresa.getAcoplados().get(1).getPatenteAcoplado(),4500,8000,1500,3000));
    }
    public void añadirPedidos(RepositorioPedido pedidos){
        for(int i = 0; i< 3;i++){
            tickets.get(i).setPedido(pedidos.getPedidos().get(i));
        }
    }
}
