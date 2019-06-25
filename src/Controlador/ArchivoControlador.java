/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Prueba;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */

public class ArchivoControlador {

    private static ArchivoControlador instance;

    private ArchivoControlador() {
    }

    public static ArchivoControlador getInstance() {
        if (instance == null) {
            instance = new ArchivoControlador();
        }
        return instance;
    }

    public Prueba cargarPrueba() {
        Prueba prueba = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Examen.cad"))) {
            Object readObject = ois.readObject();
            if (readObject != null && readObject instanceof Prueba) {
                prueba = ((Prueba) readObject);
            }
        } catch (Exception ex) {
              System.out.println("Error al leer archivo: " + ex);
        }

        return prueba;
    }

    public void guardarPrueba(Prueba prueba) throws IOException {
        try {
            /*try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Examen.cad"))) {
            ois.writeObject(prueba);
            } catch (Exception ex) {
            System.out.println("Error al escribir archivo: " + ex);
            }*/
            
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Examen.cad"));
            ois.writeObject(prueba);
            ois.close();
        } catch (FileNotFoundException ex) {
        Logger.getLogger(ArchivoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
