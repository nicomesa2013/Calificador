

package Modelo;


public class Pregunta_abierta extends Pregunta{
    private String respuesta;
    private String solucion;
    public Pregunta_abierta(int numero, int valor, String enunciado, String respuesta, String solucion) {
        super(numero, valor, enunciado);
        this.respuesta = respuesta;
        this.solucion = solucion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
}

