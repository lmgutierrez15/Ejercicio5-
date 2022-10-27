/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresateleventas;

/**
 *
 * @author ASUS
 */
public class TarjetaCredito {
    
private String nombre;
    private String apellido;
    private int num;
    private int FechaVenc;

    public TarjetaCredito(String nombre, String apellido, int num,int FechaVenc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num = num;
        this.FechaVenc = FechaVenc;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

  

    /**
     * @return the FechaVenc
     */
    public int getFechaVenc() {
        return FechaVenc;
    }

    /**
     * @param FechaVenc the FechaVenc to set
     */
    public void setFechaVenc(int FechaVenc) {
        this.FechaVenc = FechaVenc;
    }
    
    public void pagar() {
        
    }
}
