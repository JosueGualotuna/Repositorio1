/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prysrppersona;

/**
 *
 * @author Laboratorios DCCO
 */
public class usuarioEdad extends Usuario{
int edad;

    public usuarioEdad(int edad, String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
        this.edad = edad;
    }

public void rangoEdad(){
if(edad>=20){
    System.out.println("El usuario "+nombres+""+apellidos+" tiene una edad mayor a 20 anios, su edad es "+edad);    
    System.out.println("No hay usuarios con edad menor a 20 anios");
}else{
if(edad<=30)
    System.out.println("El usuario "+nombres+""+apellidos+" tiene una edad menor a 30 anios");    
    System.out.println("No hay usuarios con edad mayor a 30 anios");    
}
}

}
