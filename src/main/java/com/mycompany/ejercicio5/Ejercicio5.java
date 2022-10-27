/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejercicio5 {

    public static void main(String[] args) {
          Scanner in= new Scanner(System.in);
          
          String nombre;
          String codigo;
          String programa;
          double fisica;
          double calculo;
          double estadistica;
          int credito;
          
          double promedio =0;
          double valorSemestre= 0;
          
          
        
        System.out.println("\n\t\t---------------- BIENVENIDO A LA INSTITUCION ---------------- ");
        System.out.println("Ingrese el nombre del estudiante");
        nombre=in.nextLine();
        System.out.println("Ingrese el codigo del estudiante");
        codigo=in.nextLine();
        System.out.print("\n\t Ingrese el programa al que pertenece el estudiante 1. Pregrado 2. Posgrado ");
        programa=in.nextLine();
        System.out.println("Ingrese la nota para fisica ");
        fisica=in.nextDouble();
        System.out.println("Ingrese la nota para calculo ");
        calculo=in.nextDouble();
        System.out.println("Ingrese la nota para estadistica ");
        estadistica=in.nextDouble();
        
        if (programa.equals("posgrado")) {
            Estudiante estudiante1 = new Posgrado(nombre, codigo, programa, promedio);
            promedio = estudiante1.CalcularPromedio(calculo, estadistica, fisica);
            
            if (promedio>=4.5){
            valorSemestre = estudiante1.CalcularSemestre(promedio);
            credito=20;
           
       }
        else if (promedio<4.5){
            valorSemestre = estudiante1.CalcularSemestre(promedio);
            credito=10;
        }
        
        }
        if (programa.equals("pregrado")) {
           if (promedio>=4.5){
            Estudiante estudiante2 = new Pregrado(nombre, codigo, programa, promedio);
            promedio = estudiante2.CalcularPromedio(calculo, estadistica, fisica);
            valorSemestre = estudiante2.CalcularSemestre(promedio);
            credito=28;
       }
        else if (promedio>=4.0 && promedio <4.5){
            Estudiante estudiante2 = new Pregrado(nombre, codigo, programa, promedio);
            promedio = estudiante2.CalcularPromedio(calculo, estadistica, fisica);
             valorSemestre = estudiante2.CalcularSemestre(promedio);
            credito=25;
        }
        
        else if (promedio>=3.5 && promedio <4.0){
            Estudiante estudiante2 = new Pregrado(nombre, codigo, programa, promedio);
            promedio = estudiante2.CalcularPromedio(calculo, estadistica, fisica);
             valorSemestre = estudiante2.CalcularSemestre(promedio);
            credito=20;
   
        }
        
        else if (promedio>=2.5 && promedio <3.5){
            Estudiante estudiante2 = new Pregrado(nombre, codigo, programa, promedio);
            promedio = estudiante2.CalcularPromedio(calculo, estadistica, fisica);
             valorSemestre = estudiante2.CalcularSemestre(promedio);
            credito=15;
        }        
        else if (promedio<2.5 ){
            credito= 0;
            System.out.println("El estudiante no puede ser matriculado");
        }
}
       
        
    System.out.print("\n\t------------------------------------------"); 
        System.out.println("\n\tNombre del estudiante: "+ nombre); 
        System.out.println("\n\tEl promedio es de : "+ promedio);
        System.out.println("\n\tEl valor a pagar es :"+ valorSemestre);
        System.out.println("\n\t------------------------------------------"); 
    
        }
}

