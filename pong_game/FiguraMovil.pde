
import java.util.*;

public abstract class FiguraMovil {

    public FiguraMovil() {
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

    public class Posicion {

        public Posicion() {
        }

        public float x;

        public int y;



    }

}