package EjercicioEmpresaEmpleado;
import java.util.ArrayList;
import java.util.Scanner;
public class Empresa {
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENU");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado por cedula");
            System.out.println("3. Eliminar empleado por cedula");
            System.out.println("4. Mostrar lista de empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada1.nextInt();
            entrada1.nextLine(); 

            switch (opcion) {
                case 1: agregarEmpleado(entrada1);
                break;
                case 2: buscarEmpleado(entrada1);
                break;
                case 3: eliminarEmpleado(entrada1);
                break;
                case 4: mostrarEmpleados();
                break;
                default: System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 5);

    }

    private static void agregarEmpleado(Scanner entrada) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la cedula del empleado: ");
        String cedula = entrada.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = entrada.nextDouble();

        Empleado empleado = new Empleado(nombre, cedula, salario);
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado exitosamente.");
    }

    private static void buscarEmpleado(Scanner entrada) {
        System.out.print("Ingrese la cedula del empleado a buscar: ");
        String cedula = entrada.nextLine();

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equals(cedula)) {
                System.out.println("Empleado encontrado: " + empleado);
                return;
            }
        }

        System.out.println("No se encontro ningun empleado con esa cedula.");
    }

    private static void eliminarEmpleado(Scanner entrada) {
        System.out.print("Ingrese la cedula del empleado a eliminar: ");
        String cedula = entrada.nextLine();

        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)) {
                listaEmpleados.remove(i);
                System.out.println("Empleado eliminado");
                return;
            }
        }

        System.out.println("No se encontro ningun empleado con esa cedula");
    }

    private static void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
        } else {
            System.out.println("\n LISTA DE EMPLEADOS");
            listaEmpleados.forEach(System.out::println);
        }
    }
}