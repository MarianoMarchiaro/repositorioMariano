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
public class ControladorTransporte implements ActionListener{
    private VistaNuevoTransporte vistaTransp;
    private IngresoTicket2 vistaIngreso;
    private RepositorioEmpresaT repoEmpresa;
    
    public ControladorTransporte(RepositorioEmpresaT repoEmpresa,IngresoTicket2 vistaIngreso){
        this.vistaIngreso=vistaIngreso;
        this.repoEmpresa=repoEmpresa;
        this.vistaTransp=new VistaNuevoTransporte();        
        vistaTransp.ejecutar();
        vistaTransp.setControlador(this);
        vistaTransp.cargarjCBox1(repoEmpresa);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaTransp.BOTON_CONFIRMAR)){
            Transporte transporte = new Transporte();
            transporte.setPatenteChasis(vistaTransp.getPatenteChasis());
            Acoplado acoplado = new Acoplado();
            acoplado.setPatenteAcoplado(vistaTransp.getPatenteAcoplado());
            transporte.setAcoplado(acoplado);
            String nombre = vistaTransp.jComboBox1.getSelectedItem().toString();
            for(int i=0;i<repoEmpresa.getEmpresas().size();i++){
                if(nombre == repoEmpresa.getEmpresas().get(i).getNombre()){
                    repoEmpresa.getEmpresas().get(i).getTransportes().add(transporte);
                }
            }
            vistaIngreso.repoEmpresa=repoEmpresa;
            vistaIngreso.cargarCBox3(repoEmpresa);
            JOptionPane.showMessageDialog(vistaTransp,"El transporte se ha creado con exito");
        }
    }
    
}
