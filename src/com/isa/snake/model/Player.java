package com.isa.snake.model;

/**
* Clase Player
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class Player {
  // Nombre del jugador
  private String name;
  // Puntuación del jugador
  private int score;

  /**
  * Método para validar que el nombre sea diferente  una cadena vacia
  * para posteriormente asignarlo
  * @param name[String]
  */
  public void setName(String name) {
    if (!name.equals("")) {
      this.name = name;
    }
  }

  /**
  * Método para obtener el nombre
  * @return [String]
  */
  public String getName() {
    return name;
  }

  /**
  * Método para establecer la puntuacion
  * @param score[int]
  */
  public void setScore(int score) {
    this.score = score;
  }

  /**
  * Método para obtener la puntuación
  * @return [int]
  */
  public int getScore() {
    return score;
  }
}
