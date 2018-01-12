
package graficos;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class hojaSprites {
    private final int ancho;
    private final int alto;
    public final int[] pixeles;

    
   // coleccion de hojas de sprites//
    
    
public static hojaSprites cosas = new hojaSprites (
        "/texturas/cosas.png", 760, 958);
    
    
    
    //fin de la coleccion//
    
    public hojaSprites(final String ruta, final int ancho, final int alto){
       
        BufferedImage imagen = null;
        
        
            this.ancho = ancho;
            this.alto = alto;
            
            pixeles = new int[ancho * alto];
            
        try {
            imagen = ImageIO.read(hojaSprites.class.getResource(ruta));
        } catch (IOException ex) {
            Logger.getLogger(hojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        }
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho); 
    
    }
    public int obtenAncho(){
        return ancho;
    
    }
    
}



