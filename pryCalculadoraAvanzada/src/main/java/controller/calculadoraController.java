
package controller;

  
import java.util.Scanner;
import model.calculadoraModel;
import view.calculadoraView;
public class calculadoraController {
private calculadoraModel model;
private calculadoraView view;

    public calculadoraController(calculadoraModel model, calculadoraView view) {
        this.model = model;
        this.view = view;
    }

public void iniciar(){
double num1,num2,numResultado;
int opcion=0;
do{
    System.out.println("            MENU");    
    System.out.println("1) Suma");
        System.out.println("2) Resta");
    System.out.println("3) Multiplicacion");
    System.out.println("4) Dividision");
    System.out.println("5) Raiz cuadrada");
    System.out.println("6) Potencia");
    System.out.println("7) Salir");
    System.out.print("ENTRADA: ");
    Scanner opcionEntrada = new Scanner(System.in);
    
    while(true){
        if(opcionEntrada.hasNextInt()){
opcion = opcionEntrada.nextInt();        
if(opcion>0 && opcion<8){
break;
}
else{
    System.out.println("Debe ingresar un numero valido, intente de nuevo");    
    System.out.print("ENTRADA: ");
}
        }
        else{
            System.out.println("El valor debe ser numerico, intente otra vez");
                System.out.print("ENTRADA: ");
            opcionEntrada.next();
        }
    }
            System.out.println();
    
    if(opcion==7){
        System.out.println("Gracias por usar el programa");
    break;    
    }
    switch(opcion){
        case 1:   
        System.out.println("SUMA");
num1=view.pedirNumero("Ingrese el primer numero: ");
num2=view.pedirNumero("Ingrese el segundo numero: ");
numResultado= model.suma(num1, num2);
            System.out.print("El resultado de la suma es: ");
view.resultado(numResultado);
    System.out.println();

    break;    
        case 2:
    System.out.println("RESTA");
num1=view.pedirNumero("Ingrese el primer numero: ");
    num2  = view.pedirNumero("Ingrese el segundo numero: ");
numResultado=model.resta(num1, num2);
            System.out.print("El resultado de la resta es: ");
    view.resultado(numResultado);
    System.out.println();
break;
        case 3:
    System.out.println("MULTIPLICACION");
num1=view.pedirNumero("Ingrese el primer numero: ");
    num2  = view.pedirNumero("Ingrese el segundo numero: ");
numResultado=model.multiplicacion(num1, num2);
                System.out.print("El resultado de la multiplicacion es: ");
    view.resultado(numResultado);
        System.out.println();
       
break;
        case 4:
    System.out.println("DIVISION");
num1=view.pedirNumero("Ingrese el primer numero: ");
num2= view.pedirDivisor("Ingrese el segundo numero: ");
numResultado= model.division(num1, num2);
            System.out.print("El resultado de la division es: ");
view.resultado(numResultado);
    System.out.println();
break;

        case 5:
    System.out.println("RAIZ CUADRADA");    
    num1=view.pedirRaiz("Ingrese el  numero: ");
numResultado= model.raiz(num1);
            System.out.print("El resultado de la raiz cuadrada es: ");
view.resultado(numResultado);
    System.out.println();
   break;
        case 6:
    System.out.println("POTENCIA");
num1=view.pedirNumero("Ingrese la base: ");
num2=view.pedirNumero("Ingrese el exponente: ");
numResultado= model.potencia(num1,num2);
            System.out.print("El resultado de la potencia es: ");
view.resultado(numResultado);
    System.out.println();
break;
    }
            System.out.println("Desea realizar otra operacion?");
            System.out.println("1) Si");
            System.out.println("2) No");        
            
        while(true){
            if(opcionEntrada.hasNextInt()){
opcion= opcionEntrada.nextInt();
if(opcion>0&&opcion<3){
break;
}       
else{
    System.out.println("Opcion no valida, intente de nuevo");
    opcionEntrada.next();                
            } 
}
            else{
                System.out.println("El valor debe ser numerico, intente de nuevo");
opcionEntrada.next();                
            }
 
        }
 if(opcion==1){     
 }
 else{
     System.out.println("Gracias por usar el programa");     
     break;
 }        
    }
while(opcion!=7);
}


}
