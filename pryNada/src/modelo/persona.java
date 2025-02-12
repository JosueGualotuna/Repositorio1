/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Laboratorios DCCO
 */
public class persona {
    String nombre;
            int cedula;

    public persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }



}
