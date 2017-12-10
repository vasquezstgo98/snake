package com.isa.snake.model;

import java.awt.Point;
import java.util.ArrayList;

/**
* Clase Snake
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class Snake {
  // ArrayList de Point para almacenar el largo de la serpiente
  private ArrayList<Point> large = new ArrayList<Point>();
  // Posición en X de la serpiente en la ventana
  private int positionX = 0;
  // Posición en Y de la serpiente en la ventana
  private int positionY = 0;

  /**
  * Constructor de Snake
  * Inicializa el largo con un Point en el centro de la ventana
  */
  public Snake() {
    large.add(new Point(20, 15));
  }

  /**
  * Método para obtener la serpiente
  * @return [ArrayList<Point>]
  */
  public ArrayList<Point> getLarge() {
    return large;
  }

  /**
  * Método para establecer la posición en X de la serpiente
  * @param positionX[int]
  */
  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  /**
  * Método para establecer la posición en Y de la serpiente
  * @param positionY[int]
  */
  public void setPositionY(int positionY) {
    this.positionY = positionY;
  }

  /**
  * Método para obtener la posición en X de la serpiente
  * @return [int]
  */
  public int getPositionX() {
    return positionX;
  }

  /**
  * Método para obtener la posición en Y de la serpiente
  * @return [int]
  */
  public int getPositionY() {
    return positionY;
  }
}
