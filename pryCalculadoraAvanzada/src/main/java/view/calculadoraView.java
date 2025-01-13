
package view;

import model.calculadoraModel;
import java.util.Scanner;
public class calculadoraView {

private calculadoraModel modelo; 
Scanner entrada = new Scanner(System.in);    

public double pedirNumero(String mensaje){
       double nueva=0;

 while(true){
                     System.out.print(mensaje);    
 if(entrada.hasNextDouble()){
nueva=entrada.nextDouble();
break;
 }
 else{
     System.out.println("El valor debe ser numerico, intente otra vez");
entrada.next();     
 }  
 }   
    return nueva;
}

public double pedirDivisor(String mensaje){
double divisor =0;
    while(true){
            System.out.print(mensaje);
if(entrada.hasNextDouble()){    
divisor = entrada.nextDouble();
    if(divisor!=0){
break;    
}
    else{
        System.out.println("El divisor no puede ser 0, intente otra vez ");        
    }    
}
else{
    System.out.println("El valor debe ser numerico, intente otra vez");    
    entrada.next();
}
}
    return divisor;
}

public double pedirRaiz(String mensaje){
double raiz =0;
while(true){
        System.out.print(mensaje);
if(entrada.hasNextDouble()){
    raiz= entrada.nextDouble();
if(raiz>=0){    
    break;
}else{
    System.out.println("Debe ingresar un numero mayor o igual a 0");    
}        
}
else{
    System.out.println("El valor debe ser numerico, intente otra vez");
        entrada.next();

}    
}
return raiz;
}

public void resultado(double resultado){
    System.out.println(resultado);

}

}