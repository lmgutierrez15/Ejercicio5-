/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresateleventas;

/**
 *
 * @author ASUS
 */
public class Despacho {
    private String nombre;
    private String reclamo;
    private int num;

    public Despacho(String nombre, String molestia, int num) {
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
    public String getReclamo() {
        return reclamo;
    }

    /**
     * @param queja the queja to set
     */
    public void setMolestia(String queja) {
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
