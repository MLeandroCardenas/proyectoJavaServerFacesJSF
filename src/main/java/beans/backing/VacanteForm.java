
package beans.backing;

import beans.model.Candidate;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Michael
 */
@Named(value = "vacanteJSFBean")
@RequestScoped
public class VacanteForm {
    
    @Inject
    private Candidate candidate;
    
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    
    public String enviar() {
        return (this.candidate.getNombre().equals("Juan")) ? "exito" : "fallo";
    }
    
}
