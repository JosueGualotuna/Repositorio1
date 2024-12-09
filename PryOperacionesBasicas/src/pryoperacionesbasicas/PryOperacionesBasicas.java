
package pryoperacionesbasicas;
import java.util.Scanner;

public class PryOperacionesBasicas {

    public static void main(String[] args) {
        
        System.out.print("Ingrese el primer numero: ");
        Scanner entrada1 = new Scanner (System.in);
        double numer1;
        numer1 = entrada1.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        Scanner entrada2 = new Scanner (System.in);
        double numer2;
        numer2 = entrada2.nextDouble();
        
    Operaciones oper = new Operaciones(numer1,numer2);
        System.out.print("La suma es: ");
        System.out.println(+oper.Sumar());
        
                System.out.print("La resta es: ");
        System.out.println(+oper.Resta());

                System.out.print("La multiplicar es: ");
        System.out.println(+oper.Multiplicar());

                System.out.print("La dividir es: ");
        System.out.println(+oper.Dividir());

}
}