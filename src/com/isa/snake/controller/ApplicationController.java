package com.isa.snake.controller;

import com.isa.snake.view.HomeView;
import com.isa.snake.view.SnakeView;
import com.isa.snake.view.AboutView;
import com.isa.snake.view.GameView;
import com.isa.snake.model.Snake;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.event.ActionEvent;

/**
* Clase ApplicationController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class ApplicationController implements ActionListener {
  HomeView hv;
  AboutView av;
  ConnectionController con;
  SnakeController snakeControl;
  Snake viborita;
  SnakeView vista_viborita;
  GameView main_window;

  public ApplicationController(ConnectionController con) {
    this.con = con;
  }

  public void start() {
    home();
  }

  public void home() {
    hv = new HomeView();
    hv.setController(this);
    hv.setVisible(true);
  }

  public void about() {
    av = new AboutView();
    av.setController(this);
    av.setVisible(true);
  }

  public void game() {
    viborita = new Snake();
    vista_viborita = new SnakeView();
    snakeControl = new SnakeController(viborita, vista_viborita);
    main_window = new GameView();
    main_window.setControllerForKeys(snakeControl);
    main_window.setVisible(true);
    hv.dispose();
  }

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "play": if (!hv.getInputName().getText().toString().equals("")) {
                    game();
                    hv.dispose();
                   }

                   break;

      case "about": about();
                    hv.dispose();
                    break;

      case "home": home();
                   av.dispose();
                   break;
    }
  }
}
