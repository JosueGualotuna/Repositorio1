
package prytienda;
import java.util.Scanner;

public class Producto {
Scanner entrada = new Scanner(System.in);  
String nombre;    
int cantidad;
double precio;


public Producto(String nombre, int cantidad, double precio) {

    this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
while(cantidad<0){
    System.out.print("ERROR, la cantidad no puede ser negativa, ingrese un valor nuevamente: ");    
int cantidadNueva= entrada.nextInt();
cantidad = cantidadNueva;
}
   this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        while(precio<0){
    System.out.print("ERROR, el precio no puede ser negativo, ingrese un valor nuevamente: ");    
int precioNuevo= entrada.nextInt();
precio = precioNuevo;
}
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre: " + nombre + ", cantidad: " + cantidad + ", precio: " + precio + " dolares"+'}';
    }
    
}