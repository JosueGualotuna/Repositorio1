
package prygestionprioridad;

import java.util.ArrayList;


public class GestorTareas {
 
    ArrayList<tareas> listaTareas = new ArrayList<>();
            
   public void agregarTarea(tareas tareaAgregada){
for (tareas tarea : listaTareas) {
            if (tarea.getNombre().equalsIgnoreCase(tareaAgregada.getNombre())) {
                System.out.println("La tarea '" + tareaAgregada.getNombre() + "' ya existe, ingrese otra tarea");
                return; 
            }
        }

        listaTareas.add(tareaAgregada);
                System.out.println("*tarea agregada exitosamente*"); 

    }   
    
   public void mostrarTarea(){
   
         int n = listaTareas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (listaTareas.get(j).getPrioridad() > listaTareas.get(j + 1).getPrioridad()) {
                    tareas temp = listaTareas.get(j);
                    listaTareas.set(j, listaTareas.get(j + 1));
                    listaTareas.set(j + 1, temp);
                }
            }
        }

        System.out.println("Lista de tareas ordenadas por prioridad:");
        for (tareas tareaMostrada : listaTareas) {
            System.out.println(tareaMostrada);
        }
   }
       public tareas buscarTarea(String nombre) {
        for (tareas tareaBuscada : listaTareas) {
            if (tareaBuscada.getNombre().equalsIgnoreCase(nombre)) {                
                return tareaBuscada;
            }
            
        }
        System.out.println("tarea no encontrada");
                        System.out.print("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");

        return null;
    }

   public void eliminarProducto(String nombre) {
        tareas tareaEliminada = buscarTarea(nombre);
if(tareaEliminada== null){
    System.out.println("tarea no encontrada");    
}
else{
            listaTareas.remove(tareaEliminada);
            System.out.println("*tarea eliminada*");
}
    }
   
   
   
}
