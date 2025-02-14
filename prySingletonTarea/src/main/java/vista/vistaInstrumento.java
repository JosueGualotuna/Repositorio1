package vista;

import java.util.Scanner;
import modelo.arregloInstrumento;

public class vistaInstrumento {

    private Scanner entrada = new Scanner(System.in);
    private double precio = 0;
    private int cantidad = 0;
    private String nombre = "";

    public void mostrarLista(arregloInstrumento instrumento) {
        instrumento.mostrarLista();
    }

    public String ingresarNombre() {
        System.out.print("Ingrese el nombre del instrumento: ");
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

    public int ingresarCantidad() {
        System.out.print("Ingrese la cantidad de instrumentos: ");
        while (true) {
            if (!entrada.hasNextInt()) {
                System.out.print("Ingrese un valor numerico entero: ");
                entrada.nextLine();
            } else {
                cantidad = entrada.nextInt();
                entrada.nextLine();
                return cantidad;
            }
        }

    }

    public double ingresarPrecio() {
        System.out.print("Ingrese el precio del instrumento: ");
        precio = entrada.nextDouble();
        entrada.nextLine();
        return precio;
    }

    public void BaratoCaro() {
        if (precio <= 50) {
            System.out.println(nombre + " es barato, no pasa de los 50 dolares c/u");
        } else {
            if (precio > 50) {
                System.out.println(nombre + " es caro, pasa de los 50 dolares c/u");
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
