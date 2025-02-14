package modelo;

import java.util.ArrayList;

public class arregloInstrumento {

    private static arregloInstrumento instancia;
    private ArrayList<modeloInstrumento> listaInstrumento = new ArrayList<>();

    public static arregloInstrumento getInstancia() {
        if (instancia == null) {
            instancia = new arregloInstrumento();
        }
        return instancia;
    }

    public void agregarInstrumento(String nombre, double precio, int cantidad) {
        listaInstrumento.add(new modeloInstrumento(nombre, precio, cantidad));
    }

    public void mostrarLista() {
        if (listaInstrumento.isEmpty()) {
            System.out.println("La lista no tiene instrumentos");
        } else {
            System.out.println("===INSTRUMENTOS REGISTRADOS===");
            for (modeloInstrumento instrumento : listaInstrumento) {
                System.out.println(instrumento);
            }
        }

    }

}
