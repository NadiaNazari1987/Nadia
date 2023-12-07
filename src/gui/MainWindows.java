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
        knapp.setBackground(Color.BLUE);
        knapp.setForeground(Color.RED);

        //knapp.setSize(100,100);
        knapp.setBounds(50,50,100,100);

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

        huvudFonster.setSize(300,300);
        huvudFonster.setLayout(null);
        huvudFonster.setVisible(true);
    }
}
