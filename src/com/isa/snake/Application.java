package com.isa.snake;

import com.isa.snake.controller.ApplicationController;

/**
* Clase Application
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class Application {
  public static void main(String[] args) {
    ApplicationController control = new ApplicationController();
    control.start();
  }
}
