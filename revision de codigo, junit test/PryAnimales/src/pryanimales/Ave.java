package pryanimales;
public class Ave extends proAnimales{
    
double envergaduraAlas;

public Ave(double envergaduraAlas, String nombre, int edad) {
super(nombre, edad);
this.envergaduraAlas = envergaduraAlas;

}
public void volar(){
    
System.out.println(nombre + " esta volando con una envergadura de "+ envergaduraAlas);

}

}