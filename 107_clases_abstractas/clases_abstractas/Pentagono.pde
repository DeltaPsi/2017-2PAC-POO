class Pentagono extends FiguraRegular2D {
  public Pentagono(float longitud) {
    super(5, longitud);
  }
  
  public void dibujar() {
    this.getPoligono(100, 100, 5, 100);
  }
  
  public float calcularArea() {
    return 1.720477401 * pow(this.longitudLado, 2);
  }
}