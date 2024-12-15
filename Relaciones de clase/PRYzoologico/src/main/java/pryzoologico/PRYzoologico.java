package pryzoologico;
import java.util.Scanner;

public class PRYzoologico {
    
 public static void main(String[] args) {
Scanner sanimal = new Scanner(System.in);  
Scanner snombre = new Scanner(System.in);
Scanner scaracteristica = new Scanner(System.in);

String nombre,caracteristica; 
double envergadura ;
String animal ="";

do{
     System.out.println("INGRESE EL TIPO DE ANIMAL:  ");
     System.out.println("mamifero");
          System.out.println("ave");
     System.out.println("reptil");
     System.out.println("TERMINAR EL PROGRAMA: \nsalir");
    System.out.print("ENTRADA: ");
      animal = sanimal.nextLine();
      
if (animal.equals("salir")){
    System.out.println("\nUsted salio del programa");       
break;
}     
      
      
switch(animal){
    case "mamifero": 
        System.out.print("\nIngrese el nombre del mamifero: ");
 nombre = snombre.nextLine();
System.out.print("Ingrese el tipo de pelaje: ");    
caracteristica = scaracteristica.nextLine();
Mamifero mamifero1 = new Mamifero(caracteristica,nombre);
        System.out.println("\n");
mamifero1.comer();
mamifero1.amamantarCrias();
mamifero1.dormir();
        System.out.println("\n");
    break;

    case "ave":
        System.out.print("\nIngrese el nombre del ave: ");
    nombre= snombre.nextLine();
    System.out.print("Ingrese el tamano de la envergadura (en metros): ");    
envergadura = scaracteristica.nextDouble();
Ave ave1 = new Ave(envergadura,nombre);
        System.out.println("\n");
ave1.comer();
ave1.volar();
ave1.dormir();
        System.out.println("\n");
break;

    case "reptil": 
        System.out.print("\nIngrese el nombre del reptil: ");
nombre = snombre.nextLine();
        System.out.print("Ingrese el tipo de escamas: ");
caracteristica = scaracteristica.nextLine();        
Reptil reptil1 = new Reptil(caracteristica,nombre);
        System.out.println("\n");
reptil1.comer();
reptil1.arrastrarse();
reptil1.dormir();
        System.out.println("\n");
break;

    default: System.out.println("\nTipo de animal no registrado, ingrese nuevamente");
}
} 
while(!animal.equals("salir"));
 }
}
 