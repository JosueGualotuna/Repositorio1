
package Modelo;

import java.util.ArrayList;
import java.util.List;



public class Factura {
 public static   List<Producto> listaProductos = new ArrayList<Producto>();    
   public void agregarProducto(Producto prod){
listaProductos.add(prod);
}  
   
  public double calcularValorTotal() {
        double total = 0;
        for (Producto prod : listaProductos) {
            total += prod.getCantidad() * prod.getPrecioUnitario();
        double totalredondeado = Math.floor(total);
        }
        return total;
    } 
  
  
  
}
