
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
String opcion="";
do{
    System.out.println("            MENU");    
    System.out.println("Seleccione una operacion");
    System.out.println("- Suma");
        System.out.println("- Resta");
    System.out.println("- Multiplicacion");
    System.out.println("- Division");
    System.out.println("- Raiz cuadrada");
    System.out.println("- Potencia");
    System.out.println("- Salir");
    System.out.print("ENTRADA: ");
    Scanner opcionEntrada = new Scanner(System.in);
    
            System.out.println();
            do{
                    opcion = opcionEntrada.nextLine();      
if(!opcion.equalsIgnoreCase("suma")&&!opcion.equalsIgnoreCase("resta")&&!opcion.equalsIgnoreCase("multiplicacion")&&!opcion.equalsIgnoreCase("division")&&!opcion.equalsIgnoreCase("raiz")&&!opcion.equalsIgnoreCase("raiz cuadrada")&&!opcion.equalsIgnoreCase("potencia")&&!opcion.equalsIgnoreCase("salir")){
    System.out.println("Opcion no valida, intente de nuevo");    
}
            }while(!opcion.equalsIgnoreCase("suma")&&!opcion.equalsIgnoreCase("resta")&&!opcion.equalsIgnoreCase("multiplicacion")&&!opcion.equalsIgnoreCase("division")&&!opcion.equalsIgnoreCase("raiz")&&!opcion.equalsIgnoreCase("raiz cuadrada")&&!opcion.equalsIgnoreCase("potencia")&&!opcion.equalsIgnoreCase("salir"));
                   System.out.println();
            
    if(opcion.equalsIgnoreCase("salir")){
        System.out.println("Gracias por usar el programa");
    break;    
    }
    switch(opcion.toLowerCase()){
        case "suma":   
        System.out.println("SUMA");
num1=view.pedirNumero("Ingrese el primer numero: ");
num2=view.pedirNumero("Ingrese el segundo numero: ");
numResultado= model.suma(num1, num2);
            System.out.print("El resultado de la suma es: ");
view.resultado(numResultado);
    System.out.println();

    break;    
        case    "resta":
    System.out.println("RESTA");
num1=view.pedirNumero("Ingrese el primer numero: ");
    num2  = view.pedirNumero("Ingrese el segundo numero: ");
numResultado=model.resta(num1, num2);
            System.out.print("El resultado de la resta es: ");
    view.resultado(numResultado);
    System.out.println();
break;
        case "multiplicacion":
    System.out.println("MULTIPLICACION");
num1=view.pedirNumero("Ingrese el primer numero: ");
    num2  = view.pedirNumero("Ingrese el segundo numero: ");
numResultado=model.multiplicacion(num1, num2);
                System.out.print("El resultado de la multiplicacion es: ");
    view.resultado(numResultado);
        System.out.println();
       
break;
        case "division":
    System.out.println("DIVISION");
num1=view.pedirNumero("Ingrese el primer numero: ");
num2= view.pedirDivisor("Ingrese el segundo numero: ");
numResultado= model.division(num1, num2);
            System.out.print("El resultado de la division es: ");
view.resultado(numResultado);
    System.out.println();
break;

        case "raiz cuadrada":
    System.out.println("RAIZ CUADRADA");    
    num1=view.pedirRaiz("Ingrese el  numero: ");
numResultado= model.raiz(num1);
            System.out.print("El resultado de la raiz cuadrada es: ");
view.resultado(numResultado);
    System.out.println();
   break;
   
        case "raiz":
    System.out.println("RAIZ CUADRADA");    
    num1=view.pedirRaiz("Ingrese el  numero: ");
numResultado= model.raiz(num1);
            System.out.print("El resultado de la raiz cuadrada es: ");
view.resultado(numResultado);
    System.out.println();
   break;
        case "potencia":
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
            System.out.println("- Si");
            System.out.println("- No");
            
            do{
opcion=opcionEntrada.nextLine();
if(opcion.equalsIgnoreCase("si")){
break;    
}else{
if(opcion.equalsIgnoreCase("no")){
    System.out.println("Gracias por usar el programa");
    System.exit(0);    
}else{
    System.out.println("Opcion invalida, intente de nuevo");    
}    
}            
            }while(!opcion.equalsIgnoreCase("no")&&!opcion.equalsIgnoreCase("si"));

            

}
while(!opcion.equalsIgnoreCase("salir"));
}


}
