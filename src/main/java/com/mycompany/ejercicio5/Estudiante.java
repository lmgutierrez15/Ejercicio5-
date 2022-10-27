/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author ASUS
 */
public abstract class Estudiante {
    
 private String nombre;
    private String codigo;
    String programa;
    double promedio ;

    public Estudiante(String nombre, String codigo, String programa, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.programa = programa;
        this.promedio = promedio;
    }
 
 public double CalcularPromedio( double calculo, double estadistica, double fisica){
         
   
         setPromedio((calculo + estadistica + fisica )/3);
         return getPromedio();
 }
 
 public abstract double CalcularSemestre (double promedio);
         
 
    /**
     * 
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    

   
    }
    
     


