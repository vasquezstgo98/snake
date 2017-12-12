package com.isa.snake.controller;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import com.isa.snake.model.Snake;
import com.isa.snake.view.SnakeView;
import com.isa.snake.view.GameView;

/**
* Clase SnakeController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/

public class SnakeController implements KeyListener {
  Snake viborita;
  GameView window;
  SnakeView view;
  // Posición en X de la serpiente en la ventana
  private int positionX = 0;
  // Posición en Y de la serpiente en la ventana
  private int positionY = 0;

  public SnakeController(Snake viborita, GameView window, SnakeView view) {
    this.viborita = viborita;
    this.window = window;
    this.view = view;
  }


  /**
  * Método para establecer la posición en X de la serpiente
  * @param positionX[int]
  */
  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  /**
  * Método para establecer la posición en Y de la serpiente
  * @param positionY[int]
  */
  public void setPositionY(int positionY) {
    this.positionY = positionY;
  }

  /**
  * Método para obtener la posición en X de la serpiente
  * @return [int]
  */
  public int getPositionX() {
    return positionX;
  }

  /**
  * Método para obtener la posición en Y de la serpiente
  * @return [int]
  */
  public int getPositionY() {
    return positionY;
  }

  /**
  * Método para mover la serpiente
  */
  public void move() {
    for(int i = viborita.getLarge().size()-1; i > 0; i--) {
      // Mueve la serpiente hasta que llega al final de su tamaño
      viborita.getLarge().get(i).setLocation(viborita.getLarge().get(i-1));
    }

    // Suma las posiciones a las ya existentes
    viborita.getLarge().get(0).x += getPositionX();
    viborita.getLarge().get(0).y += getPositionY();
  }

  // Incrementa en 1 el largo de la serpiente
  public void increaseLarge() {
    viborita.getLarge().add(new Point());
  }

  /**
  * Mueve la serpiente en una dirección en base a los eventos del teclado
  * @param e[KeyEvent]
  */
  public void directionMove(KeyEvent e) {
    switch(e.getActionCommand()) {
      case "up": setPositionX(0);
                 setPositionY(-1);
                 break;

      case "down": setPositionX(0);
                   setPositionY(1);
                   break;

      case "left": setPositionX(-1);
                   setPositionY(0);
                   break;

      case "right": setPositionX(1);
                    setPositionY(0);
                    break;
    }
  }
}
