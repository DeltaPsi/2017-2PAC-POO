
public class Tablero extends FiguraFija {
  private Balon balon;
  private Paleta[] paletas;
  
  public Tablero(float posicionX, float posicionY, color relleno, float anchura, float altura) {
    super(posicionX, posicionY, relleno, anchura, altura);
    
    float longitudBalon = 50;
    float longitudPaleta = 100;
    float balonY = this.posicionY + (this.altura / 2);
    float paletaY = balonY - (longitudPaleta / 2);
    
    this.balon = new Balon(this.anchura / 2, balonY, color(BLANCO), longitudBalon, this);
    
    this.paletas = new Paleta[2];
    this.paletas[0] = new Paleta(5, paletaY, color(BLANCO), longitudPaleta, this, null);
    this.paletas[1] = new Paleta(this.anchura - 5, paletaY, color(BLANCO), longitudPaleta, this, null);
  }

  @Override
  public void dibujar() {
    noStroke();
    fill(this.relleno);
    rect(posicionX, posicionY, this.anchura, this.altura);

    // Dibujo de la red dentro del tablero
    this.dibujarRed(this.anchura / 2, this.posicionY, this.altura, color(BLANCO));
    
    // Dibujar los otros componentes del Tablero
    this.balon.dibujar();
    this.paletas[0].dibujar();
    this.paletas[1].dibujar();
  }
  
  public void dibujarRed(float x, float y, float longitud, color colorLinea) {
    // Grosor de la linea
    strokeWeight(1);
    // Rellena de color la figura
    stroke(colorLinea);
    // Dibujo de la linea
    line(x, y, x, y + longitud);
  }

}