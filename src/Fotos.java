
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
public class Fotos {
       
    public Image foto;
    public ArrayList<String> comentarios;
    public int curtidas;
    
    
    public Fotos(Image foto, String comentarios, int curtidas){
        this.foto = foto;
        this.comentarios = new ArrayList<String>();
        this.curtidas = curtidas;
    }


    public Image getFoto(){
        return foto;
    }

    public void setFoto(Image foto){
        this.foto = foto;
    }

    public String getComentarios(){
        return comentarios.toString();
    }

    public void setComentarios(String comentarios){
        this.comentarios.add(comentarios);
    }

    public int getCurtidas(){ 
        return curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
          
          
            
}
