/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Daniela Chaux
 */
public class PreguntaAbiertaEstudiante extends PreguntaEstudiante {
    String solucion;

    public PreguntaAbiertaEstudiante(int valor, String solucion) {
        super(valor);
        this.solucion = solucion;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
}
