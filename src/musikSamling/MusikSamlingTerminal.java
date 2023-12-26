package musikSamling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusikSamlingTerminal {

    public static void main(String[] args) {
        MusikSamlingTerminal musikSamlingTerminal = new MusikSamlingTerminal(); // måste skapa en objekt som heter samma sak som classnamnet.
        musikSamlingTerminal.run();// skriva klass namnet.run
    }

    private void run() {
        boolean runProgram = true;
        List<CdSkiva> cdSkivaList = new ArrayList<>();

        while (runProgram == true){
            Scanner anvandarInput = new Scanner(System.in);// skapar en instans av Scanner (System.in);
            System.out.println("Vad vill du göra? 'L'ägg till, 'D'elete, 'V'isa eller 'A'vsluta");// skriver i terminalen
            String villGoraInput = anvandarInput.next();
            if (villGoraInput.equals("A")) {
                runProgram = false;
            } else if (villGoraInput.equals(("D"))) {
                delete(anvandarInput, cdSkivaList);
            } else if (villGoraInput.equals("V")) {
                System.out.println(cdSkivaList.toString());
            } if (villGoraInput.equals("L")) {
                laggTill(anvandarInput, cdSkivaList);
            }
        }
        System.out.println("Tack för att du har använt mitt Musiksamlings program. Välkommen åter!");
    }
    // att göras metod  i client klassen.
    private void delete(Scanner anvandarInput, List<CdSkiva> cdSkivaList) {
        System.out.println("Vad heter artisten?");
        String artistInput = anvandarInput.next();
        System.out.println(" Vad heter albumet?");
        String albumInput = anvandarInput.next();
        CdSkiva cdSkiva = new CdSkiva(artistInput, albumInput);
        cdSkivaList.remove(cdSkiva);
    }
    private void laggTill(Scanner anvandarInput, List<CdSkiva> cdSkivaList) {
        System.out.println("Vad heter artisten?");
        String artistInput = anvandarInput.next();
        System.out.println(" Vad heter albumet?");
        String albumInput = anvandarInput.next();
        CdSkiva cdSkiva = new CdSkiva(artistInput, albumInput);
        cdSkivaList.add(cdSkiva);
    }
}