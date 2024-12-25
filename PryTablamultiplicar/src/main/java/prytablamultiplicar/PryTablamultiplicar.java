
package prytablamultiplicar;
import java.util.Scanner;
public class PryTablamultiplicar {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Operacion tabla1 = new TablaMultiplicar();

int opcionMenu =0;
do{
    System.out.println("MENU");
    System.out.print("""
1. Iniciar el programa
2. Terminar el programa                                         
                       """);
    System.out.print("Entrada: ");

    
opcionMenu = scanner.nextInt();
if(opcionMenu==2){
    System.out.println("Usted salio del programa");
    break;    
}
switch(opcionMenu){
    case 1:
            System.out.print("\n");
    System.out.print("Ingrese el numero inicial: ");
    int numInicial =scanner.nextInt(); 
    System.out.print("Ingrese el numero final : ");
    int numFinal =scanner.nextInt();
    
    if(numInicial>numFinal){
       System.out.println("El numero final debe ser mayor al numero inicial\n ");
     
    }
    else{
          System.out.print("Ingrese el numero de iteracion: ");
    int numIter =scanner.nextInt(); 
        System.out.print("\n");

        System.out.println("Ingrese el orden de impresion");
        System.out.print("""
1. Ascendente (de menos a mas)                           
2. Descendente (de mas a menos)          
                           """);  
        System.out.print("Entrada: ");        
int opcionOrden = scanner.nextInt();
do{
if(opcionOrden !=1 && opcionOrden !=2 && opcionOrden !=3){
break;    
}   
    
switch(opcionOrden){
    case 1:
            System.out.print("\n");
 int sumaTotalTabla=0;       
for(int i=numInicial; i<=numFinal;i++){
tabla1.Operacion(i, numIter);
int sumaTabla = tabla1.sumarTabla(i, numIter);

    System.out.println("La suma de la tabla del numero "+(i+1)+" es: "+sumaTabla+"\n");    
   sumaTotalTabla += sumaTabla;

}        
        System.out.println("La suma total de las tablas es: "+ sumaTotalTabla);
 
        System.out.println("\nDesea imprimir nuevamente?");
        System.out.print("""
1. Si, orden ascendente (de menos a mas)                           
2. Si, orden descendente (de mas a menos)          
3. No              
                           """);  
        System.out.print("Entrada: ");        
 opcionOrden = scanner.nextInt();        
        System.out.println("\n"); 
        break;
    case 2:
            System.out.print("\n");
sumaTotalTabla =0;
for(int i=numInicial;i<=numFinal;i++){
tabla1.tablaInvertida(i, numIter);
int sumaTabla = tabla1.sumarTabla(i, numIter);
System.out.println("La suma de la tabla del numero "+(i+1)+" es: "+sumaTabla+"\n");
sumaTotalTabla +=sumaTabla;
    }
        System.out.println("La suma total de las tablas es: "+sumaTotalTabla);    
     
System.out.println("\nDesea imprimir nuevamente?");
        System.out.print("""
1. Si, orden ascendente (de menos a mas)                           
2. Si, orden descendente (de mas a menos)          
3. No                
                           """); 
                System.out.print("Entrada: ");        
 opcionOrden = scanner.nextInt();        
        System.out.println("\n");
        break;
      
}

}

while(opcionOrden!=3);

    
}    

}
}
while(opcionMenu!=2);

    }
}