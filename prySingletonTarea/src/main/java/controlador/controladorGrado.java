package controlador;

import modelo.arregloGrado;
import vista.vistaGrado;

public class controladorGrado {

    private arregloGrado arreglo;
    private vistaGrado vista;

    public controladorGrado(arregloGrado arreglo, vistaGrado vista) {
        this.arreglo = arreglo;
        this.vista = vista;
    }

    public void agregarGrado() {
        double grado = vista.IngresarGrado();
        arreglo.agregarGrado(grado);
        vista.mensaje("*grado centigrado agregado exitosamente*");
    }

    public void mostrarLista() {
        vista.mostrarLista(arreglo);
    }

    public void verificarTemperatura() {
        vista.VerificarTemperatura();
    }
}
