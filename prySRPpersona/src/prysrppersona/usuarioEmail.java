
package prysrppersona;


public class usuarioEmail extends Usuario{

    public usuarioEmail(String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
    }

public void buscarPorEmail(){

System.out.println("Buscando el siguiente correo: "+"kenny123@gmail.com"+", perteneciente a "+nombres+""+apellidos);    
    
if(!email.equals("kenny123@gmail.com")){
System.out.println("NO se encontro el correo: "+"kenny123@gmail.com"+", perteneciente a "+nombres+""+apellidos);
}
else{
System.out.println("SI se encontro el correo: "+this.email+" ,perteneciente a "+nombres+""+apellidos);
}
    

}    




}