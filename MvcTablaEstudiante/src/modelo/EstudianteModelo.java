
package modelo;

public class EstudianteModelo {
    
public String nombre;    
    public int edad;

    public EstudianteModelo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
