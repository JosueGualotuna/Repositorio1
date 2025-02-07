package pryusuarioslist;

import java.util.ArrayList;
import java.util.List;

public class usuarioReportes {

    List<modeloEstudiante> listaEstudiantes = new ArrayList<>();

    public void agregar(modeloEstudiante estudianteAgregado) {
        listaEstudiantes.add(estudianteAgregado);
    }

    public void mostrar() {
        double sumar=0;
        int contador =0;
        for (modeloEstudiante listaEstudiante : listaEstudiantes) {
            System.out.println(listaEstudiante);
            sumar+=listaEstudiante.getNota();
            contador++;
        }
        if(contador>0){
        System.out.println("Promedio total de los estudiantes:"+sumar/contador);
                }
        else{
            System.out.println("no hay estudiantes");
        }
    }

    public void mostrarMasculino() {
        double sumar = 0;
        int contador = 0;
        System.out.println("===LISTA DE ESTUDIANTES MASCULINOS===");

        for (modeloEstudiante estudiante : listaEstudiantes) {
            if (estudiante.getSexo()) {
                System.out.println(estudiante);
                sumar += estudiante.getNota();
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("Promedio de los estudiantes masculinos: " + sumar / contador);
        } else {
            System.out.println("No hay estudiantes masculinos");
        }

    }

    public void mostrarFemenino() {
        double sumar = 0;
        int contador = 0;
        System.out.println("===LISTA DE ESTUDIANTES FEMENINOS===");
        for (modeloEstudiante estudiante : listaEstudiantes) {
            if (!estudiante.getSexo()) {
                System.out.println(estudiante);
                sumar += estudiante.getNota();
                contador++;
            }
 }
            if (contador > 0) {
                System.out.println("Promedio de estudiantes femeninos: " + sumar / contador);
            } else {
                System.out.println("No hay estudiantes femeninos");
            }
        }


 
    public modeloEstudiante buscar(String nombre) {
        for (modeloEstudiante estudiante : listaEstudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
                

        }
        return null;
    }

    public void eliminar(String nombre) {
           modeloEstudiante estudiante = buscar(nombre);
        if(estudiante==null){
            System.out.println("estudiante no encontrado");
        }else{
        listaEstudiantes.remove(estudiante);
        System.out.println("Estudiante eliminado");
        }
    }

}
