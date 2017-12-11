package com.isa.snake.controller;

import com.isa.snake.view.HomeView;
import com.isa.snake.view.AboutView;
import com.isa.snake.controller.ConnectionController;
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

  public ApplicationController(ConnectionController con) {
    this.con = con;
  }

  public void start() {
    con.openConnection();
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

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "play": if (!hv.getInputName().getText().toString().equals("")) {
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
