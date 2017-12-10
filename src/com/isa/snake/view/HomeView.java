package com.isa.snake.view;

import javax.swing.*;
import java.awt.*;
import com.isa.snake.controller.GameController;

/**
* Clase HomeView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/

//CLase de la vista principal
public class HomeView extends JFrame {
  JTextField inputName;
  JButton aboutButton;
  JButton playButton;

  public HomeView() {
    super("Snake");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    inputName = new JTextField(20);
    aboutButton = new JButton("Acerca de...");
    playButton = new JButton("JUGAR");
    ImageIcon imagen = new ImageIcon("../assets/snake1.jpg");
    JLabel etiqueta = new JLabel(imagen);

    JPanel panelAbout = new JPanel();
    panelAbout.setLayout(new BorderLayout());
    aboutButton.setActionCommand("about");
    panelAbout.add(aboutButton);

    JPanel panelDatos = new JPanel();
    GridLayout gl = new GridLayout();
    panelDatos.setLayout(gl);
    panelDatos.add(etiqueta);

    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new FlowLayout());
    panelBotones.add(new JLabel("Nombre:"));
    panelBotones.add(inputName);
    playButton.setActionCommand("play");
    panelBotones.add(playButton);

    Container cp = getContentPane();
    cp.add(panelAbout, BorderLayout.NORTH);
    cp.add(panelDatos, BorderLayout.CENTER);
    cp.add(panelBotones, BorderLayout.SOUTH);
  }

  public void setController(GameController controller) {
    playButton.addActionListener(controller);
    aboutButton.addActionListener(controller);
  }
}
