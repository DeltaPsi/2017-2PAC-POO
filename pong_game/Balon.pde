public class Balon extends FiguraMovil {
  public Balon(float posicionX, float posicionY, color relleno, float longitud, Tablero tablero) {
    super(posicionX, posicionY, relleno, longitud, tablero);
  }
  
  public float getRadio() {
    return this.longitud / 2;
  }

  public void dibujar() {
    noStroke();
    fill(this.relleno);
    ellipse(this.posicionX, this.posicionY, this.getRadio(), this.getRadio());
  }
  
  public void mover() {
  }
}