FiguraRegular2D figuras[];

void setup() {
  size (400, 400);
  
  figuras = new FiguraRegular2D[3];
  figuras[0] = new Triangulo(100);
  figuras[1] = new Cuadrado(100);
  figuras[2] = new Pentagono(100);
}

void draw() {
  figuras[0].dibujar();
  figuras[1].dibujar();
  figuras[2].dibujar();
  stop();
}