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
public class RepositorioPedido {
    private ArrayList<Pedido> pedidos;
    private RepositorioCliente clientes;
    private ArrayList<Producto> productos;
    private EstadoPedido estado;

    public RepositorioPedido() {
        this.pedidos = new ArrayList<Pedido>();
        clientes = new RepositorioCliente();
        productos = new ArrayList<Producto>();
        cargarProductos();
        cargarPedidos();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void cargarPedido(Pedido p){
        for(int j=0;j<pedidos.size();j++){
            if(pedidos.get(j).getNumero() == p.getNumero()){
                pedidos.get(j).setEstado(p.getEstado());
            }
        }
    }
    public void cargarProductos(){
        TipoProducto estado = null;
        productos.add(new Producto(4000,estado.LIMON));
        productos.add(new Producto(3200,estado.NARANJA));
        productos.add(new Producto(5000,estado.MANDARINA));
        productos.add(new Producto(3000,estado.LIMA));
    }
    public void cargarPedidos(){
        pedidos.add(new Pedido(1,4500,new Date(2020,2,1),new Date(2020,2,17),clientes.getClientes().get(0),productos.get(0),estado.PAGADO));
        pedidos.add(new Pedido(2,7500,new Date(2020,2,1),new Date(2020,2,17),clientes.getClientes().get(2),productos.get(2),estado.EN_PROCESO));
        pedidos.add(new Pedido(3,6500,new Date(2020,2,1),new Date(2020,2,17),clientes.getClientes().get(3),productos.get(3),estado.PAGADO));
        pedidos.add(new Pedido(4,5500,new Date(2020,2,1),new Date(2020,2,17),clientes.getClientes().get(0),productos.get(0),estado.PARA_RETIRAR));
    }
}
