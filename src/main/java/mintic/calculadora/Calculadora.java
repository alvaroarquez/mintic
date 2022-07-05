/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mintic.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */

public class Calculadora {
 
    public static void main(String[] args) {
        Proce_poo procedimiento =new Proce_poo();
        
         byte opcion1;
         opcion1= Byte.parseByte(JOptionPane.showInputDialog(
         "Seleccione Una Opcion:\n"
         +"1. Realizar una operacion \n"
         +"2. Salir \n"));
         while(opcion1!=2){
             
             byte opcion2;
                double valor_1;
                double valor_2;
                double res;
                opcion2= Byte.parseByte(JOptionPane.showInputDialog(
                "Seleccione Una Opcion:\n"
                +"1. Suma \n"
                +"2. Resta \n"
                +"3. Multiplicacion \n"
                +"4. Division \n"
                +"5. Potencia \n"
                +"6. Raiz cuadrada \n"
                +"7. Salir \n"));
                //LLAMADOS SEGUN OPCION AL OBJETO-ACCION//
                
                switch (opcion2){
                    case 1:
                       procedimiento.suma();
                       break;
                       
                    case 2:
                        procedimiento.resta();
                       break;
                                          
                    case 3:
                        procedimiento.multiplicacion();
                       break;
                       
                    case 4:
                        procedimiento.division();
                       break;
                        
                    case 5:
                        procedimiento.potencia();
                       break;                     
                        
                    case 6:
                        procedimiento.raiz();
                       break;
                       
                    default:
                        opcion1=2;
                        break;
                }
         }


    }
}
