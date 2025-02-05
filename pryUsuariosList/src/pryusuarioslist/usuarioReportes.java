
package pryusuarioslist;

import java.util.ArrayList;

public class usuarioReportes  {
  
ArrayList<modeloEstudiante> listaEstudiantes = new ArrayList<>();
    
public void agregar(modeloEstudiante estudianteAgregado){
listaEstudiantes.add(estudianteAgregado);
}

public void mostrar(){
    for (modeloEstudiante listaEstudiante : listaEstudiantes) {
        System.out.println(listaEstudiante);       
    }
}    
public void mostrarHombres(){

     for(int i=0; i<listaEstudiantes.size(); i++){
    int promedio_hombre=0;
    promedio_hombre+=i;
         System.out.print(promedio_hombre);
}
}
}


