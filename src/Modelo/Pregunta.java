
package Modelo;



public  class Pregunta{
    private int numero; 
    private int porcentaje;
    private String enunciado;

    public Pregunta(int numero, int valor, String enunciado) {
        this.numero = numero;
        this.porcentaje = valor;
        this.enunciado = enunciado;
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
