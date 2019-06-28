
package Modelo;

import java.io.Serializable;



public  class Pregunta implements Serializable{
    private static final long serialVersionUID = 185846565646L;
    
    private int numero; 
    private int porcentaje;
    private String enunciado;

    public Pregunta(int numero, int valor, String enunciado) {
        this.numero = numero;
        this.porcentaje = valor;
        this.enunciado = enunciado;
    }
    public Pregunta(){
        
    }

    public int getNumero() {
        return numero;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public String getEnunciado() {
        return enunciado;
    }
}
