void draw() {
  println("1+2= " + Aritmetica.suma(1, 2));
  println("1-2= " + Aritmetica.resta(1, 2));
  println("1*2= " + Aritmetica.multiplicacion(1, 2));
  println("1/2= " + Aritmetica.division(1, 2));
  
  prueba();
  
  stop();
}

void prueba() {
  println(Aritmetica.suma(1, 2) == 3);
  println(Aritmetica.resta(1, 2) == -1);
  println(Aritmetica.multiplicacion(1, 2) == 2);
  println(Aritmetica.division(1, 2) == 0.5);
}