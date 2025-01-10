
package View;
import java.util.Scanner;
public class sumarView {

public Scanner scanner = new Scanner(System.in);

public int pedirNumero(String mensaje){
    System.out.println(mensaje);
return scanner.nextInt();
}

public void mostrarResultado(int resultado){
    System.out.println("El resultado es: "+resultado);    
    
}



}
