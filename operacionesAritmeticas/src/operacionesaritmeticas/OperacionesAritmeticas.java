/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner dato =new Scanner(System.in);
        System.out.println("Numero uno: ");
        short nUno=dato.nextShort();
        
        System.out.println("Numero dos: ");
        short nDos=dato.nextShort();
        
        //Programacion estructurada
        //short resultado = (short)(nUno + nDos);
        //System.out.println("Resultado: " +resultado);
        
        //Programacion orientada objetos
        operacionSumaç operSuma =new operacionSumaç();
        
        //una manera de como Usar los atributos
        operSuma.numUno = nUno;
        operSuma.numDos = nDos;
        
        //Mostrar los atributos
        System.out.print(operSuma.numUno + " y " + operSuma.numDos);
        
        //Invocar suma
        operSuma.sumar(operSuma.numUno, operSuma.numDos);
                
                //class nota estudiante y otra llamada promedio
    }
    
}
