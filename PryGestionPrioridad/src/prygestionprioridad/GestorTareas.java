
package prygestionprioridad;

import java.util.ArrayList;
import java.util.List;


public class GestorTareas {
 
    ArrayList<tareas> listaTareas = new ArrayList<>();
            
   public void agregarTarea(tareas tareaAgregada){
       listaTareas.add(tareaAgregada);
   }
    
   public void mostrarTarea(){
   
  for (tareas tareaMostrada : listaTareas) {
  if(tareaMostrada.getPrioriodad()<5){
      System.out.println(tareaMostrada);
  }else{
   if(tareaMostrada.getPrioriodad()<4){
      System.out.println(tareaMostrada);
   }     
   else{
   if(tareaMostrada.getPrioriodad()<3){
      System.out.println(tareaMostrada);
  }  
     else{
   if(tareaMostrada.getPrioriodad()<2){
      System.out.println(tareaMostrada);
  } 
     else{
   if(tareaMostrada.getPrioriodad()<1){
      System.out.println(tareaMostrada);
  } 
   }        
   }        }      
     }
   }
   }
       public tareas buscarTarea(String nombre) {
        for (tareas tareaBuscada : listaTareas) {
            if (tareaBuscada.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Tarea encontrada ");
                
                return tareaBuscada;
            }
            
        }
        System.out.println("Producto no encontrado");
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
