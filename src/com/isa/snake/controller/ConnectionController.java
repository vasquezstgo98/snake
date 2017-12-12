package com.isa.snake.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.isa.snake.model.Player;

/**
* Clase ConnectionController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class ConnectionController {
  private final String url = "jdbc:sqlite:src/com/isa/snake/database/snake.db";
  Connection connect;

  // Abrimos la conección
  public void openConnection() {
    try {
      connect = DriverManager.getConnection(url);

      if (connect != null) {
        System.out.println("Conectado");
      }
    } catch(SQLException e) {
      System.err.println("No se pudo establecer la conexión: " + e.getMessage());
    }
  }

  // Cerramos la conección
  public void closeConnection() {
    try {
      connect.close();
    } catch(SQLException e) {
      System.err.println("No se pudo cerrar la conexión por: " + e.getMessage());
    }
  }

  public void savePlayer(Player current) {
    try {
      PreparedStatement query = connect.prepareStatement("insert into players (name, score) values (?,?)");
      query.setString(1, current.getName());
      query.setInt(2, current.getScore());
      query.execute();
    } catch(SQLException e) {
      System.err.println("No se pudo guardar el jugador: " + e.getMessage());
    }
  }
}
