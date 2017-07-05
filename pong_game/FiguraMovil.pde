
abstract public class FiguraMovil extends Figura{

  protected float longitud;
  protected int pixelPorFrameX;
  protected int pixelPorFrameY;
  protected float orientacionX;
  protected float orientacionY;
  
  protected Tablero tablero;
  
  // Constantes para las direcciones de una figura
  public final float ARRIBA = -1;
  public final float ABAJO = 1;
  public final float IZQUIERDA = -1;
  public final float DERECHA = 1;
  
  public FiguraMovil(float posicionX, float posicionY, color relleno, float longitud, Tablero tablero) {
    super(posicionX, posicionY, relleno);
    
    this.longitud = longitud;
    this.tablero = tablero;
    
    // Inicializacion manual, cuando se cree un objeto hijo de FiguraMovil tendrá, por defecto,
    // los valores definidos a continuación.
    this.pixelPorFrameX = 10;
    this.pixelPorFrameY = 10;
    this.orientacionX = DERECHA;
    this.orientacionY = ABAJO;
  }
  
  public void moverArriba() {
    this.orientacionY = ARRIBA;
    this.mover();
  }
  
  public void moverAbajo() {
    this.orientacionY = ABAJO;
    this.mover();
  }
  
  public void moverDerecha() {
    this.orientacionX = DERECHA;
    this.mover();
  }
  
  public void moverIzquierda() {
    this.orientacionX = IZQUIERDA;
    this.mover();
  }
  // Este método abstracto proviene de Figura
  abstract public void dibujar();

  abstract public void mover();
}