
package pryinterfaces;


public class PryInterfaces {

public static void main(String[] args) {
Perro perro1 = new Perro();
Gato gato1 = new Gato();

    System.out.println("Perro: ");
perro1.hacerSonido();
perro1.Amamantar();

    System.out.println();        
 
        System.out.println("Gato: ");
gato1.hacerSonido();
gato1.Amamantar();
}
}