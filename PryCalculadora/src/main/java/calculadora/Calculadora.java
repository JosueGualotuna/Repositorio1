
package calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        System.out.print("Escriba 'suma','resta','multiplicacion' o ' division' segun la operacion que requiera: ");
        Scanner entrada0 = new Scanner(System.in);
String operacion;
operacion = entrada0.nextLine();

         System.out.print("Ingrese el primer numero: ");
Scanner entrada1 = new Scanner(System.in);
Double nume1;
nume1 = entrada1.nextDouble();
Numeros numer1 = new Numeros ();
 numer1.setNum1(nume1);

        System.out.print("Ingrese el segundo numero: ");
Scanner entrada2 = new Scanner(System.in);
Double nume2;
nume2 = entrada2.nextDouble();
Numeros numer2 = new Numeros ();
 numer2.setNum2(nume2);

 
 switch (operacion){
     case "suma" :
double SUMA=(numer1.getNum1()+numer2.getNum2());
 System.out.println(+ SUMA) ;
break;
 case "resta" :
double RESTA=(numer1.getNum1()-numer2.getNum2());
 System.out.println(+RESTA) ;
break;
 case "multiplicacion" :
double MULTIPLICACION=(numer1.getNum1()*numer2.getNum2());
 System.out.println(+MULTIPLICACION) ;
break;
 case "division" :
double DIVISION=(numer1.getNum1()/numer2.getNum2());
 System.out.println(+DIVISION) ;
break;

 }
}   
}
