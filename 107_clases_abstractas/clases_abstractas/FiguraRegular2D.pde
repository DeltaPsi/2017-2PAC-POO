abstract class FiguraRegular2D {
  float longitudLado;
  float numeroLado;
  
  public FiguraRegular2D(float numeroLado, float longitudLado) {
    this.numeroLado = numeroLado;
    this.longitudLado = longitudLado;    
  }
 
  public float calcularPerimetro() {
    return this.numeroLado * this.longitudLado;
  }
  
  protected void getPoligono(float x, float y, float numeroLado, float longitud) {
    float alpha = TWO_PI / numeroLado;   
    
    beginShape();
    vertex(x, y);
    
    for (float angulo = 0; angulo < TWO_PI; angulo += alpha) {
      x += cos(angulo) * longitud;
      y += sin(angulo) * longitud;
      
      vertex(x, y);
    }
    
    endShape(CLOSE);
  }
  
  abstract public void dibujar();
  
  abstract public float calcularArea();
}