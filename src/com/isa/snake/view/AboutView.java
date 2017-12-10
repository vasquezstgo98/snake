package com.isa.snake.view;

/**
* Clase AboutView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/
import javax.swing.*;
import java.awt.*;

public class AboutView extends JFrame{
    public AboutView(){
        super("AboutView");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        //Bloque que crea los JLabel que contienen los nombres de los integrantes del equipo
        JPanel equipo = new JPanel();
        equipo.setLayout(new GridLayout(7 ,1, 5, 5));
        equipo.add(new JLabel("INICIO"));
        equipo.add(new JLabel("Integrantes del equipo", SwingConstants.CENTER));
        equipo.add(new JLabel("Castillo Diaz Jorge", SwingConstants.CENTER));
        equipo.add(new JLabel("Reyes Hernandez Erik Jahaziel", SwingConstants.CENTER));
        equipo.add(new JLabel("Rodriguez Morales Marco ANtonio", SwingConstants.CENTER));
        equipo.add(new JLabel("Vasquez Santiago Carlos Enrique", SwingConstants.CENTER));
        equipo.add(new JLabel("INGENIERIA EN SISTEMAS COMPUTACIONALES", SwingConstants.CENTER));

        //Bloque que crea los JLabel que contienen tanto el nombre de la escuela como el logotipo y grupo
        JPanel ito = new JPanel();
        ito.setLayout(new GridLayout(3 ,1, 5, 5));
        ito.add(new JLabel("INSTITUTO TECNOLOGICO DE OAXACA", SwingConstants.CENTER));
        Font auxFont=equipo.getFont(); 
        ito.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        //ito.add(new JLabel("Logo"));
        ito.add(new JButton(new ImageIcon("logotipo.jpg")));
        ito.add(new JLabel("ISA", SwingConstants.CENTER));

        //Ajuste de los JLayout
        Container opc = getContentPane();
        opc.add(equipo, BorderLayout.WEST);
        opc.add(ito, BorderLayout.CENTER);
    }
}