package com.isa.snake;

import com.isa.snake.controller.GameController;

/**
* Clase Application
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/
public class Application {
  public static void main(String[] args) {
    GameController control = new GameController();
    control.start();
  }
}
