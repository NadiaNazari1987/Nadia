package manadskort;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class ManadsKort {

    public static void main(String[] args) {
        ManadsKort arsKort = new ManadsKort();
        arsKort.run();
    }
    public void run() {
        boolean runProgram = true;
        while (runProgram == true) {
            try {
                int svarEngångsBiljett = Integer.parseInt(showInputDialog(null, "Vad kostar engångs biljett till simhallen? "));
                System.out.println(svarEngångsBiljett);
                int svarAatalBesök = Integer.parseInt(showInputDialog(null, "Hur många gånger besöker du simhallen i månaden? "));
                System.out.println(svarEngångsBiljett);
                int manadsKortPris = Integer.parseInt(showInputDialog(null, "Vad kostar en månadskort på simhallen? "));
                System.out.println(manadsKortPris);
                int resultat = 0;

                Integer.parseInt(String.valueOf(resultat));
                resultat= svarEngångsBiljett * svarAatalBesök;

                if (resultat < manadsKortPris){
                    JOptionPane.showMessageDialog(null, " Det är biligare att köpa engångsbiljett" );
                } else if (resultat > manadsKortPris) {
                  JOptionPane.showMessageDialog(null,"Det är billigare att köpa månadskort" );
                } else if (resultat == manadsKortPris) {
                    JOptionPane.showMessageDialog(null,"Det är ingen skillnad på priset");
                }
                JOptionPane.showConfirmDialog(null, "Välj en knapp om du vill försätta eller avsluta programmet");
            } catch (Exception e){
                break;
            }
        }
    }
}
