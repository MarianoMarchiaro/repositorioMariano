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
import vista.*;
import modelo.*;
/**
 *
 * @author Mariano
 */
public class ControladorEmpresa implements ActionListener{
    private RepositorioEmpresaT repoEmpresa;
    private VistaAgregarEMPRESAT vistaEmpresa;
    private IngresoTicket2 vistaIngreso;
    
    public ControladorEmpresa(RepositorioEmpresaT repoEmpresa,IngresoTicket2 vistaIngreso){
        this.repoEmpresa=repoEmpresa;
        vistaEmpresa = new VistaAgregarEMPRESAT();
        vistaEmpresa.setControlador(this);
        vistaEmpresa.ejecutar();
        this.vistaIngreso=vistaIngreso;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vistaEmpresa.BOTON_CONFIRMAR)){
            EmpresaTransporte empresa = new EmpresaTransporte();
            Transportista transportista = new Transportista();
            Transporte transporte = new Transporte();
            Acoplado acoplado = new Acoplado();
            empresa.setNombre(vistaEmpresa.getNombre());
            transportista.setNombre(vistaEmpresa.getNombreTransportista());
            transportista.setDni((int) vistaEmpresa.getDNITransportista());
            transporte.setPatenteChasis(vistaEmpresa.getPatenteChasis());
            acoplado.setPatenteAcoplado(vistaEmpresa.getPatenteAcoplado());
            transporte.setAcoplado(acoplado);
            empresa.setTransporte(transporte);
            empresa.setTransportista(transportista);
            ArrayList<Transportista> transportistas = new ArrayList();
            transportistas.add(transportista);
            ArrayList<Transporte> transportes = new ArrayList();
            transportes.add(transporte);
            empresa.setTransportistas(transportistas);
            empresa.setTransportes(transportes);
            repoEmpresa.guardarEmpresa(empresa);
            JOptionPane.showMessageDialog(vistaEmpresa,"La empresa se ha guardado correctamente");
            vistaIngreso.jComboBox1.removeAllItems();
            vistaIngreso.jComboBox2.removeAllItems();
            vistaIngreso.jComboBox3.removeAllItems();
            vistaIngreso.cargarCBox1(repoEmpresa);
            vistaIngreso.repoEmpresa = this.repoEmpresa;
            vistaIngreso.cargarCBox2(repoEmpresa);
            vistaIngreso.cargarCBox3(repoEmpresa);
        }
    }
    public RepositorioEmpresaT devolverEmpresas(){
        return repoEmpresa;
    }
    
}
