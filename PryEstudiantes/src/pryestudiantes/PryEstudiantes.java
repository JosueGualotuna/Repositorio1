
package pryestudiantes;

import Controlador.estudianteControlador;
import vista.estudianteVista;
import Modelo.estudianteModelo;
public class PryEstudiantes {

    public static void main(String[] args) {
   estudianteModelo em= new estudianteModelo();
    estudianteVista ev = new estudianteVista();
    estudianteControlador ec = new estudianteControlador(em,ev);
ec.asignarNombre("KENNY");
ec.asignarCalificacion(20);
ec.actualizarVista();
     }
    
}