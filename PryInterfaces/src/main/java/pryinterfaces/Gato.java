

package pryinterfaces;

public class Gato implements Mamifero{

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public void Amamantar() {
        System.out.println("La gata amamanta a sus gatitos");
    }

    
}