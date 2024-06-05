package cl.praxis.juego;

import cl.praxis.interfaces.Jugador;
import cl.praxis.interfaces.Personaje;

public class Protagonista implements Personaje, Jugador {
  private int xActual;
  private int yActual=1;
  @Override
  public void mover(int x) {
    xActual+=x;
  }

  @Override
  public void saltar() {
    while (yActual<5){
      yActual++;
    }

    while (yActual>1){
      yActual--;
    }
  }

  @Override
  public void ejecutarAccion(String accion) {
    if (accion.equals("saltar") && yActual == 1){
      System.out.printf("voy a saltar : %d\n", yActual);
      saltar();
    } else if (accion.equals("avanzar")){
      System.out.printf("voy a mover : %d\n", yActual);
      mover(1);
    }
  }
}
