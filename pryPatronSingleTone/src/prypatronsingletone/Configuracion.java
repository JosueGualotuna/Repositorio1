
package prypatronsingletone;


public class Configuracion {

private static Configuracion instancia;
private String idioma;
private String tema;

    private Configuracion() {
        this.idioma = "espanol";
        this.tema = "oscuro";
    }
    
public static Configuracion getInstancia(){
 if(instancia==null){
     instancia = new Configuracion();
 }  
return instancia; 
}

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getTema() {
        return tema;
    }

public void MostrarConfiguracion(){
    System.out.println("Idioma: "+idioma);    
    System.out.println("Tema: "+tema);
}

    @Override
    public String toString() {
        return "Configuracion{" + "idioma=" + idioma + ", tema=" + tema + '}';
    }

}