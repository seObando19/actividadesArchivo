/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivo;

import java.io.FileWriter;

/**
 *
 * @author sebas
 */
public class CrearArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carta="Mas cartas menos mensajes!!";
        String nomArchivo="archivoUno.txt";
        String rutaArchivoGuardar="/Users/sebas/Desktop/";
        
        try {
            FileWriter archivo= new FileWriter(rutaArchivoGuardar+nomArchivo);
            archivo.write(carta); //Genrear el archivo
            archivo.close();
        } catch (Exception e) {
        }
    }
    
}
