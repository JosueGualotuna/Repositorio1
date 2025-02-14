package modelo;

public class modeloColores {

    private String nombre;

    public modeloColores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Colores{" + "nombre: " + nombre + '}';
    }

}
