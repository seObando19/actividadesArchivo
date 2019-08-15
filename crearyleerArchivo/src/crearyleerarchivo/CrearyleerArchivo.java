/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearyleerarchivo;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author sebas
 */
public class CrearyleerArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String carta="Hello my friend, How are you";
        String nomArchivo="archivoDos.txt";
        String rutaArchivoGuardar="/Users/sebas/Desktop/";    
        
        
        try {
            
            FileWriter archivo=new FileWriter(rutaArchivoGuardar+nomArchivo);
            archivo.write(carta);
            archivo.close();
            
            
            FileReader leerArch=new FileReader("/Users/sebas/Desktop/archivoDos.txt");
            int val=leerArch.read();
            
            while (val != -1) {
                
                System.out.print((char)val);
                val=leerArch.read();                
            }
            leerArch.close();
            
        } catch (Exception e) {
            System.out.println("Error E/S: "+e);
        }
    }
    
}
