package pryzoologico;
public class Reptil extends Animal {
public String tipoEscamas;
 public Reptil(String tipoEscamas, String nombre) {
 super(nombre);
 this.tipoEscamas = tipoEscamas;
 }

public void arrastrarse(){
 System.out.println(getNombre()+" se esta arrastrando con sus escamas de tipo " +tipoEscamas);
}


}