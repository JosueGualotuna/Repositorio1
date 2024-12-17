package pryanimales;
public class proAnimales {
    
String nombre;
int edad;
public proAnimales(String nombre, int edad) {
    
    this.nombre = nombre;
this.edad = edad;

}
 public void edad(){
     if (edad <= 0) {
throw new IllegalArgumentException("La edad no puede ser menor o igual a cero.");
        }
else{
         System.out.println(nombre+" tiene "+edad+" años");         
     }
 }

 public void comer(){
    
System.out.println(nombre+ " esta comiendo ");
}

public void dormir(){
System.out.println(nombre+" esta durmiendo");

}

}