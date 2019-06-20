
package Modelo;


public abstract class Pregunta {
    private int numero; 
    private int valor;
    private String enunciado;

    public Pregunta(int numero, int valor, String enunciado) {
        this.numero = numero;
        this.valor = valor;
        this.enunciado = enunciado;
    }

    public int getNumero() {
        return numero;
    }

    public int getValor() {
        return valor;
    }

    public String getEnunciado() {
        return enunciado;
    }
}
