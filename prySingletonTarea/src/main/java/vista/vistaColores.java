package vista;

import java.util.Scanner;
import modelo.arregloColores;

public class vistaColores {

    Scanner entrada = new Scanner(System.in);
    String nombre = "";

    public void mostrarLista(arregloColores colores) {
        colores.mostrarLista();
    }

    public String IngresarColor() {
        System.out.print("Ingrese el nombre del color: ");
        while (true) {
            if (entrada.hasNextDouble()) {
                System.out.print("Ingrese unicamente letras: ");
                entrada.nextLine();
            } else {
                if (entrada.hasNextLine()) {
                    nombre = entrada.nextLine();
                    return nombre;

                }
            }

        }
    }

    public void ColorPrimario() {
        if (nombre.equalsIgnoreCase("Amarillo") || nombre.equalsIgnoreCase("Rojo") || nombre.equalsIgnoreCase("Azul")) {
            System.out.println(nombre + " es un color primario");
        } else {
            System.out.println(nombre + " no es un color primario");
        }
    }

    public void cantidadLetras() {
        System.out.println(nombre + " tiene " + nombre.length() + " letras");
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
