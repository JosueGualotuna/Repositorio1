package controlador;

import modelo.arregloColores;
import vista.vistaColores;

public class controladorColores {

    private arregloColores arreglo;
    private vistaColores vista;

    public controladorColores(arregloColores arreglo, vistaColores vista) {
        this.arreglo = arreglo;
        this.vista = vista;
    }

    public void agregarColores() {
        String nombre = vista.IngresarColor();
        arreglo.agregarColores(nombre);
        vista.mensaje("*color agregado exitosamente*");
    }

    public void mostrarColores() {
        vista.mostrarLista(arreglo);
    }

    public void ColorPrimario() {
        vista.ColorPrimario();
    }

    public void CantidadLetras() {
        vista.cantidadLetras();
    }
}
