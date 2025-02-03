
package prysrppersona;

public class usuarioCRUD extends Usuario{

    public usuarioCRUD(String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
    }
    
public void guardarBBDD(){
    System.out.println("se guardo "+this.nombres +""+this.apellidos +" exitosamente");    
}    
    
public void editarBBDD(){
    System.out.println("se actualizo "+this.nombres+""+this.apellidos +" exitosamente");    
}    
    
public void eliminarBBDD(){
System.out.println("se elimino "+this.nombres +""+this.apellidos +" exitosamente");    
}    

public void buscarBBDD(){

    System.out.println("se encontro "+this.nombres +""+this.apellidos +" exitosamente");    
}  

}
