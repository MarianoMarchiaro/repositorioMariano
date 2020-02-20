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
public class Cliente {
    private String nombre;
    private String razonSocial;
    private String cuil;
    private String direccion;
    private long telefono;
    private String correoElectronico;
    private ArrayList<Bin> bines;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Cliente(String nombre, String razonSocial, String cuil, String direccion, long telefono, String correoElectronico) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuil=cuil;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.bines = new ArrayList<Bin>();
        añadirBines();
    }

    public ArrayList<Bin> getBines() {
        return bines;
    }

    public void setBines(ArrayList<Bin> bines) {
        this.bines = bines;
    }
    
    public void añadirBines(){
        bines.add(new Bin(4000));
        bines.add(new Bin(5262));
        bines.add(new Bin(4500));
        bines.add(new Bin(4300));
        bines.add(new Bin(4000));
    }
    private boolean controlarCuil(String numero){
        int numeros[] = new int[11];
        String numeroCorrecto[] = new String[11];
        String numeroCorrecto2="";
        String auxiliar[] = new String[8];
        int cantidad = numero.length();
        for(int i=2;i<cantidad-1;i++){
            char auxiliar1=numero.charAt(i);
            auxiliar[i-2]= String.valueOf(auxiliar1);           
        }
        numeros[0]=3*5;
        numeros[1]=0*4;
        numeros[2]=Integer.parseInt(auxiliar[0])*3;//1
        System.out.println("4*3 ="+numeros[2]);
        numeros[3]=Integer.parseInt(auxiliar[1])*2;//0
        numeros[4]=Integer.parseInt(auxiliar[2])*7;//2
        numeros[5]=Integer.parseInt(auxiliar[3])*6;//5
        numeros[6]=Integer.parseInt(auxiliar[4])*5;//3
        numeros[7]=Integer.parseInt(auxiliar[5])*4;//6
        System.out.println(numeros[6]);
        numeros[8]=Integer.parseInt(auxiliar[6])*3;//9
        numeros[9]=Integer.parseInt(auxiliar[7])*2;//8
        int nuevoNum =0;
        for(int i=0;i<numeros.length;i++){
            nuevoNum = nuevoNum + numeros[i];
            System.out.println(nuevoNum);
        }
        int Z = nuevoNum/11;
        int cuilReal[] = new int[11];
        int resta = nuevoNum - (Z*11);
        cuilReal[0]=3;
        cuilReal[1]=0;
        cuilReal[2]=Integer.parseInt(auxiliar[0]);
        cuilReal[3]=Integer.parseInt(auxiliar[1]);
        cuilReal[4]=Integer.parseInt(auxiliar[2]);
        cuilReal[5]=Integer.parseInt(auxiliar[3]);
        cuilReal[6]=Integer.parseInt(auxiliar[4]);
        cuilReal[7]=Integer.parseInt(auxiliar[5]);
        cuilReal[8]=Integer.parseInt(auxiliar[6]);
        cuilReal[9]=Integer.parseInt(auxiliar[7]);
        if(resta==1){
            cuilReal[10]=9;
        }else{
        cuilReal[10]=resta;
        }
        for(int i=0;i<11;i++){
            numeroCorrecto[i] = Integer.toString(cuilReal[i]);
            numeroCorrecto2=numeroCorrecto2+numeroCorrecto[i];
        }
        System.out.println(numeroCorrecto2);
        if(numeroCorrecto2.equals(numero)){
            return true;
        }else{
            return false;
        }
    }
    
}
