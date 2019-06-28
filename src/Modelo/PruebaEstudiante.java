
package Modelo;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;


public class PruebaEstudiante implements Serializable{
    
    private int nota;
    private List<PreguntaEstudiante> preguntas;

    public PruebaEstudiante() {
        this.preguntas = new ArrayList();
    }

    public List<PreguntaEstudiante> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PreguntaEstudiante> preguntas) {
        this.preguntas = preguntas;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}
