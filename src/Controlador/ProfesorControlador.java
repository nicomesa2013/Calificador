

package Controlador;


public class ProfesorControlador {
    private static ProfesorControlador instance;

    private ProfesorControlador() {
    }
    
    public static ProfesorControlador getInstane() {
        if (instance == null) {
            instance = new ProfesorControlador();
        }
        return instance;
    }
    
    public void guardarPrueba(String cadena){
        Archivos prueba = new Archivos();
        prueba.escribir(cadena);
    }
}
