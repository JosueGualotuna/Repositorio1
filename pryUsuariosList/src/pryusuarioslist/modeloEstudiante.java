
package pryusuarioslist;

public class modeloEstudiante {
  
String nombre;   
boolean sexo;
    double nota;

    public modeloEstudiante(String nombre, boolean sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(boolean sexo) {
    
      this.sexo = sexo;
        
        
        
        
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }


    
    
    
    @Override
    public String toString() {
   
String sexovalido ="";
if(sexo==true){
sexovalido ="masculino";   
}else{
    if(sexo==false){
sexovalido ="femenino";   
    }
}

        return "ESTUDIANTE: {" + "nombre: " + nombre + ", sexo: " + sexovalido + ", nota: " + nota + '}';
    }



    
}
