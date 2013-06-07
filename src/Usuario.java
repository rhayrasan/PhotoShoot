
import java.awt.Image;
import java.util.ArrayList;

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
    public Image avatar;
    public ArrayList<Image> album;
  
    
    public Usuario(String nomeUsuario, String senha, Image avatar, ArrayList<Image> album){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.avatar = null;
        this.album = new ArrayList<Image>();
    }

    public Image getAvatar(){
        return avatar;
    }

    public void setAvatar(Image avatar){
        this.avatar = avatar;
    }

    public ArrayList<Image> getAlbum(){
        return album;
    }

    public void setAlbum(ArrayList<Image> album){
        this.album = album;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
        
}
