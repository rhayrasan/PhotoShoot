
import java.awt.Image;

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
    public String comentarios;
    public int curtidas;
    
    
    public Fotos(Image foto, String comentarios, int curtidas){
        this.foto = foto;
        this.comentarios = comentarios;
        this.curtidas = curtidas;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
          
            
}
