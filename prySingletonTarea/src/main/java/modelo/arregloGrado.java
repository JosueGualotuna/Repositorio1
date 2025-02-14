package modelo;

import java.util.ArrayList;

public class arregloGrado {

    private static arregloGrado instancia;
    private ArrayList<modeloGrado> listaGrados = new ArrayList<>();

    public static arregloGrado getInstancia() {
        if (instancia == null) {
            instancia = new arregloGrado();
        }
        return instancia;
    }

    public void agregarGrado(double grado) {
        listaGrados.add(new modeloGrado(grado));
    }

    public void mostrarLista() {
        System.out.println("===GRADOS CENTIGRADOS REGISTRADOS===");
        if (listaGrados.isEmpty()) {
            System.out.println("La lista no tiene grados centigrados");
        } else {
            for (modeloGrado listaGrado : listaGrados) {
                System.out.println(listaGrado);
            }
        }
    }

}
