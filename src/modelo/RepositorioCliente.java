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
public class RepositorioCliente {
    private Cliente cliente;
    private ArrayList<Cliente> clientes;

    public RepositorioCliente() {
        this.clientes = new ArrayList<Cliente>();
        añadirClientes();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        
    }
    
    private void añadirClientes(){
        clientes.add(new Cliente("DeLotto Juan","DeLotto S.A.","30415263585","Miguel de Azcuenaga 234",4268596,"delotto@gmail.com"));
        clientes.add(new Cliente("Luchi Ricardo","Luchi S.A.","30895625872","Miguel de Olazabal 582",4367896,"luchiricardo@gmail.com"));
        clientes.add(new Cliente("Lucco Reinaldi","Lucco S.A.","30205361452","Mate de Luna 3544",4864556,"luccorein@gmail.com"));
        clientes.add(new Cliente("Prueba","Prueba S.A.","30205854289","Calle X 500",5826954,"prueba@gmail.com"));
    }
}
