Circulo c1;

void draw() {
  // Este constructor no existe en realidad.
  c1 = new Circulo(15);
  println("El diametro de la circunferencia es " + c1.getDiametro());
  
  stop();
}

//--------------------------------------------

class Circulo {
  float radio = 10;
  int posicionX;
  int posicionY;
  
  public Circulo(float radio) {
    this.radio = radio;
    this.posicionX = 0;
    this.posicionY = 0;
  }
  
  public Circulo (float radio, int x, int y) {
    this.radio = radio;
    this.posicionX = x;
    this.posicionY = y;
  }
  
  float getDiametro() {
    return this.radio * 2;
  }
}