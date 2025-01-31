

package prysrppersona;


public class PrySRPpersona {


    public static void main(String[] args) {
//variables
String nombres ="KENNY ";
String apellidos="LEON";
String email="kenny123@gmail.com";
String genero1="masculino";
String generoboolean =false;
int edad1=25;
/*
        System.out.println("=== BASE DE DATOS ===");
//llamando al CRUD
usuarioCRUD userMain = new usuarioCRUD(nombres, apellidos, email);
userMain.guardarBBDD();
userMain.editarBBDD();
userMain.eliminarBBDD();
userMain.buscarBBDD();        
userMain.enviarEmail();
*/

//llamando a la clase usuarioEmail para buscar por email
        System.out.println("=== BUSCANDO POR CORREO===");
usuarioEmail emailMain = new usuarioEmail(nombres, apellidos, email);
emailMain.buscarPorEmail();
        System.out.println("");
        System.out.println("=== EDAD DEL USUARIO ===");

//llamando a la clase usuarioEdad para buscar por edad
usuarioEdad edadmain = new usuarioEdad(edad1, nombres, apellidos, email);
edadmain.rangoEdad();
        System.out.println("");
        System.out.println("=== GENERO DEL USUARIO ===");

//llamando a la clase usuarioGenero para buscar por genero
usuarioGenero generoMain = new usuarioGenero(genero1, nombres, apellidos, email);
generoMain.tipoGenero();
UsuarioGeneroBoolean geneeroboolean = new UsuarioGeneroBoolean(true, nombres, apellidos, email);
geneeroboolean.evaluarSexo();

    }
    
}
