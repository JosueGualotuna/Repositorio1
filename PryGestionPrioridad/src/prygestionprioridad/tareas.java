
package prygestionprioridad;

public class tareas {
 
String nombre;  
int prioriodad;

    public tareas(String nombre, int prioriodad) {
        this.nombre = nombre;
        this.prioriodad = prioriodad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioriodad(int prioriodad) {
        this.prioriodad = prioriodad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioriodad() {
        return prioriodad;
    }

    @Override
    public String toString() {
        return "tareas{" + "nombre: " + nombre + ", prioriodad: " + prioriodad + '}';
    }


}
