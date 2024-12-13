
package com.mycompany.ejersubclases;

public class Estudiante extends Persona {
    
int NRC;
String asignatura;

public Estudiante(int NRC, String asignatura, String nombre, int edad, String residencia){
super(nombre,edad,residencia);    
    
this.NRC =NRC;
this.asignatura = asignatura;
}

public void imprimir(){
    
    System.out.println("El nombre del estudiante es: "+getNombre()+"\n"+
           "La edad del estudiante es: "+getEdad()+"\n"+
            "La residencia del estudiante es: "+getResidencia()+"\n"+
            "El NRC del estudiante es: "+NRC+"\n"+
            "La asignatura es: "+asignatura+"\n"
            );    
    
}

}
