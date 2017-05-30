Circulo c1;

void draw() {
  // Este constructor no existe en realidad.
  c1 = new Circulo();
  println("El diametro de la circunferencia es " + c1.getDiametro());
  
  stop();
}

//--------------------------------------------

class Circulo {
  float radio = 10;
  int posicionX;
  int posicionY;
  
  float getDiametro() {
    return this.radio * 2;
  }
}