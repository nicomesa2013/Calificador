/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Estudiante
 */
public class Pregunta_cerrada extends Pregunta{
    private String respuesta[];
    private String solucion[];
    public Pregunta_cerrada(int numero, int valor, String enunciado, String respuesta[], String solucion[]) {
        super(numero, valor, enunciado);
        this.respuesta = respuesta;
        this.solucion = solucion;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public String[] getSolucion() {
        return solucion;
    }

    public void setSolucion(String[] solucion) {
        this.solucion = solucion;
    }
}
