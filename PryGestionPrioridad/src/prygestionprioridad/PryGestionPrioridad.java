
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
            System.out.println("3) Eliminar tarea completada");
            System.out.println("4) Salir");
            System.out.print("ENTRADA: ");

            while(true){
if(entrada.hasNextInt()){
       opcion = entrada.nextInt();
break;    
}else{

    System.out.println("ingrese una valor numerico");
    entrada.nextLine();
}                       
            }


entrada.nextLine();
            System.out.println("");
switch(opcion){

    case 1: 
        System.out.println("Ingrese el nombre de la tarea");
String nombre;


nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de prioridad de la tarea (1 a 5)");
int prioridad;
while(true){
if(entrada.hasNextInt()){
while(true){
 prioridad = entrada.nextInt();
if(prioridad>5||prioridad<1){
    System.out.println("la prioridad debe estar en el rango 1 a 5, intente nuevamente");    
    entrada.nextLine();
}else{
break;}
}
break;}
else{
    System.out.println("ingrese un valor numerico");
entrada.nextLine();
}
}

        tareas tareaMain = new tareas(nombre, prioridad);
        tareaMain.setNombre(nombre);
                tareaMain.setPrioridad(prioridad);
gestorMain.agregarTarea(tareaMain);
System.out.println("");

break;
    case 2:
        System.out.println("===TAREAS===");
gestorMain.mostrarTarea();
        System.out.println("");
break;
    case 3:
        System.out.println("ingrese el nombre de la tarea completada para eliminarla");
                String tareaEliminar = entrada.nextLine();
gestorMain.eliminarProducto(tareaEliminar);
        System.out.println("");
        break;
    case 4: 
        System.out.println("programa finalizado");
        break;
    default: System.out.println("opcion no valida"); 
}
        }
while(opcion!=4);

    }
    
}
