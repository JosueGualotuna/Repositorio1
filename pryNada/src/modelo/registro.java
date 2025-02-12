
package modelo;

import java.util.ArrayList;

public class registro {
 
    
    ArrayList<persona> listaPersona = new ArrayList<>();
    
    public void agregar(persona persona){
        listaPersona.add(persona);
    }
    
public ArrayList<persona> getListaPersona(){
return listaPersona;    

}

}
