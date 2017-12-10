package com.isa.snake.controller;

import com.isa.snake.view.HomeView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
* Clase GameController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/
public class GameController implements ActionListener {
  HomeView hv;

  public void start() {
    hv = new HomeView();
    hv.setController(this);
    hv.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "play": 
                   break;

      case "about":
                    break;
    }
  }
}
