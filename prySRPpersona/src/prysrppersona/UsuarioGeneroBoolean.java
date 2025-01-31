
package prysrppersona;

public class UsuarioGeneroBoolean extends Usuario {
   boolean sexo=true;
;

    public UsuarioGeneroBoolean(boolean sexo, String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
        this.sexo = sexo;
    }

    public void evaluarSexo(){
     if(sexo=true){
    System.out.println("Se encontro usuario masculino");
    System.out.println("El usuario "+nombres+""+apellidos+" es masculino"); 
    System.out.println("No existen usuarios femeninos");
     }else
         if(sexo=false){
          System.out.println("Se encontro usuario femenino");
    System.out.println("El usuario "+nombres+""+apellidos+" es femenino"); 
        System.out.println("No existen usuarios masculinos");
    
         }
    }
 
   
   
}
