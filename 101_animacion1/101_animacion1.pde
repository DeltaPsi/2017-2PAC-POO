void setup() {
  size(400, 400);
}

void draw() {
  background(0);
  fill(mouseX, mouseY, 100);
  ellipse(mouseX, mouseY, 100, 100);
  println("X= " + mouseX + " Y= " + mouseY);
}