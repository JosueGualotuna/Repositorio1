package pryzoologico;
public class Ave extends Animal {
 public double envergaduraAlas;
 public Ave(double envergaduraAlas, String nombre) {
 super(nombre);
 this.envergaduraAlas = envergaduraAlas;
 }


 public void volar(){
 System.out.println(getNombre()+" esta volando con una envergadura de "+envergaduraAlas+" metros.");
 }
}
