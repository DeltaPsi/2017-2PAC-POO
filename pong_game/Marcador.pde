
import java.util.*;

public class Marcador extends FiguraFija {

  public Marcador() {
    super(
      new Posicion (0, 0),
      width,
      100,
      color(127)
    );
  }

  private int[] puntajes;


  public void actualizarMarcador(Jugador[] jugadores) {
      // TODO implement here
  }

  public void dibujar() {
    fill(this.relleno);
    rect (this.origen.x, this.origen.y, this.ancho, this.alto);
  }

}