FiguraRegular2D figuras[];

void setup() {
  size (400, 400);
  
  figuras = new FiguraRegular2D[3];
  figuras[0] = new Triangulo(100);
  figuras[1] = new Cuadrado(100);
  figuras[2] = new Pentagono(100);
}  

void draw() {
  for (int i = 0; i < 3; i++){
    figuras[i].dibujar();
    println("Perimetro de " + figuras[i].identificarFigura() + " es " + figuras[i].calcularPerimetro());
    println("Area de " + figuras[i].identificarFigura() + " es " + figuras[i].calcularArea());
  }
  stop();
}