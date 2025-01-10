
package prytienda;
import java.util.Scanner;

public class PryTienda {

    public static void main(String[] args) {
        Inventario mainInventario = new Inventario();

Scanner entrada = new Scanner(System.in); 
int opcion =0;
do{
   
    System.out.println("                                     *MENU*");    
    System.out.println("1. Ingresar un producto al inventario (nombre, cantidad, precio)");
    System.out.println("2. mostrar la lista de productos");
    System.out.println("3. Buscar producto");
        System.out.println("4. Calcular el valor total del inventario");
                System.out.println("5. Eliminar un producto");
    System.out.println("6. Terminar el programa");
    System.out.print("ENTRADA: ");
    opcion= entrada.nextInt();
    System.out.println();   
   entrada.nextLine(); 
   if(opcion==6){
       System.out.println("Programa finalizado");
   break;    
   }
switch(opcion){   
    case 1:
        System.out.print("Ingrese el nombre del producto: ");
String nombre = entrada.nextLine();
        System.out.print("Ingrese la cantidad del producto: ");
int cantidad = entrada.nextInt();
        System.out.print("Ingrese el precio del producto: ");
double precio = entrada.nextDouble();
Producto mainProducto = new Producto(nombre,cantidad,precio);
mainProducto.setNombre(nombre);
mainProducto.setCantidad(cantidad);
mainProducto.setPrecio(precio);

mainInventario.agregarProducto(mainProducto);
        System.out.println("*El producto se agrego*");
        System.out.println();
break;

    case 2:
        System.out.println("*Lista de productos*");
mainInventario.mostrarProducto();
        System.out.println();
break;

    case 3:
        System.out.print("Ingrese el nombre del producto que busca: ");
        String nombreBuscar = entrada.nextLine();
        Producto productoBuscado = mainInventario.buscarProducto(nombreBuscar);
        System.out.println("Producto encontrado: "+ productoBuscado);
                System.out.println();

        break;
    case 4:
        System.out.print("El valor total del inventario es: ");
        System.out.println(mainInventario.calcularValorTotal()+ " dolares");   
                System.out.println();

        break;
    case 5:
        System.out.println("Ingrese el nombre del producto a eliminar: ");
                String nombreEliminar = entrada.nextLine();
mainInventario.eliminarProducto(nombreEliminar);
        System.out.println();

        break;
    default: System.out.println("Opcion no valida, ingrese un valor nuevamente");
        System.out.println();
        break;
}
}
while(opcion!=6);
        
    }
}

