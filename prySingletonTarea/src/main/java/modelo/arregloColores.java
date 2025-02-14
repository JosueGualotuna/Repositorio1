package modelo;

import java.util.ArrayList;

public class arregloColores {

    private static arregloColores instancia;
    private ArrayList<modeloColores> listaColores = new ArrayList<>();

    public static arregloColores getInstancia() {
        if (instancia == null) {
            instancia = new arregloColores();
        }
        return instancia;
    }

    public void agregarColores(String nombre) {
        listaColores.add(new modeloColores(nombre));
    }

    public void mostrarLista() {
        if (listaColores.isEmpty()) {
            System.out.println("La lista no tiene colores");
        } else {
            System.out.println("===COLORES REGISTRADOS===");
            for (modeloColores listaColore : listaColores) {
                System.out.println(listaColore);
            }
        }

    }
}
