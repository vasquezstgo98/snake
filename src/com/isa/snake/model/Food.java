package com.isa.snake.model;

import java.awt.Point;

/**
* Clase Food
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class Food {
  // Comida para Snake
  private Point snack;

  /**
  * Constructor Food
  * Inicializa la variable food con un nuevo Point
  */
  public Food() {
    snack = new Point();
  }

  /**
  * Método para obtener la comida
  * @return [Point]
  */
  public Point getSnack() {
    return snack;
  }

  /**
  * Método para colorcar la comida en una posición de la ventana
  * @param snackX[int]
  * @param snackY[int]
  */
  public void setSnack(int snackX, int snackY) {
    snack.x = snackX;
    snack.y = snackY;
  }

  /**
  * Método para obtener la posición de la comida en X
  * @return [int]
  */
  public int getSnackX() {
    return snack.x;
  }

  /**
  * Método para obtener la comida en Y
  * @return [int]
  */
  public int getSnackY() {
    return snack.y;
  }
}
