package prysingletontarea;

import controlador.controladorColores;
import controlador.controladorFlores;
import controlador.controladorGrado;
import controlador.controladorInstrumento;
import controlador.controladorPersona;
import java.util.Scanner;
import modelo.arregloColores;
import modelo.arregloFlores;
import modelo.arregloGrado;
import modelo.arregloInstrumento;
import modelo.arregloPersona;
import vista.vistaColores;
import vista.vistaFlores;
import vista.vistaGrado;
import vista.vistaInstrumento;
import vista.vistaPersona;

public class PrySingletonTarea {

    public static void main(String[] args) {
        arregloInstrumento arregloInstrumento1 = arregloInstrumento.getInstancia();
        vistaInstrumento vistainsInstrumento1 = new vistaInstrumento();
        controladorInstrumento controladorInstrumento1 = new controladorInstrumento(vistainsInstrumento1, arregloInstrumento1);

        arregloFlores arregloFlores1 = arregloFlores.getInstancia();
        vistaFlores vistaFlores1 = new vistaFlores();
        controladorFlores controladorFlores1 = new controladorFlores(arregloFlores1, vistaFlores1);

        arregloColores arreglocoColores1 = arregloColores.getInstancia();
        vistaColores vistaColores1 = new vistaColores();
        controladorColores controladorColores1 = new controladorColores(arreglocoColores1, vistaColores1);

        arregloPersona arregloperPersona1 = arregloPersona.getInstancia();
        vistaPersona vistapersoPersona1 = new vistaPersona();
        controladorPersona controladorPersona1 = new controladorPersona(arregloperPersona1, vistapersoPersona1);

        arregloGrado arreglogGrado1 = arregloGrado.getInstancia();
        vistaGrado vistaGrado1 = new vistaGrado();
        controladorGrado controladorGrado1 = new controladorGrado(arreglogGrado1, vistaGrado1);

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("===MENU DE EJEMPLOS, SINGLETON CON MVC===");
            System.out.println("1) Instrumentos");
            System.out.println("2) Flores");
            System.out.println("3) Colores");
            System.out.println("4) Personas");
            System.out.println("5) Grados centigrados");
            System.out.println("6) salir");
            System.out.print("ENTRADA: ");
            while (true) {
                if (entrada.hasNextInt()) {
                    opcion = entrada.nextInt();
                    break;
                } else {
                    System.out.println("Ingrese una opcion valida");
                    entrada.nextLine();
                }
            }
            entrada.nextLine();
            switch (opcion) {

                case 1:
                    controladorInstrumento1.agregarInstrumento();
                    controladorInstrumento1.mostrarLista();
                    controladorInstrumento1.CaroBarato();

                    break;
                case 2:
                    controladorFlores1.agregarFlor();
                    controladorFlores1.mostrarLista();
                    controladorFlores1.totalPagar();

                    break;
                case 3:

                    controladorColores1.agregarColores();
                    controladorColores1.mostrarColores();
                    controladorColores1.ColorPrimario();
                    controladorColores1.CantidadLetras();
                    break;
                case 4:

                    controladorPersona1.agregarPersona();
                    controladorPersona1.mostrarLista();
                    controladorPersona1.VerificarEdad();

                    break;
                case 5:

                    controladorGrado1.agregarGrado();
                    controladorGrado1.mostrarLista();
                    controladorGrado1.verificarTemperatura();
                    break;
                case 6:
                    System.out.println("El programa finalizo");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 6);

    }
}
