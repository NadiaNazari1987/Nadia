package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindows {
    public static void main(String[] args) {
        JFrame huvudFonster = new JFrame();
        JButton knapp = new JButton();
        knapp.setText("Avbryt");
        knapp.setBackground(Color.pink);
        knapp.setForeground(Color.green);

        //knapp.setSize(100,100);
        knapp.setBounds(70,70,200,300);

        // lägger till en actionListener objekt
        /*knapp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                JOptionPane.showMessageDialog(null, "Du har klickat på knappen");
            }
        });*/

        // lägger till en actionlistener lambdas metod
        knapp.addActionListener(event -> {
                JOptionPane.showMessageDialog(null, "Du har klickat på knappen (lambdas)");
            }
        );

        huvudFonster.add(knapp);

        huvudFonster.setSize(300,500);
        huvudFonster.setLayout(null);
        huvudFonster.setVisible(true);
    }
}
