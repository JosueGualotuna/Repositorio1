/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prysrppersona;

public class usuarioGenero extends Usuario{
String genero;

    public usuarioGenero(String genero, String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
        this.genero = genero;
    }

public void tipoGenero(){
if(genero.equalsIgnoreCase("masculino")){
    System.out.println("Se encontro usuario masculino");
    System.out.println("El usuario "+nombres+""+apellidos+" es masculino"); 
    System.out.println("No existen usuarios femeninos");
}else{
 if(genero.equalsIgnoreCase("femenino")){
         System.out.println("Se encontro usuario femenino");
    System.out.println("El usuario "+nombres+""+apellidos+" es femenino"); 
        System.out.println("No existen usuarios masculinos");

}  
}
}
    
}
