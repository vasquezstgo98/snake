package com.isa.snake.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* Clase ConnectionController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class ConnectionController {
  private final String url = "jdbc:sqlite:src/com/isa/snake/database/snake.db";
  Connection connect;

  public void openConnection() {
    try {
      connect = DriverManager.getConnection(url);

      if (connect != null) {
        System.out.println("Conectado");
      }
    } catch(SQLException e) {
      System.err.println("No se pudo establecer la conexión");
    }
  }

  public void closeConnection() {
    try {
      connect.close();
    } catch(SQLException e) {
      System.err.println("No se pudo cerrar la conexión por: " + e);
    }
  }
}
