
package prypatronsingletone;

import java.util.ArrayList;

public class ConfiguracionRegistro {
    ArrayList<Configuracion> listaIdioma = new ArrayList<>();

    public void agregar(Configuracion idioma){
listaIdioma.add(idioma);
    }
    
    public ArrayList<Configuracion> mostrar(){
        return listaIdioma;
    }
}
