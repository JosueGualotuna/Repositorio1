package vista;

import java.util.Scanner;
import modelo.arregloGrado;

public class vistaGrado {

    Scanner entrada = new Scanner(System.in);
    double grado = 0;

    public void mostrarLista(arregloGrado grado) {
        grado.mostrarLista();
    }

    public double IngresarGrado() {
        System.out.print("Ingrese el grado centigrado (C): ");
        while (true) {
            if (entrada.hasNextDouble()) {
                grado = entrada.nextDouble();
                return grado;
            } else {
                System.out.print("Ingrese un valor numerico: ");
                entrada.nextLine();
            }

        }
    }

    public void VerificarTemperatura() {
        if (grado <= 25 && grado >= 20) {
            System.out.println(grado + " grados centigrados es una temperatura ideal, se encuentra en el rango de 20 a 25 grados centigrados (C)");
        } else {
            if (grado < 20) {
                System.out.println(grado + " grados centigrados es una temperatura fria");
            } else {
                if (grado > 25) {
                    System.out.println(grado + " grados centigrados es una temperatura calida");
                }
            }

        }

    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
