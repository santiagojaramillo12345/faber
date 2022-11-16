/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentodesalario;

import java.util.Scanner;

/**
 *
 * 
 */
public class DescuentoDeSalario {

    /**
     * El solicitante del software requiere generar el salario mensual de cada 
     * empleado, y para ello debe realizar unas deducciones de salud y pensión 
     * que serán descontados del salario mensual del empleado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       // se define el tipo de variable 
       int salarioMinimo,deduciones,salarioTotal,SM,As,Ap,D;
       double p;
       //se importa la libreria Scanner para leer datos
       Scanner leerDato =new Scanner (System.in);
       
       
       //Se definen los datos de entrado
               System.out.println("Digite su salario");
               SM=leerDato.nextInt();
// salarioMinimo=leerDato.nextInt();

               
               //operaciones con los datos de entrada
               
               //salarioTotal=salarioMinimo-deduciones-
        
               
               
          As=0;     
               
               
if (SM >=1000000 && SM <=1200000) { 

 
    As= (SM*4)/100; 

 Ap = SM - (SM*4)/100; 
 D = As + Ap;
        System.out.println("Las deduciones son de ");

} 

else { 

 As = SM - (SM*8)/100; 

 Ap = SM - (SM*8)/100; 
 D = As + Ap;
        System.out.println("Las deduciones son de ");

} 


        
    }
    
}
