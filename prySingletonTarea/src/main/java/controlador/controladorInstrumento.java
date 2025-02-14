package controlador;

import modelo.arregloInstrumento;
import vista.vistaInstrumento;

public class controladorInstrumento {

    private vistaInstrumento vista;
    private arregloInstrumento arreglo;

    public controladorInstrumento(vistaInstrumento vista, arregloInstrumento arreglo) {
        this.vista = vista;
        this.arreglo = arreglo;
    }

    public void agregarInstrumento() {
        String nombre = vista.ingresarNombre();
        int cantidad = vista.ingresarCantidad();
        double precio = vista.ingresarPrecio();
        arreglo.agregarInstrumento(nombre, precio, cantidad);
        vista.mostrarMensaje("*Instrumento agregado exitosamente*");
    }

    public void mostrarLista() {
        vista.mostrarLista(arreglo);
    }

    public void CaroBarato() {
        vista.BaratoCaro();
    }
}
