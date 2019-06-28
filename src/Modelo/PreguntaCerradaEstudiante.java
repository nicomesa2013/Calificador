/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
public class PreguntaCerradaEstudiante extends PreguntaEstudiante{
    private boolean[] solucion;

    public PreguntaCerradaEstudiante(int valor) {
        super(valor);
    }
    public PreguntaCerradaEstudiante(int valor, boolean[] solucion) {
        this(valor);
        this.solucion = solucion;
    }

    public boolean[] getSolucion() {
        return solucion;
    }

    public void setSolucion(boolean[] solucion) {
        this.solucion = solucion;
    }
}
