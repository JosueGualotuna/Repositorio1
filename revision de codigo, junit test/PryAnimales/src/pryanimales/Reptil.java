package pryanimales;
public class Reptil extends proAnimales{
    
String tipoEscamas;
public Reptil(String tipoEscamas, String nombre, int edad) {
    
super(nombre, edad);
this.tipoEscamas = tipoEscamas;

}
public void arrastrarse (){
System.out.println(nombre +" esta arrastrandose con sus escamas de tipo "+ tipoEscamas);

}

}