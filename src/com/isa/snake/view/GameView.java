package com.isa.snake.view;

import javax.swing.*;
import com.isa.snake.controller.SnakeController;

/**
* Clase GameView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class GameView extends JFrame {
  public GameView() {
    super("Snake");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void setControllerForKeys(SnakeController control) {
    this.addKeyListener(control);
  }
}
