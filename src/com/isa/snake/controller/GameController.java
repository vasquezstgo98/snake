package com.isa.snake.controller;

import com.isa.snake.view.HomeView;

/**
* Clase GameController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/
public class GameController {
  HomeView hv;

  public void start() {
    hv = new HomeView();
    hv.setVisible(true);
  }
}
