
public class Paleta extends FiguraMovil {
  private Jugador jugador;
    
  public Paleta(float posicionX, float posicionY, color relleno, float longitud, Tablero tablero, Jugador jugador) {
    super(posicionX, posicionY, relleno, longitud, tablero); 
    
    this.jugador = jugador;
  }  

  public void dibujar() {
    strokeWeight(10);
    stroke(this.relleno);
    line(this.posicionX, this.posicionY, this.posicionX, this.posicionY + this.longitud);
  }
  
  public void mover() {
    boolean continuar;
    
    continuar = this.orientacionY == ARRIBA && this.tablero.posicionY < this.posicionY;
    continuar = continuar || this.orientacionY == ABAJO && this.tablero.posicionY + this.tablero.altura > this.posicionY + this.longitud;
    
    if (continuar) {
      this.posicionY += this.pixelPorFrameY * this.orientacionY;
    }
    
    this.dibujar();
  }
}