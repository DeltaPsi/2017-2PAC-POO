Circulo c1;
Circulo c2;

void draw() {
  c1 = new Circulo();
  c2 = new Circulo(c1);
  
  println("El diametro de la circunferencia es " + c2.getDiametro());
  
  stop();
}

//--------------------------------------------

class Circulo {
  private float radio;
  private int posicionX;
  private int posicionY;
  
  // Constructor explícito, sin argumentos
  public Circulo() {
    this.radio = 10;
    this.posicionX = 0;
    this.posicionY = 0;
  }
  
  // Constructor por copia de estados
  public Circulo(Circulo original) {
    this.radio = original.radio;
    this.posicionX = original.posicionX;
    this.posicionY = original.posicionY;
  }
  
  float getDiametro() {
    return this.radio * 2;
  }
}