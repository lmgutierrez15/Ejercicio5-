/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author ASUS
 */
public class Pregrado extends Estudiante {
   private int CreditoPre=40000;

     public Pregrado(String nombre, String codigo, String programa, double promedio) {
        super(nombre, codigo, programa, promedio);
        
    }
    

    @Override
    public double CalcularSemestre(double promedio) {
        double valor = 0;
        double pro;
        double preDescuento= 0.25;
        double preDescuento1= 0.10;
        
        
           
    preDescuento=preDescuento-(preDescuento*0.20);
    preDescuento=preDescuento-(preDescuento*0.10);
    
        
        if (promedio>=4.5){
            valor=28*getCreditoPre();
            pro = valor * preDescuento;
            valor = valor-pro;
           
       }
        else if (promedio>=4.0 && promedio <4.5){
            valor=25*getCreditoPre();
            pro = valor * preDescuento1;
            valor = valor-pro;
        }
        
        else if (promedio>=3.5 && promedio <4.0){
            valor=20*getCreditoPre();
        

        }
        
        else if (promedio>=2.5 && promedio <3.5){
            valor=15*getCreditoPre();
            
        }   
         else if(promedio<2.5){
            valor=0;
         }
        return valor;
        }
        
    
     

    /**
     * @return the CreditoPre
     */
    public int getCreditoPre() {
        return CreditoPre;
    }

    /**
     * @param CreditoPre the CreditoPre to set
     */
    public void setCreditoPre(int CreditoPre) {
        this.CreditoPre = CreditoPre;
    }
}
