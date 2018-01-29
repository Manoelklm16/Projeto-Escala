package escala;

/**
 *
 * @author Manoel Victor
 */
import javax.faces.bean.ManagedBean;
import escala.Usuario;
/**
 *
 * @author Manoel Victor
 */
@ManagedBean
public class LoginMB {
    private Usuario usuario = new Usuario();
    
    public String doEfetuarLogin(){
        if("manoel".equals(usuario.getLogin())&&
                "123".equals(usuario.getSenha())){
        return "Administrador";
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
