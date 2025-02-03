

package prysrppersona;


public class PrySRPpersona {


public static void main(String[] args) {

//variables
String nombres ="KENNY ";
String apellidos="LEON";
int edad=32;
String email="kenny123@gmail.com";
boolean generoboolean =true;

System.out.println("=== BASE DE DATOS ===");
//llamando al CRUD
usuarioCRUD userMain = new usuarioCRUD(nombres, apellidos, email);
userMain.guardarBBDD();
userMain.editarBBDD();
userMain.eliminarBBDD();
userMain.buscarBBDD();        
System.out.println("");

System.out.println("=== BUSCANDO POR CORREO ===");
//llamando a la clase usuarioEmail para buscar por email
usuarioEmail emailMain = new usuarioEmail(nombres, apellidos, email);
emailMain.buscarPorEmail();
System.out.println("");
        
System.out.println("=== EDAD DEL USUARIO ===");
//llamando a la clase usuarioEdad para buscar por edad
usuarioEdad edadmain = new usuarioEdad(edad, nombres, apellidos, email);
edadmain.rangoEdad();
System.out.println("");
        
        
System.out.println("=== GENERO DEL USUARIO ===");
//llamando a la clase usuarioGenero para buscar por genero
UsuarioGenero geneeroboolean = new UsuarioGenero(generoboolean, nombres, apellidos, email);
geneeroboolean.evaluarSexo();

    }
    
}
