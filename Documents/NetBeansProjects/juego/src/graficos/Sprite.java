package graficos;

public class Sprite {
    
    protected final int LADO;
    
    private  int x;    
    private  int y;
    
    public int[] pixeles;
    private  hojaSprites hoja;
    
    // coleccion de sprites
    public static final Sprite VACIO = new Sprite(32, 0);
    public static final Sprite GRASS = new Sprite(32, 0, 1, hojaSprites.cosas);
    
    // fin de la coleccion
    
    public Sprite(final int lado, final int columna, final int fila, 
            final hojaSprites hoja ){
    
        this.LADO = lado;
        
        pixeles = new int[lado * lado];
        
        this.x = columna * lado;
        this.y = fila * lado;
        this.hoja = hoja;
        
        for (int y = 0; y < lado; y++){
            for(int x = 0; x < lado; x++){
                                     
                pixeles [x + y * lado] = hoja.pixeles[(x + this.x)
                        + (y + this.y) * hoja.obtenAncho()];
             }       
        }
    }
    
        public Sprite(final int lado, final int color){
            this.LADO = lado;
            pixeles = new int[lado * lado];
        
            for(int i = 0; i < pixeles.length; i++){
                 pixeles[i] = color;
            }
        }

    
    public  int obtenLado(){
        return LADO;
        
    }
}
