package pryzoologico;
public class Animal {
 public String nombre;
 public Animal(String nombre) {
 this.nombre = nombre;
 }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    } 
    
 public void comer(){

 System.out.println(getNombre()+" esta comiendo.");
}
 public void dormir(){

 System.out.println(getNombre()+" esta durmiendo.");
 }
}