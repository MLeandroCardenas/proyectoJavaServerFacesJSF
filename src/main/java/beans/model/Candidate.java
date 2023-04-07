
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Michael
 */
@Named(value = "candidato")
@RequestScoped
public class Candidate {
    
    private String nombre = "Introduce tu nombre ahora";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
