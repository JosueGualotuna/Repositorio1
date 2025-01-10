



package prytienda;

import java.util.ArrayList;
import java.util.List;


public class Inventario {
    
List<Producto> listaProductos = new ArrayList<Producto>();    

public void agregarProducto(Producto prod){
listaProductos.add(prod);
}  

public void  mostrarProducto(){
    if(listaProductos.isEmpty()){
        System.out.println("Aun no se han agregado productos");
    }
    else{
            for (Producto prod : listaProductos) {
                System.out.println(prod);
            } 
             }
}

    public Producto buscarProducto(String nombre) {
        for (Producto prod : listaProductos) {
            if (prod.getNombre().equalsIgnoreCase(nombre)) {
                return prod;
       
            }
            
        }
        return null;
    }

   public double calcularValorTotal() {
        double total = 0;
        for (Producto prod : listaProductos) {
            total += prod.getCantidad() * prod.getPrecio();
        }
        return total;
    } 
    
public void eliminarProducto(String nombre) {
        Producto prod = buscarProducto(nombre);
if(prod== null){
    System.out.println("Producto no encontrado");    
}
else{
            listaProductos.remove(prod);
            System.out.println("*Producto eliminado*");
}
    }   
}
