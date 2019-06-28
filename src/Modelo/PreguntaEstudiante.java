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
public abstract class PreguntaEstudiante implements Serializable{
    int numero;

    public PreguntaEstudiante(int valor) {
        this.numero = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
