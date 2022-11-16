/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auxiliodetransporte;

import java.util.Scanner;

/**
 
 *
 */
public class AuxilioDeTransporte {

    /**
     * Se desea crear un programa que permita decir si aplica o no el auxilio de transporte
     */
    public static void main(String[] args) {
        // se definen el tipo de  variables a utilizar 
        
        
       int cantidadDeSalarios ; 
        
        //se llama la libreria Scanner para leer variables
        
        Scanner leerSalario =new Scanner (System.in);
        
        
        
        //se leen los datos de entrada
        
        
        System.out.println("¿Cuanto salarios minimos gana al mes?");
        cantidadDeSalarios=leerSalario.nextInt();
        
       
//Se crea una condicio donde se pregunta si aplica o no 
        
        
        
        
        if (cantidadDeSalarios<=2 && cantidadDeSalarios>=1) {System.out.println("Usted aplica para el auxilio de transporte");
            
        }
        else System.out.println("usted no a plica para el auxilio de transporte");
    }
   }
