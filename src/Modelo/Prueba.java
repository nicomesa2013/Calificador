/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Prueba {
    private ArrayList <Pregunta> preguntas = new ArrayList();
    
    public Prueba(ArrayList<Pregunta> preguntas){
        this.preguntas = preguntas;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
    
}
