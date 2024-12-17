package pryanimales;

public class Mamifero extends proAnimales{
    private String tipoPelaje;
    private String nombre;
    private int edad;

    public Mamifero(String tipoPelaje, String nombre, int edad) {
    super(nombre, edad);

        this.tipoPelaje = tipoPelaje;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void amamantarCrias() {
        System.out.println(nombre +" tiene un pelaje "+tipoPelaje+ " y esta amamantando a sus crias.");
    }
}
