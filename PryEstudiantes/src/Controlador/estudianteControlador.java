
package Controlador;

import Modelo.estudianteModelo;
import vista.estudianteVista;

public class estudianteControlador {
  
     public estudianteModelo smodelo ;    
    public estudianteVista svista;

    public estudianteControlador(estudianteModelo smodelo, estudianteVista svista) {
        this.smodelo = smodelo;
        this.svista = svista;
    }
    
public void asignarNombre(String nombre){
smodelo.setNombre(nombre);
}
    
public void asignarCalificacion(double calificacion){
smodelo.setCalificacion(calificacion);
}

public void actualizarVista(){
    svista.mostrarInfo(smodelo.getNombre(), smodelo.getCalificacion());
}


}