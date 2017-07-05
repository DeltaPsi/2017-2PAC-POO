Escena escena;

color NEGRO = 0;
color GRIS = 127;
color BLANCO = 255;

void setup() {
  size(600, 600);
  frameRate(30);
  
  // Inicializacion de objetos
  escena = new Escena();
}

void draw() {
  escena.play();
}

void keyPressed() {
  if (key == 'w' || key == 'W') {
    //Subir
    escena.tablero.paletas[0].moverArriba();
  } else if (key == 's' || key == 'S') {
    // Bajar
    escena.tablero.paletas[0].moverAbajo();
  }
  println(escena.tablero.paletas[0].posicionY);
}

void keyReleased() {
  println("liberado");
}