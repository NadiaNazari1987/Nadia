package vaxter.client;
import vaxter.model.BevattnaVaxt;
import vaxter.model.Kaktus;
import vaxter.model.Kottatande;
import vaxter.model.Palm;

import javax.swing.*;

public class VaxterMain {
    public static void main(String[] args) {
        // tre-variabler. Typer av växter. hårdkodad. enklare att ändra värderna
        String kaktusTyp = "Kaktus";
        String kottatandeTyp = "Köttätande";
        String palmTyp = "Palm";

        // deklererad variabler för Input- från användaren
        String vaxtTypInput;
        String vaxtNamnInput;
        String vaxtLangdInputString;
        double vaxtLangdInput;

        boolean runProgram = true;
        while (runProgram == true) {// programmet loopar/körs så länge runProgram är true
            try {// try-catch fångar  fel-input och avslutar programmet
                // läser in värden från användaren med hjälp av JOP
                vaxtTypInput = JOptionPane.showInputDialog(null, "Vilken typ av växt ska du lämna in?");
                vaxtNamnInput = JOptionPane.showInputDialog(null, "Vad heter växten?");
                vaxtLangdInputString = JOptionPane.showInputDialog(null, "Hur lång är växten?");
                vaxtLangdInput = Double.parseDouble(vaxtLangdInputString);// får tillbaka en string. måste konvertera till double

                // skriver ut Inputvärden från användaren till Konsolen
                System.out.println(vaxtTypInput);
                System.out.println(vaxtNamnInput);
                System.out.println(vaxtLangdInput);

                // skapar en interface som heter "bevattna" implementerar i alla 3 classer.
                // skapar instans via polymorfism(bevattnaVaxt kan bli palm/kaktus/köttätande.
                BevattnaVaxt bevattnaVaxt = null;// bevattnaVaxt är lika med null från början

                if (vaxtTypInput.equals(kaktusTyp)) {// om input ==lika med kaktustyp skapa jag en kaktus instans
                    bevattnaVaxt = new Kaktus(vaxtNamnInput, vaxtLangdInput);
                } else if (vaxtTypInput.equals(kottatandeTyp)) {
                    bevattnaVaxt = new Kottatande(vaxtNamnInput, vaxtLangdInput);
                } else if (vaxtTypInput.equals(palmTyp)) {
                    bevattnaVaxt = new Palm(vaxtNamnInput, vaxtLangdInput);
                }
                // skapar string variabel och sparar ner hur man bevattnar växten.
                String bevatnaVaxten = bevattnaVaxt.bevattna(); // bevattna metoden returnerar en string
                JOptionPane.showMessageDialog(null, bevatnaVaxten); // skriver ut stringen

            } catch (Exception exception) {// avslutar programmet vid fel info (eller trycker på kryss-rutan i gui)
                runProgram = false;
                JOptionPane.showMessageDialog(null, "Du har angivit fel information, programmet stängs ner.");
            }
        }
    }

}
