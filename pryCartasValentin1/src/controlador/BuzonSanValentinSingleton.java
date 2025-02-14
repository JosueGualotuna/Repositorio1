
package controlador;

import java.util.ArrayList;
import modelo.modeloMensaje;
import vista.pantallaVista;


public class BuzonSanValentinSingleton {
   private static BuzonSanValentinSingleton instancia;
   private ArrayList<modeloMensaje> mensajes;
private pantallaVista vista;
private BuzonSanValentinSingleton(){
    mensajes = new ArrayList<>();
}


public static BuzonSanValentinSingleton getInstancia(){
    if(instancia==null){
        instancia = new BuzonSanValentinSingleton();
    }
return instancia;
}

public void agregarMensaje(String remitente, String destinario, String contenido){
    mensajes.add(new modeloMensaje(remitente, destinario, contenido));
}

public ArrayList<modeloMensaje> obtenerMensajes(){
    return mensajes;
}


 public modeloMensaje obtenerpersonaNombre(String remitente1) {
       for (modeloMensaje mensaje : mensajes) {
         if(mensaje.getRemitente()==remitente1){
                           return mensaje;
         }
     }return null;
  }

  public boolean eliminarTarea(String remitente) {
        modeloMensaje mensaje = obtenerpersonaNombre(remitente) ;
        if (mensaje != null) {
            mensajes.remove(mensaje);
            return true;
        }
        return false;
    }


  
}
