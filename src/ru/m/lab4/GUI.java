package ru.m.lab4;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private int cntMilan = 0;
    private int cntMadrid = 0;
    private String LastScorer = "N/A";
    private String Dr = "DRAW";
    JButton btnMilan = new JButton("AC Milan");
    JButton btnMadrid = new JButton("Real Madrid");
    JLabel JLReuslt = new JLabel("Result "+ cntMilan + " X " + cntMadrid);
    JLabel JLScore = new JLabel("Last Scorer: " + LastScorer);
    Label D = new Label(Dr);

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    GUI(){super("Football Program by Svyat");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(JLReuslt);
        add(JLScore);
        add(btnMadrid);
        add(btnMilan);
        add(D);
        btnMilan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                cntMilan++;
                JLReuslt.setText("Result " + cntMilan + " X " + cntMadrid);
                LastScorer = "Milan";
                JLScore.setText("Last Scorer: " + LastScorer);
                if(cntMadrid<cntMilan) D.setText("Winner Milan!");
            }
        });
        btnMadrid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent n){
                cntMadrid++;
                JLReuslt.setText("Result " + cntMilan + " X " + cntMadrid);
                LastScorer = "Madrid";
                JLScore.setText("Last Scorer: " + LastScorer);
                if(cntMadrid>cntMilan) D.setText("Winner Madrid!");
            }
        });
        setVisible(true);
    }
    public static void main(String[]args){
        new GUI();
    }
}
