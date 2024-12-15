package pryzoologico;
public class Mamifero extends Animal {
public String tipoPelaje;
 public Mamifero(String tipoPelaje, String nombre) {
 super(nombre);
 this.tipoPelaje = tipoPelaje;
 }
public void amamantarCrias(){
System.out.println(getNombre()+" tiene un pelaje "+tipoPelaje+" y esta amamantando a sus crias.");

}
}
