class Cuadrado extends FiguraRegular2D {
  public Cuadrado(float longitud) {
    super(4, longitud);
  }
  
  public void dibujar() {
    this.getPoligono(100, 100, 4, 100);
  }
  
  public float calcularArea() {
    return pow(this.longitudLado, 2);
  }
}