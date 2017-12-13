package com.isa.snake.controller;

import java.util.Random;
import com.isa.snake.model.Food;

/**
* Clase FoodController
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/

public class FoodController {
  private Random ran = new Random();
  Food fud;
  FoodView fudviu;

  public void puntoComida(){
    setSnack(ran.nextInt(39), ran.nextInt(28) + 1);
  }
}
