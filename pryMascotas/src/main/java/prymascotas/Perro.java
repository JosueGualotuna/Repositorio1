
package prymascotas;

public class Perro extends Animal implements Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println(nombre+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(nombre+" esta durmiendo");
    }

    @Override
    public void jugar() {
        System.out.println(nombre+ " esta jugando");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre+" muestra carino");
    }

    @Override
    public void edad() {
if(edad<=0)        
 throw new IllegalArgumentException("La edad de "+nombre+" no puede ser menor o igual a 0");        
else{
   System.out.println(nombre+" tiene "+edad+" años de edad" );
 
}        
}
    
}