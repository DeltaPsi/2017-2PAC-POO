class Triangulo extends FiguraRegular2D {
  public Triangulo(float longitud) {
    super(3, longitud);
  }
  
  public void dibujar() {
    fill(256);
    this.getPoligono(100, 100, 3, 100);
  }
  
  public float calcularArea() {
    return 0.433012702 * pow(this.longitudLado, 2);
  }
}