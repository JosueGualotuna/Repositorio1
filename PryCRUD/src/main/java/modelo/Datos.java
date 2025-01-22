package modelo;

import java.util.ArrayList;

public class Datos {

    private String nombre, apellido;
    private int cedula, edad;

    public static ArrayList<Datos> listaDatos = new ArrayList<>();

    public Datos() {
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }
    
    public static boolean actualizarDato(int cedula, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
    for (Datos dato : listaDatos) {
        if (dato.getCedula() == cedula) {
            dato.setNombre(nuevoNombre);
            dato.setApellido(nuevoApellido);
            dato.setEdad(nuevaEdad);
            return true; 
        }
    }
    return false; 
}
    
public static boolean eliminarDato(int cedula) {
    for (int i = 0; i < listaDatos.size(); i++) {
        if (listaDatos.get(i).getCedula() == cedula) {
            listaDatos.remove(i); 
            return true;
        }
    }
    return false; 
}    
}
