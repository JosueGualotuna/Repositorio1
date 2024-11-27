package Tarea2;
import java.util.Scanner;
public class Imprimir {

    public static void main(String[] args) {
Padre padre1 = new Padre();
Hijo hijo1 = new Hijo();

padre1.setNombre("Miguel Balboa");
padre1.setEdad(40);
padre1.setProfesion("Medico");
hijo1.setNombre("Kenny Balboa"); 
hijo1.setEdad(17);
hijo1.setEstudio("Tecnico Quito");

        System.out.println("Ingrese 'padre ' o 'hijo ' segun la información que desee leer: ");
 Scanner entrada = new Scanner(System.in);       
String info;
String igual = "hijo";

info = entrada.next();
if(info.equals(igual) ){
    System.out.println("El nombre del hijo es: " +hijo1.getNombre());
        System.out.println("La edad del hijo es: " +hijo1.getEdad());
        System.out.println("El hijo estudia en el colegio:  " +hijo1.getEstudio());
        }
else {
             System.out.println("El nombre del padre es: " +padre1.getNombre());
        System.out.println("La edad del padre es: " +padre1.getEdad());
        System.out.println("La profesion del padre es: " +padre1.getProfesion());
}
}
}
