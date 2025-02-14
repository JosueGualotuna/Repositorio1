package controlador;

import modelo.arregloFlores;
import vista.vistaFlores;

public class controladorFlores {

    private arregloFlores arreglo;
    private vistaFlores vista;

    public controladorFlores(arregloFlores arreglo, vistaFlores vista) {
        this.arreglo = arreglo;
        this.vista = vista;
    }

    public void agregarFlor() {
        String nombre = vista.ingresarNombre();
        double precio = vista.ingresarPrecio();
        int cantidad = vista.iingresarCantidad();
        arreglo.agregarFlores(nombre, precio, cantidad);
        vista.mensaje("*Flor agregada exitosamente*");

    }

    public void mostrarLista() {
        vista.mostrarLista(arreglo);
    }

    public void totalPagar() {
        vista.totalPagar();
    }

}
