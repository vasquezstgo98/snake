package com.isa.snake.view;

/**
* Clase HomeView
* @author [Jorge, Marco, Erik, Carlos]
* @version [0.1]
*/
import javax.swing.*;
import java.awt.*;
//CLase de la vista principal
public class HomeView extends JFrame{
    ImageIcon imagen = new ImageIcon("snake1.jpg");
    JLabel etiqueta = new JLabel(imagen);
    public HomeView(){
        super("HomeView");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 

        JPanel panelAbout = new JPanel();
        panelAbout.setLayout(new BorderLayout());
        panelAbout.add(new JLabel("Acerca de..."));

        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout();
        panelDatos.setLayout(gl);
        getContentPane().add(etiqueta);
        this.setSize(300, 400);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JLabel("Nombre:"));
        panelBotones.add(new JTextField("Ingrese su nombre..."));
        panelBotones.add(new JButton("JUGAR"));
       
        Container cp = getContentPane();
        cp.add(panelAbout, BorderLayout.NORTH);
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(etiqueta, BorderLayout.CENTER);
        cp.add(panelBotones, BorderLayout.SOUTH);  
    }
}
