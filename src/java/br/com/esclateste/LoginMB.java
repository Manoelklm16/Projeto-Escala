package br.com.esclateste;

import javax.faces.bean.ManagedBean;
import br.com.esclateste.Usuario;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Manoel Victor
 */
@ManagedBean
@RequestScoped
public class LoginMB {
    private Usuario usuario = new Usuario();
    
    public String doEfetuarLogin(){
        if("Manoel".equals(usuario.getLogin())&&
                "123".equals(usuario.getSenha())){
        return "administrador";
    } else if("operador".equals(usuario.getLogin())&&
            "456".equals(usuario.getSenha())){
        return "operador";
    }
        return null;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
