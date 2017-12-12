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
}
