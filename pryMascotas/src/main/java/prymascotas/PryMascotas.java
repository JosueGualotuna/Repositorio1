
package prymascotas;
import java.util.Scanner;
public class PryMascotas {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
                Scanner edad = new Scanner(System.in);
        Scanner entradaMascota = new Scanner(System.in);

String mascota = "";

do{
            System.out.println("MIS MASCOTAS");
    System.out.println("Ingrese el tipo de animal: \nperro \npez");
        System.out.println("Nota: para terminar el programa digite 'salir' "); 
    System.out.print("ENTRADA: ");
     mascota = entradaMascota.nextLine();
    
     if (mascota.equals("salir")){
         System.out.println("Usted salio del programa");
         break;
     }
     
   switch (mascota){
     case "perro":
                  System.out.println("\n");

System.out.print("Ingrese el nombre del perro: ");    
String nombrePerro = nombre.nextLine();
System.out.print("Ingrese la edad del perro: ");                
int edadPerro = edad.nextInt();
Perro perro1 = new Perro(nombrePerro,edadPerro);
         System.out.println("\n");
perro1.edad();
perro1.comer();
perro1.dormir();
perro1.jugar();
perro1.mostrarCarino();
         System.out.println("\n");
break;
     case "pez":
                  System.out.println("\n");

         System.out.print("Ingrese el nombre del pez: ");    
String nombrePez = nombre.nextLine();

System.out.print("Ingrese la edad del pez: ");                
int edadPez = edad.nextInt();

         System.out.println("\n");
Pez pez1 = new Pez(nombrePez,edadPez);
pez1.edad();
pez1.comer();
pez1.dormir();    
         System.out.println("\n");
break;
     default: System.out.println("Esa mascota no esta registrada\n");
   }
}
   while(!mascota.equals("salir"));            
}
}
