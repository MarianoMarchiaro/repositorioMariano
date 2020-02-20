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
public class ControladorTransportista implements ActionListener{
    private RepositorioEmpresaT repoEmpresa;
    private VistaNuevoTransportista vistaTransp;
    private IngresoTicket2 vistaIngreso;
    
    public ControladorTransportista(RepositorioEmpresaT repoEmpresa,IngresoTicket2 vistaIngreso){
        
        vistaTransp=new VistaNuevoTransportista();
        vistaTransp.repoEmpresa = repoEmpresa;
        vistaTransp.ejecutar();
        vistaTransp.setControlador(this);
        this.repoEmpresa=repoEmpresa;
        this.vistaIngreso = vistaIngreso;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaTransp.BOTON_CONFIRMAR)){
            
            Transportista conductor  =new Transportista(vistaTransp.getNombreC(),vistaTransp.getDNIC());
            String nombre = vistaTransp.jComboBox1.getSelectedItem().toString();
            for(int i=0;i<repoEmpresa.getEmpresas().size();i++){
                if(nombre == repoEmpresa.getEmpresas().get(i).getNombre()){
                    repoEmpresa.getEmpresas().get(i).getTransportistas().add(conductor);
                }
            }
            vistaIngreso.repoEmpresa=repoEmpresa;
            vistaIngreso.cargarCBox2(repoEmpresa);
            JOptionPane.showMessageDialog(vistaTransp,"Se creo el conductor exitosamente");
      
        }
    }
    
}
