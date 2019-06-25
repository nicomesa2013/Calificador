

package Controlador;


import Modelo.Pregunta;
import Modelo.PreguntaCerrada;
import Modelo.Prueba;
import java.util.ArrayList;
import java.util.List;


public class ProfesorControlador {
    private static ProfesorControlador instance;

    private ProfesorControlador() {
        //prueba = ArchivoControlador.getInstance().cargarPrueba();
    }
    
    public static ProfesorControlador getInstance() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }
    
    private List<Pregunta> preguntas;
    private Prueba prueba = new Prueba();
    
    public void agregarPreguntaAbierta(String enunciado, int valor) {
        int numero;
        if (preguntas== null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else
            numero = preguntas.size() + 1;
        Pregunta pregunta = new Pregunta(numero, valor, enunciado);
        preguntas.add(pregunta);
        
    }
    
    public void agregarPreguntaCerrada(String enunciado, int valor, List<String> respuesta, boolean[] solucion) {
        int numero; 
        if (preguntas == null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else{
            numero = preguntas.size() + 1;
        }

        PreguntaCerrada pregunta = new PreguntaCerrada(numero, valor, enunciado, respuesta, solucion);
        preguntas.add(pregunta);
    }
    
    public void agregarDescripcion(String descripcion){
        prueba.setDescripcion(descripcion);
    }
    
    public void guardarPruebaArchivo(){
        prueba.setPreguntas(preguntas);
        ArchivoControlador.getInstance().guardarPrueba(prueba);
    }
    
    
    
}
