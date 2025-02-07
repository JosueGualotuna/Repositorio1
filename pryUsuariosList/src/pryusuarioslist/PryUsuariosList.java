package pryusuarioslist;

import java.util.Scanner;

public class PryUsuariosList {

    public static void main(String[] args) {

        usuarioReportes reportes = new usuarioReportes();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("====GESTION DE ESTUDIANTES===");
            System.out.println("1) Agregar estudiante");
            System.out.println("2) Mostrar todos los estudiantes");
            System.out.println("3) Mostrar estudiantes masculinos");
            System.out.println("4) Mostrar estudiantes femeninos ");
            System.out.println("5) Eliminar estudiante");
            System.out.println("6) salir");
            System.out.print("ENTRADA: ");
            while (true) {
                if (entrada.hasNextInt()) {
                    opcion = entrada.nextInt();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Ingrese una opcion valida");
                    entrada.nextLine();
                }
            }
            System.out.println("");

            entrada.nextLine();
            switch (opcion) {
                case 1:

                    System.out.print("cuantos estudiantes desea ingresar? ");
                    int cantidad = 0;
                    while (true) {
                        if (entrada.hasNextInt()) {
                            cantidad = entrada.nextInt();
                            break;
                        } else {
                            System.out.print("Ingrese un numero entero: ");
                            entrada.nextLine();
                        }

                    }
                    System.out.println("");
                    entrada.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");

                        String nombre = "";
                        while (true) {
                            if (entrada.hasNextDouble() || entrada.hasNextInt()) {
                                System.out.println("Ingrese unicamente letras");
                                System.out.print("Ingrese el nombre nuevamente: ");
                                entrada.nextLine();
                            } else {
                                if (entrada.hasNextLine()) {
                                    nombre = entrada.nextLine();
                                    break;
                                }
                            }
                        }

                        System.out.println("");
                        System.out.print("Ingrese el sexo del estudiante " + (i + 1) + " (masculino/femenino): ");
                        String sexoString = "";
                        boolean sexoBoolean = false;

                        while (true) {
                            if (entrada.hasNextDouble() || entrada.hasNextInt()) {
                                System.out.println("No puede ingresar numeros");
                                System.out.print("Ingrese el sexo nuevamente: ");
                                entrada.nextLine();
                            } else {
                                if (entrada.hasNextLine()) {
                                    sexoString = entrada.nextLine();
                                    if (sexoString.equalsIgnoreCase("masculino")) {
                                        sexoBoolean = true;
                                        break;
                                    } else {
                                        if (sexoString.equalsIgnoreCase("femenino")) {
                                            sexoBoolean = false;
                                            break;
                                        }
                                    }
                                    if (!sexoString.equalsIgnoreCase("masculino") || !sexoString.equalsIgnoreCase("femenino")) {
                                        System.out.println("Ingrese uno de los dos sexos");
                                        System.out.print("Ingrese el sexo nuevamente: ");

                                    }
                                }
                            }
                        }
                        System.out.println("");
                        System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
                        double nota = 0;
                        while (true) {
                            if (entrada.hasNextDouble()) {
                                nota = entrada.nextDouble();
                                break;
                            } else {
                                System.out.print("Ingrese unicamente numeros");
                                System.out.println("Ingrese la nota nuevamente: ");
                                entrada.nextLine();
                            }
                        }

                        modeloEstudiante modelo = new modeloEstudiante(nombre, sexoBoolean, nota);
                        reportes.agregar(modelo);
                        System.out.println("*estudiante agregado exitosamente*");
                        System.out.println("");
                        entrada.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("===LISTA DE ESTUDIANTES===");
                    reportes.mostrar();
                    System.out.println("");
                    break;

                case 3:
                    reportes.mostrarMasculino();
                    System.out.println("");
                    break;
                case 4:
                    reportes.mostrarFemenino();
                    System.out.println("");
                    break;
                case 5:
                    String nombre = "";
                    System.out.print("Ingrese el nombre del estudiante a eliminar: ");
                    nombre = entrada.nextLine();
                    reportes.eliminar(nombre);
                    break;
                case 6:
                    System.out.println("programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no existente");
                    System.out.println("");
            }

        } while (opcion != 6);

    }

}
