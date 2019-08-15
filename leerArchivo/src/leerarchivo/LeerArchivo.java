/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivo;

import java.io.FileReader;

/**
 *
 * @author sebas
 */
public class LeerArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            FileReader leerArchivo = new FileReader("/Users/sebas/Desktop/archivoUno.txt");
            int valor=leerArchivo.read();
            
            while (valor != -1) {
                System.out.print((char)valor);
                valor=leerArchivo.read();                
            }
            leerArchivo.close();
            
        } catch (Exception e) {
            
            System.out.println("Eror E/S: "+e);
        }
    }
    
}
