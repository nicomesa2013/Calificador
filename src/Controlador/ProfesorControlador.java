

package Controlador;


import Excepciones.PorcentajeSuperadoException;
import Modelo.Pregunta;
import Modelo.PreguntaCerrada;
import Modelo.Prueba;
import Modelo.PruebaEstudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProfesorControlador {
    private static ProfesorControlador instance;
    private ProfesorControlador() {
        pruebaEstudiante = ArchivoControlador.getInstance().cargarPruebaE();
        prueba = ArchivoControlador.getInstance().cargarPruebaP();
        //prueba = new Prueba();
    }
    
    public static ProfesorControlador getInstance() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }
    
    private List<Pregunta> preguntas;
    private Prueba prueba ;
    private PruebaEstudiante pruebaEstudiante;

    public PruebaEstudiante getPruebaEstudiante() {
        return pruebaEstudiante;
    }

    public Prueba getPrueba() {
        return prueba;
    }
    
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
    
    public void agregarPreguntaCerrada(String enunciado, int valor, List<String> respuesta, boolean[] solucion)
            throws PorcentajeSuperadoException {
        
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
        if((suma + valor) > 100){
            throw new PorcentajeSuperadoException("Ingrese un procentaje nuevo");
        }
        PreguntaCerrada pregunta = new PreguntaCerrada(numero, valor, enunciado, respuesta, solucion);
        preguntas.add(pregunta);
    }
    
    public void agregarDescripcion(String descripcion){
        if(prueba == null){
            prueba = new Prueba();
        }
        prueba.setDescripcion(descripcion);
    }
    
    public void guardarPruebaArchivo(){
        if(prueba == null){
            prueba = new Prueba();
        }
        prueba.setPreguntas(preguntas);
        ArchivoControlador.getInstance().guardarPrueba(prueba);
    }
    
    
    
    
}
