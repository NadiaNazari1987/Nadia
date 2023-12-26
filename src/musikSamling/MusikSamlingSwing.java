package musikSamling;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MusikSamlingSwing {
    public static void main(String[] args) {
        MusikSamlingSwing musikSamlingSwing = new MusikSamlingSwing();// skapar en objekt av classen under main-metoden
        musikSamlingSwing.run();
    }
    private void run() {
        boolean runProgram = true;// sätter boolean runProgram = true; första gången.
        List<CdSkiva> cdSkivaList = new ArrayList<>();// skapar en ArrayList

        while (runProgram == true) {// while-loopen ska göras igenom så länge runProgrammet == true
            try {// använder en try-catch.
                // instantierar i anslutning till JOP. input från användaren sparas in i Variabeln direkt
                String villGoraInput = JOptionPane.showInputDialog(null, "Vad vill du göra? 'L'ägg till, 'D'elete, 'V'isa eller 'A'vsluta");
                System.out.println(villGoraInput);// skriver ut för kontroll

                if (villGoraInput.equals("A")){// if-input.equals "A". runProgram false-kör exeption
                    runProgram = false;
                } if (villGoraInput.equals("D")){// if input.equals "D". runprogram true-kör Delete-metoden
                    delete(cdSkivaList);
                } else if (villGoraInput.equals("V")){// if input.equals "V". runprogram true-kör sout och visa cdskivaList
                    System.out.println(cdSkivaList.toString());
                } if (villGoraInput.equals("L")){// if-input.equals "L". runProgram true-kör laggTill-metoden
                    laggTill(cdSkivaList);
                }
            } catch (Exception exception) {
                runProgram = false;
                JOptionPane.showMessageDialog(null, "\"Tack för att du har använt mitt Musiksamlings program. Välkommen åter!");
            }
        }
    }
    // att göras metod  i client klassen mer läsbärt.
    private void delete(List<CdSkiva> cdSkivaList) {
        // sparar String-input direkt i artistnamnInput och albumInput
        String artistNamnInput = JOptionPane.showInputDialog(null, "Vad heter artisten? ");
        String albumInput= JOptionPane.showInputDialog(null, "Vad heter albumet? ");
        CdSkiva cdSkiva = new CdSkiva(artistNamnInput, albumInput);// skapar en cdSkiva-objekt av cdSkiva- classen med (2-String-parameter)
        cdSkivaList.remove(cdSkiva);// tar bort artist och album från cdSkiva-classen
    }
    private void laggTill(List<CdSkiva> cdSkivaList) {
        String artistNamnInput = JOptionPane.showInputDialog(null, "Vem vill du lägga till? ");
        String albumInput = JOptionPane.showInputDialog(null, "Vad heter albummen du vill lägga till ?");
        CdSkiva cdSkiva = new CdSkiva(artistNamnInput, albumInput);
        cdSkivaList.add(cdSkiva);// lägger till artistnamnInput och albumInputi cdSkivaList
    }
        }
