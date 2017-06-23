
import java.util.*;

public abstract class FiguraMovil {

    public FiguraMovil(Posicion origen, float longitud, color relleno) {
      this.origen = origen;
      this.longitud = longitud;
      this.relleno = relleno;
      
      // Inicializacion manual
      this.pixelPFX = 1;
      this.pixelPFY = 1;
    }

    protected Posicion origen;
    protected color relleno;
    protected float longitud;
    protected int pixelPFX;
    protected int pixelPFY;
    protected float orientacionX;
    protected float orientacionY;

    public abstract void mover();

    public abstract void dibujar();

}