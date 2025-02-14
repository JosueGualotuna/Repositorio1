package vista;

import java.util.Scanner;
import modelo.arregloFlores;

public class vistaFlores {

    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    int cantidad = 0;
    double precio = 0;

    public void mostrarLista(arregloFlores flores) {
        flores.mostrarLista();
    }

    public String ingresarNombre() {
        System.out.print("Ingrese el nombre de la flor: ");
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

    public double ingresarPrecio() {
        System.out.print("Ingrese el precio de la flor: ");
        while (true) {
            if (!entrada.hasNextDouble()) {
                System.out.print("Ingrese un valor numerico: ");
                entrada.nextLine();
            } else {
                precio = entrada.nextDouble();
                entrada.nextLine();
                return precio;
            }

        }
    }

    public int iingresarCantidad() {
        System.out.print("Ingrese la cantidad de flores: ");
        while (true) {
            if (!entrada.hasNextInt()) {
                System.out.print("Ingrese un valor numerico: ");
                entrada.nextLine();
            } else {
                cantidad = entrada.nextInt();
                entrada.nextLine();
                return cantidad;
            }
        }
    }

    public void totalPagar() {
        System.out.println("El total a pagar por " + nombre + " es: " + (precio * cantidad) + " dolares");
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
