
package prysrppersona;

public class usuarioEdad extends Usuario{
int edad;

    public usuarioEdad(int edad, String nombres, String apellidos, String email) {
        super(nombres, apellidos, email);
        this.edad = edad;
    }

public void rangoEdad(){
if(edad>=20&&edad<=30){
System.out.println("El usuario "+nombres+""+apellidos+" tiene una edad entre 20 y 30 anios, su edad es "+edad+" anios");    
System.out.println("No hay usuarios con edad fuera del rango de 20 a 30 anios");
}else{
if(edad>30){
System.out.println("El usuario "+nombres+""+apellidos+" tiene una edad mayor a 30 anios, su edad es "+edad+" anios");    
System.out.println("No hay usuarios con edad menor a 30 anios");

}

else{
if(edad<20){
System.out.println("El usuario "+nombres+""+apellidos+" tiene una edad menor a 20 anios, , su edad es "+edad+" anios");    
System.out.println("No hay usuarios con edad mayor a 20 anios");

}}
}
}
}
