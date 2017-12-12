package com.isa.snake.view;

import javax.swing.*;
import java.awt.*;

/**
* Clase AboutView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.5]
*/
public class ScoreView extends JFrame{
    public ScoreView(){
        super("ScoreView");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        JPanel results = new JPanel();
        results.setLayout(new GridLayout(10 ,2, 5, 5));
        results.add(new JLabel("NOMBRE", SwingConstants.CENTER));
        results.add(new JLabel("PUNTUACION", SwingConstants.CENTER));
        for(byte x = 2; x < 20; x++){
            if(x%2 == 0 ){
                results.add(new JLabel("NOMBRE DEL JUGADOR", SwingConstants.CENTER));
            }else{
                results.add(new JLabel("-------", SwingConstants.CENTER));
            }
        }

        JPanel regresar = new JPanel();
        regresar.setLayout(new GridLayout());
        regresar.add(new JButton("INICIO"));

        Container opc = getContentPane();
        opc.add(results, BorderLayout.CENTER);
        opc.add(regresar, BorderLayout.SOUTH);
    }
}
