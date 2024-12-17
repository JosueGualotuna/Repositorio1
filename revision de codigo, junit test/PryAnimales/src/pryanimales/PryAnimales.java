package pryanimales;

import java.util.Scanner;

public class PryAnimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.print("MENU\nElige una opcion numerica del tipo de animal que quiera trabajar: ");
        do {
            System.out.println("\n1. Mamifero");
            System.out.println("2. Ave");
            System.out.println("3. Reptil");
            System.out.println("4. Salir");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Mamifero");
                    System.out.print("Nombre: ");
                    String nombreMamifero = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadMamifero = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Tipo de pelaje: ");
                    String tipoPelaje = scanner.nextLine();
                    System.out.println("\n");
                    Mamifero mamifero = new Mamifero(tipoPelaje, nombreMamifero, edadMamifero);
                    mamifero.comer();
                    mamifero.dormir();
                    mamifero.edad();
                    mamifero.amamantarCrias();
                    break;

                case 2:
                    System.out.println("Ave");
                    System.out.print("Nombre: ");
                    String nombreAve = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadAve = scanner.nextInt();
                    System.out.print("Envergadura de alas (metros): ");
                    double envergadura = scanner.nextDouble();
                    System.out.println("\n");

                    Ave ave = new Ave(envergadura, nombreAve, edadAve);
                    ave.comer();
                    ave.dormir();
                    ave.edad();
                    ave.volar();
                    break;

                case 3:
                    System.out.println("Reptil");
                    System.out.print("Nombre: ");
                    String nombreReptil = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadReptil = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de escamas: ");
                    String tipoEscamas = scanner.nextLine();
                    System.out.println("\n");

                    Reptil reptil = new Reptil(tipoEscamas, nombreReptil, edadReptil);
                    reptil.comer();
                    reptil.dormir();
                    reptil.edad();
                    reptil.arrastrarse();
                    break;

                case 4:
                    System.out.println("Salir del programa");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
        
    }
}
