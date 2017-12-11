package com.isa.snake;

import com.isa.snake.controller.ApplicationController;
import com.isa.snake.controller.ConnectionController;

/**
* Clase Application
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class Application {
  public static void main(String[] args) {
    ConnectionController con = new ConnectionController();
    ApplicationController control = new ApplicationController(con);
    control.start();
  }
}
