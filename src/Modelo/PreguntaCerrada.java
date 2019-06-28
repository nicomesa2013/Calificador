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
 * @author Estudiante
 */
public class PreguntaCerrada extends Pregunta{
    private static final long serialVersionUID = 18181813L;
    private List<String> respuesta;
    private boolean[] solucion = new boolean[4];//Respuesta correcta
    public PreguntaCerrada(){
        super();
        this.respuesta = new ArrayList();
    }
    public PreguntaCerrada(int numero, int valor, String enunciado, List<String> respuesta, boolean[] solucion) {
        super(numero, valor, enunciado);
        this.respuesta = respuesta;
        this.solucion = solucion;
    }

    public List<String> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(List<String> respuesta) {
        this.respuesta = respuesta;
    }

    public boolean[] getSolucion() {
        return solucion;
    }

    public void setSolucion(boolean[] solucion) {
        this.solucion = solucion;
    }

    

    
}
