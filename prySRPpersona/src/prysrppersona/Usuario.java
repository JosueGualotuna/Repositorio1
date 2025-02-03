
package prysrppersona;

public class Usuario {

String nombres,apellidos,email ;

    public Usuario(String nombres, String apellidos, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }




public void enviarEmail(){

    System.out.println("Se encontro el correo: "+this.email);
    System.out.println("enviando email de bienvenida a: "+this.email+" perteneciente a "+nombres+""+apellidos  );    

}  
        
        
        
}