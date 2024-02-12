package ovrigt;

import javax.swing.*;

public class NadiaSwitchOne{
    public static void main(String[] args) {

        int knappNr = 0;
        int pris = 0;

        switch (knappNr) {
            case 0  -> pris = 3145;
            case 1  -> pris = 4159;

            default -> {JOptionPane.showMessageDialog(null, "Resan inställd");


                        System.out.println(" välkommen åter");
                       }
        };
    }
}
