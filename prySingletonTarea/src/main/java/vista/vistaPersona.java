package vista;

import java.util.Scanner;
import modelo.arregloPersona;

public class vistaPersona {

    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    int edad = 0;

    public void mostrarLista(arregloPersona persona) {
        persona.mostrarLista();
    }

    public String ingresarNombre() {
        System.out.print("Ingrese el nombre de la persona: ");
        while (true) {
            if (entrada.hasNextDouble()) {
                System.out.print("Ingrese solo letras: ");
                entrada.nextLine();
            } else {
                if (entrada.hasNextLine()) {
                    nombre = entrada.nextLine();
                    return nombre;
                }
            }
        }
    }

    public int ingresarEdad() {
        System.out.print("Ingrese la edad: ");
        while (true) {
            if (entrada.hasNextInt()) {
                edad = entrada.nextInt();
                entrada.nextLine();
                return edad;
            } else {
                System.out.print("Ingrese un valor numerico entero: ");
                entrada.nextLine();
            }

        }
    }

    public void VerificarEdad() {

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad, tiene " + edad + "  anios");
        } else {
            if (edad < 18) {
                System.out.println(nombre + " es menor de edad, tiene " + edad + " anios");
            }
        }
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
