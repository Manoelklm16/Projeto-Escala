/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Manoel Victor
 */
@ManagedBean
public class Controle {
     public String CadFunc(String func){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "CadOperador.xhtml";
    }
    public String GerEsca(String escala){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "CadOperador.xhtml";
    }
    public String Troca(String troca){
      String  pagNova = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pagNova");
        return "Troca.xhtml";
    }
}
