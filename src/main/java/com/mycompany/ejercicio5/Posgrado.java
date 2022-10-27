/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author ASUS
 */
public class Posgrado extends Estudiante {
    
private int CreditoPos=200000;

    public Posgrado(String nombre, String codigo, String programa, double promedio) {
        super(nombre, codigo, programa, promedio);
    
    
    }

    public double CalcularSemestre(double promedio) {
        double valor = 0;
        double pro;
        double proDescuento= 0.20;
     
        if (promedio>=4.5){
            valor=20*getCreditoPos();
            pro = valor * proDescuento;
            valor = valor-pro;
           
       }
        else if (promedio<4.5){
            valor=10*getCreditoPos();
        }
        return valor;
    }


    /**
     * @return the CreditoPos
     */
    public int getCreditoPos() {
        return CreditoPos;
    }

    /**
     * @param CreditoPos the CreditoPos to set
     */
    public void setCreditoPos(int CreditoPos) {
        this.CreditoPos = CreditoPos;
    }
}
