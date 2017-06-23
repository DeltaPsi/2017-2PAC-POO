
import java.util.*;

public abstract class FiguraFija {

    public FiguraFija(Posicion origen, float ancho, float alto, color relleno) {
      this.origen = origen;
      this.ancho = ancho;
      this.alto = alto;
      this.relleno = relleno;
    }

    protected float ancho;
    protected float alto;
    protected color relleno;    
    protected Posicion origen;


    public abstract void dibujar();

}