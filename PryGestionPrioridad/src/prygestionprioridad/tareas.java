
package prygestionprioridad;

public class tareas {
 
String nombre;  
int prioridad;

    public tareas(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "tareas{" + "nombre: " + nombre + ", prioriodad: " + prioridad + '}';
    }


}
