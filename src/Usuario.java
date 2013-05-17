
import java.awt.Image;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhayra
 */
public class Usuario {
    
    public String nomeUsuario;
    public String senha;
    public Image fotos;
  
    
    public Usuario(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Image getFotos() {
        return fotos;
    }

    public void setFotos(Image foto) {
        this.fotos = fotos;
    }

         
}
