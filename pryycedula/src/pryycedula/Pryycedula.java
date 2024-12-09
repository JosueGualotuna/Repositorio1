
package pryycedula;
import java.util.Scanner;
public class Pryycedula {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE LA CEDULA COMO STRING: ");
String cedula = scanner.next();
if (cedula.length()<10){
        System.out.println("EL NUMERO DE CEDULA DEBE TENER 10 DIGITOS");
return;
}
   System.out.println("INGRESE POSICIONES A SUMAR, SEPARADAS POR (,)");  
 String posiciones = scanner.next();
 String [] posicionesArreglo = posiciones.split(",");

int suma=0;
for(int i=0; i<posicionesArreglo.length;i++){
int posicion = Integer.parseInt(posicionesArreglo[i].trim());     
suma += Integer.parseInt(String.valueOf(cedula.charAt(posicion)));

}
        System.out.println("LA SUMA ES: "+suma);
}
}