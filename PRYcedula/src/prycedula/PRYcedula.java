
package prycedula;
import java.util.Scanner;
public class PRYcedula {

    public static void main(String[] args) {
Scanner entrada1 = new Scanner(System.in);        
        Scanner entrada2 = new Scanner(System.in);        
Scanner entrada3 = new Scanner(System.in);        
Scanner entrada4 = new Scanner(System.in);        
Scanner entrada5 = new Scanner(System.in);        
Scanner entrada6 = new Scanner(System.in);        
Scanner entrada7 = new Scanner(System.in);        
Scanner entrada8 = new Scanner(System.in);        
Scanner entrada9 = new Scanner(System.in);        
Scanner entrada10 = new Scanner(System.in);        
System.out.print("INGRESE EL NUMERO DE CEDULA (INGRESE UN DIGITO Y PRESIONE ENTER) ): ");
String num1= entrada1.next();
String num2= entrada2.next();
String num3= entrada3.next();
String num4= entrada4.next();
String num5= entrada5.next();
String num6= entrada6.next();
String num7= entrada7.next();
String num8= entrada8.next();
String num9= entrada9.next();
String num10= entrada10.next();

String [] cedula = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};  
        System.out.print("SU CEDULA ES: ");
for (int i=0; i<cedula.length;i++){
    System.out.print(cedula[i]); 
}   
        System.out.println("");
System.out.print("INGRESE LAS POSICIONES QUE DESEA SUMAR: ");  
Scanner operacion =new Scanner(System.in);
int suma=operacion.nextInt();
Scanner operacion1 =new Scanner(System.in);
int suma1=operacion.nextInt();
String sumatotal = cedula[suma]+cedula[suma1];
        System.out.println(sumatotal);
}
}
