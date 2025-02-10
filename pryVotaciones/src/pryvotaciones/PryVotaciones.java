package pryvotaciones;

import Controlador.Registro;
import Modelo.Candidato;
import Modelo.Ciudadano;
import java.util.Scanner;

public class PryVotaciones {

    /*
modelo 
    candidato (nombre, nombrepartido);
    ciudadano (nombres cedula);
    controler
    registro votaciones
vista
1
2
3

ingrese la cedula, ingrese sus datos    
    
cerrar conteo
resultado    
    
     */
    public static void main(String[] args) {

        Registro registroMain = new Registro();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("===VOTACIONES===");
            System.out.println("Seleccione al candidato que desea apoyar");
            System.out.println("1) Daniel Noboa");
            System.out.println("2) Luisa Gonzalez");
            System.out.println("3) Andrea Gonzalez");
            System.out.println("4) Terminar con el conteo de votos");
            System.out.println("ENTRADA: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del ciudadano; ");
                    String nombre1 = entrada.nextLine();
                    System.out.print("Ingrese la cedula del ciudadano: ");
                    int cedula1 = entrada.nextInt();
                    Ciudadano ciudadanoNoboa = new Ciudadano(nombre1, cedula1);
                    registroMain.agregarNoboa(ciudadanoNoboa);
                    System.out.println("");
                    System.out.println("==CIUDADANOS A FAVOR DE DANIEL NOBOA===");
                    registroMain.mostrarNoboa();
                    System.out.println("");
                    System.out.println("===CANTIDAD DE VOTOS A FAVOR DE DANIEL NOBOA===");
                    System.out.println(registroMain.cantidadVotosNoboa() + " votos");
                    System.out.println("");

                    break;
                case 2:
                    System.out.print("Ingrese el nombre del ciudadano; ");
                    String nombre2 = entrada.nextLine();
                    System.out.print("Ingrese la cedula del ciudadano: ");
                    int cedula2 = entrada.nextInt();
                    Ciudadano ciudadanoLuisa = new Ciudadano(nombre2, cedula2);
                    registroMain.agregarLuisa(ciudadanoLuisa);
                    System.out.println("");
                    System.out.println("==CIUDADANOS A FAVOR DE ANDREA GONZALEZ===");
                    registroMain.mostrarLuisa();
                    System.out.println("");
                    System.out.println("===CANTIDAD DE VOTOS A FAVOR DE ANDREA GONZALEZ===");
                    System.out.println(registroMain.cantidadVotosLuisa() + " votos");
                    System.out.println("");

                    break;
                case 3:
                    System.out.print("Ingrese el nombre del ciudadano; ");
                    String nombre3 = entrada.nextLine();
                    System.out.print("Ingrese la cedula del ciudadano: ");
                    int cedula3 = entrada.nextInt();
                    Ciudadano ciudadanoAndrea = new Ciudadano(nombre3, cedula3);
                    registroMain.agregarAndrea(ciudadanoAndrea);
                    System.out.println("");
                    System.out.println("==CIUDADANOS A FAVOR DE LUISA GONZALEZ===");
                    registroMain.mostrarAndrea();
                    System.out.println("");
                    System.out.println("===CANTIDAD DE VOTOS A FAVOR DE LUISA GONZALEZ===");
                    System.out.println(registroMain.cantidadVotosAndrea() + " votos");
                    System.out.println("");

                    break;
                case 4:
                    System.out.println("===VOTOS FINALES===");
                    int votosNoboa = registroMain.cantidadVotosNoboa();

                    System.out.println("Votos a favor de Daniel Noboa: " + votosNoboa);
                    System.out.println("Votos a favor de Luisa Gonzalez: " + registroMain.cantidadVotosLuisa());
                    System.out.println("Votos a favor de Andrea Gonzalez: " + registroMain.cantidadVotosAndrea());
                    int totalvotos = registroMain.cantidadVotosAndrea() + registroMain.cantidadVotosLuisa() + registroMain.cantidadVotosNoboa();
                    System.out.println("Votos totales: " + totalvotos);
                    System.out.println("");
                    System.out.println("");
                    if (registroMain.cantidadVotosNoboa() > registroMain.cantidadVotosLuisa() && registroMain.cantidadVotosNoboa() > registroMain.cantidadVotosAndrea()) {
                        System.out.println("===GANADOR DE LAS ELECCIONES===");

                        System.out.println("Daniel Noboa gana con: " + registroMain.cantidadVotosNoboa() + " votos");
                        System.out.println("Los votos de Daniel Noboa equivalen al " + registroMain.porcentajeNoboa() + " % del total");
                    } else {
                        if (registroMain.cantidadVotosLuisa() > registroMain.cantidadVotosNoboa() && registroMain.cantidadVotosLuisa() > registroMain.cantidadVotosAndrea()) {
                            System.out.println("===GANADOR DE LAS ELECCIONES===");

                            System.out.println("Luisa Gonzalez gana con: " + registroMain.cantidadVotosLuisa() + " votos");
                            System.out.println("Los votos de Luisa Gonzalez equivalen al " + registroMain.porcentajeLuisa() + " % del total");

                        } else {
                            if (registroMain.cantidadVotosAndrea() > registroMain.cantidadVotosNoboa() && registroMain.cantidadVotosAndrea() > registroMain.cantidadVotosLuisa()) {
                                System.out.println("===GANADOR DE LAS ELECCIONES===");

                                System.out.println("Andrea Gonzalez gana con: " + registroMain.cantidadVotosAndrea() + " votos");
                                System.out.println("Los votos de Andrea Gonzalez equivalen al " + registroMain.porcentajeAndrea() + " % del total");

                            }
                        }
                    }
                    break;

            }
        } while (opcion != 4);
    }
}
