package modelo;

import java.util.ArrayList;

public class arregloPersona {

    private static arregloPersona instancia;
    ArrayList<modeloPersona> listaPersona = new ArrayList<>();

    public static arregloPersona getInstancia() {
        if (instancia == null) {
            instancia = new arregloPersona();
        }
        return instancia;
    }

    public void agregarPersona(String nombre, int edad) {
        listaPersona.add(new modeloPersona(nombre, edad));
    }

    public void mostrarLista() {
        System.out.println("===PERSONAS REGISTRADAS===");
        if (listaPersona.isEmpty()) {
            System.out.println("La lista no tiene estudiantes");
        } else {
            for (modeloPersona persona : listaPersona) {
                System.out.println(persona);
            }

        }
    }

}
