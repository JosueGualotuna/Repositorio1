package controlador;

import modelo.arregloPersona;
import vista.vistaPersona;

public class controladorPersona {

    private arregloPersona arreglo;
    private vistaPersona vista;

    public controladorPersona(arregloPersona arreglo, vistaPersona vista) {
        this.arreglo = arreglo;
        this.vista = vista;
    }

    public void agregarPersona() {
        String nombre = vista.ingresarNombre();
        int edad = vista.ingresarEdad();
        arreglo.agregarPersona(nombre, edad);
        vista.mensaje("*Persona agregada exitosamente*");
    }

    public void mostrarLista() {
        vista.mostrarLista(arreglo);
    }

    public void VerificarEdad() {
        vista.VerificarEdad();
    }

}
