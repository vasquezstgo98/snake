package com.isa.snake.model;

import com.isa.snake.controller.ConnectionController;

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
  // Conexión a SQLite
  ConnectionController con;

  public Player(ConnectionController con) {
    this.con = con;
  }

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

  /**
  * Método para guardar el jugador en la base de datos
  */

  public void save() {
    con.openConnection();
    con.savePlayer(this);
    con.closeConnection();
  }
}
