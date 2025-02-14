package modelo;

import java.util.ArrayList;

public class arregloFlores {

    private static arregloFlores instancia;
    private ArrayList<modeloFlores> listaFlores = new ArrayList<>();

    public static arregloFlores getInstancia() {
        if (instancia == null) {
            instancia = new arregloFlores();
        }
        return instancia;
    }

    public void agregarFlores(String nombre, double precio, int cantidad) {

        listaFlores.add(new modeloFlores(nombre, precio, cantidad));
    }

    public void mostrarLista() {
        if (listaFlores.isEmpty()) {
            System.out.println("La lista no tiene flores");
        } else {
            System.out.println("===FLORES REGISTRADAS===");
            for (modeloFlores listaFlore : listaFlores) {
                System.out.println(listaFlore);
            }
        }
    }

}
