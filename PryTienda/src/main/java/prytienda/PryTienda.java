
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
 while(true){
if(entrada.hasNextInt()){
    opcion = entrada.nextInt();
if(opcion>0&&opcion<7){
    break;
} else{
    System.out.println("Ingrese un numero valido");    
}
}else{
    System.out.println("Ingrese un valor numerico");
    entrada.next();
}     
}
 System.out.println();   
   entrada.nextLine(); 
   if(opcion==6){
       System.out.println("Programa finalizado");
   break;    
   }
switch(opcion){   
    case 1:
        System.out.print("Ingrese el nombre del producto: ");
String nombre;

while(true){
if(entrada.hasNext()){
nombre = entrada.nextLine();
break;

}
else{
    nombre = entrada.nextLine();
    char nombrechar = nombre.charAt(1);
        if(Character.isDigit(nombrechar)){
      System.out.println("Solo se pueden ingresar letras");
    entrada.next();
      
    }
}
}


        System.out.print("Ingrese la cantidad del producto: ");
double cantidad;
        while(true){
if(entrada.hasNextDouble()){
    cantidad = entrada.nextDouble();
if(cantidad>0){
    break;
} else{
    System.out.println("La cantidad no puede ser negativa");    
}
}else{
    System.out.println("Ingrese un valor numerico entero");
    entrada.next();
}     
}


        System.out.print("Ingrese el precio del producto: ");
double precio;
    while(true){
if(entrada.hasNextDouble()){
    precio = entrada.nextDouble();
if(precio>0){
    break;
} else{
    System.out.println("El precio no puede ser negativo");    
}
}else{
    System.out.println("Ingrese un valor numerico");
    entrada.next();
}     
}


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
        System.out.println( productoBuscado);
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