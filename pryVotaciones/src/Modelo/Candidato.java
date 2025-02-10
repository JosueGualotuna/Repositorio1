
package Modelo;

public class Candidato {
   
String nombre, partido;    

    public Candidato(String nombre, String partido) {
        this.nombre = nombre;
        this.partido = partido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", partido=" + partido + '}';
    }
    


}
