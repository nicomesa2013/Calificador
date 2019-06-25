

package Controlador;


import Modelo.Pregunta;
import Modelo.PreguntaCerrada;
import Modelo.Prueba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


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
        int numero, suma = 0;
        if (preguntas== null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else
            numero = preguntas.size() + 1;
        
        for(Pregunta pregunta: preguntas){
            suma += pregunta.getPorcentaje();
        }
        while((suma + valor) > 100){
           valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un porcentaje valido."));
        }
        Pregunta pregunta = new Pregunta(numero, valor, enunciado);
        preguntas.add(pregunta);
        
    }
    
    public void agregarPreguntaCerrada(String enunciado, int valor, List<String> respuesta, boolean[] solucion) {
        int numero, suma = 0; 
        if (preguntas == null) {
            preguntas = new ArrayList<>();
            numero = 1;
        }
        else
            numero = preguntas.size() + 1;
        
        for(Pregunta pregunta: preguntas){
            suma += pregunta.getPorcentaje();
        }
        while((suma + valor) > 100){
           valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un porcentaje valido."));
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
