
package br.com.esclateste;

import com.sun.faces.action.RequestMapping;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Manoel Victor
 */
@ManagedBean
@Controller
public class Qualquer {
    
    @RequestMapping("/operador.xhtml")
    
    public String mostrar(){
        
        return "ola";
}
    public String mudapag(String pag){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "CadOperador.xhtml";
    }
}
