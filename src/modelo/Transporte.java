/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mariano
 */
public class Transporte {
    private String patenteChasis;
    private double TARA;
    private Acoplado acoplado;

    public Transporte() {
        
    }

    public Acoplado getAcoplado() {
        return acoplado;
    }

    public void setAcoplado(Acoplado acoplado) {
        this.acoplado = acoplado;
    }

    public Transporte(String patenteChasis, double TARA) {
        this.patenteChasis = patenteChasis;
        this.TARA = TARA;
    }

    public String getPatenteChasis() {
        return patenteChasis;
    }

    public void setPatenteChasis(String patenteChasis) {
        this.patenteChasis = patenteChasis;
    }

    public double getTARA() {
        return TARA;
    }

    public void setTARA(double TARA) {
        this.TARA = TARA;
    }

    public Transporte(String patenteChasis, double TARA, Acoplado acoplado) {
        this.patenteChasis = patenteChasis;
        this.TARA = TARA;
        this.acoplado = acoplado;
    }
   /* public void asignarAcoplado(String patente,int pesoNeto){
        acoplado.setPatenteAcoplado(patenteChasis);
        acoplado.asignar(pesoNeto);
    }*/
    
    
}
