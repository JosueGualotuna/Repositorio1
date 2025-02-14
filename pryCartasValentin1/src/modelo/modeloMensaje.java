
package modelo;


public class modeloMensaje {
  
    String remitente;
     String destinario;   
  String contenido;

    public String getRemitente() {
        return remitente;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public modeloMensaje(String remitente, String destinario, String contenido) {
        this.remitente = remitente;
        this.destinario = destinario;
        this.contenido = contenido;
    }

 
public String getObtenerMensajeCompleto(){
    return "de: "+remitente+" para "+destinario+"\n"+contenido;
}
  
}
