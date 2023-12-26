package bank;

import bank.databarare.BankKonto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bankterminal {
    public static void main(String[] args) {
        Bankterminal bankterminal = new Bankterminal();
        bankterminal.run();

    }
    private void run(){
        boolean runProgram = true;
        List<BankKonto> bankKontoList = new ArrayList<>();

        while (runProgram == true){
            Scanner anvandarInput = new Scanner(System.in);
            System.out.println("vad vill du göra? '1'sattaInPengar, '2'taUtPengar, '3'visaBelopp, '4'aktiveraKonto, '5'avslutaProgram ");
            String villGoraInput = anvandarInput.next();
            if (villGoraInput.equals("5")){
                runProgram =false;
                System.out.println(" tack, välkommen åter!");
            } else if (villGoraInput.equals("1")) {
                sattaInPengar( anvandarInput, bankKontoList);
            } else if (villGoraInput.equals("2")) {
                taUtPengar( anvandarInput, bankKontoList);
            } else if ( villGoraInput.equals("3")) {
                System.out.println(bankKontoList.toString());
            }
        }
    }
    private void taUtPengar(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Hur mycket pengar vill du ta ut från ditt konto ?");
    }

    private void sattaInPengar(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Hur mycket pengar vill du sätta in på ditt konto");
    }
}
