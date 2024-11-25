
package ejercicio;
import java.util.Scanner;
public class Empleado {

String nombre;
String cedula;


public Empleado (String nombre,String cedula){
this.nombre = nombre;    
 this.cedula = cedula;
    }

public void mostrarDatos (){
    System.out.println("Nombre del empleado: "+nombre);    
    System.out.println("Cedula del empleado: "+cedula);
}

public static void imprimir(){
  String contrasenareal = "java123";
        Scanner entrada = new Scanner(System.in);
              String contrasena;
 do {
         System.out.println("Digite la clave: ");
contrasena = entrada.next();   
 
if(!contrasena.equals(contrasenareal)){
    System.out.println("CONTRASENA INCORRECTA, INTENTAR DE NUEVO");  
} 


}
while (!contrasena.equals(contrasenareal));
    System.out.println("CONTRASENA CORRECTA, ACCESO CONCEDIDO");

}
}
