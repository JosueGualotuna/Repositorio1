
package prygestionprioridad;

import java.util.Scanner;


public class PryGestionPrioridad {


    public static void main(String[] args) {
GestorTareas gestorMain = new GestorTareas();                
        
        Scanner entrada = new Scanner(System.in); 
     int opcion = 0;           
        do{
        System.out.println("====== GESTION DE TAREAS ======");
        System.out.println("1) Agregar tarea");
            System.out.println("2) Mostrar tareas");
            System.out.println("3) Eliminar tarea por nombre");
            System.out.println("4) Salir");
            System.out.print("ENTRADA: ");
opcion = entrada.nextInt();
entrada.nextLine();
            System.out.println("");
switch(opcion){

    case 1: 
        System.out.println("Ingrese el nombre de la tarea");
String nombre;
nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de prioridad de la tarea");
int prioridad;
prioridad = entrada.nextInt();

        tareas tareaMain = new tareas(nombre, prioridad);
        tareaMain.setNombre(nombre);
                tareaMain.setPrioriodad(prioridad);
gestorMain.agregarTarea(tareaMain);
        System.out.println("*tarea agregada*"); 
System.out.println("");

break;
    case 2:
        System.out.println("===TAREAS===");
gestorMain.mostrarTarea();
        System.out.println("");
break;
    case 3:
        System.out.println("ingrese la tarea a eliminar");
                String tareaEliminar = entrada.nextLine();
gestorMain.eliminarProducto(tareaEliminar);
        System.out.println("");
}
        }
while(opcion!=4);

    }
    
}
