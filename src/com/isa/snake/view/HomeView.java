package com.isa.snake.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
* Clase HomeView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/

//CLase de la vista principal
public class HomeView extends JFrame implements ActionListener {
  JTextField inputName = new JTextField(20);
  JButton aboutButton = new JButton("Acerca de...");
  JButton playButton = new JButton("JUGAR");

  public HomeView() {
    super("Snake");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon imagen = new ImageIcon("../assets/snake1.jpg");
    JLabel etiqueta = new JLabel(imagen);

    JPanel panelAbout = new JPanel();
    panelAbout.setLayout(new BorderLayout());
    aboutButton.addActionListener(this);
    panelAbout.add(aboutButton);

    JPanel panelDatos = new JPanel();
    GridLayout gl = new GridLayout();
    panelDatos.setLayout(gl);
    panelDatos.add(etiqueta);

    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new FlowLayout());
    panelBotones.add(new JLabel("Nombre:"));
    panelBotones.add(inputName);
    playButton.addActionListener(this);
    panelBotones.add(playButton);

    Container cp = getContentPane();
    cp.add(panelAbout, BorderLayout.NORTH);
    cp.add(panelDatos, BorderLayout.CENTER);
    cp.add(panelBotones, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e) {
    Object button = e.getSource();

    if (button == playButton) {
      if (!inputName.getText().toString().equals("")) {
      }
    }

    else if (button == aboutButton) {
    }
  }
}
