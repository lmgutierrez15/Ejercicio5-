/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresateleventas;

/**
 *
 * @author ASUS
 */
public class CalidadProducto {
    
    
    private String nombre;
    private String reclamo;
    private int num;
    
        public CalidadProducto(String nombre, String queja, int num) {
        this.nombre = nombre;
        this.reclamo = reclamo;
        this.num = num;
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
     * @return the queja
     */
    public String getmolestia() {
        return reclamo;
    }

    /**
     * @param reclamo
     */
    public void setReclamo(String reclamo) {
        this.reclamo = reclamo;
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
        
        
}

