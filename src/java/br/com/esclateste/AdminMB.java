
package br.com.esclateste;
import br.com.esclateste.Admin;
import javax.faces.bean.ManagedBean;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;


/**
 *
 * @author Manoel Victor
 */
@ManagedBean
public class AdminMB {
    private Admin gerecala = new Admin();
    private Admin operador = new Admin();

    
    public Admin getGerecala() {
        return gerecala;
    }

    /**
     * @param gerecala the gerecala to set
     */
    public void setGerecala(Admin gerecala) {
        this.gerecala = gerecala;
    }

    /**
     * @return the operador
     */
    public Admin getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(Admin operador) {
        this.operador = operador;
    }
    
    public String CadFunc(String func){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "CadOperador.xhtml";
    }
    public String GerEsca(String escala){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "CadOperador.xhtml";
    }
}
 