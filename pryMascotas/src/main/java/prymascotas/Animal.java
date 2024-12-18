
package prymascotas;


public abstract class Animal {
String nombre;
int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

public abstract void comer();
public abstract void dormir();  
public abstract void edad();  

}
