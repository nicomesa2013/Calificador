/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author acer
 */
public class Archivos {
    
    
    public void escribir(String cadena){
        try{
            FileWriter escribir = new FileWriter("Prueba.txt");
            //BufferedWriter buffer = new BufferedWriter(escribir);
            //PrintWriter Imprimir = new PrintWriter(archivo);

            for(int i = 0; i < cadena.length(); i++){
                
                escribir.write(cadena.charAt(i));
            }
            
            escribir.close();
        }
        catch(IOException e){
            
        }
    }
}
