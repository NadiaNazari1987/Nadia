package bank.client;

import bank.databarare.Adress;
import bank.databarare.BankKonto;
import bank.databarare.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankTerminal {
    public static void main(String[] args) {
        BankTerminal bankterminal = new BankTerminal();
        bankterminal.run();

    }
    private void run(){
        boolean runProgram = true;
        List<BankKonto> bankKontoList = new ArrayList<>();

        while (runProgram == true){

            Scanner anvandarInput = new Scanner(System.in);
            System.out.println("vad vill du göra? 'S'atta in Pengar, ta'U't Pengar, 'V'isa konton, a'K'tivera konto," +
                    " 'I'naktivera konto, 'A'vsluta program , ska'P'a konto, 'D'elete ");

            String villGoraInput = anvandarInput.nextLine();

            if (villGoraInput.equals("A")){
                runProgram =false;

            } else if (villGoraInput.equals("S")) {
                sattaInPengar( anvandarInput, bankKontoList);

            } else if (villGoraInput.equals("U")) {
                taUtPengar( anvandarInput, bankKontoList);

            } else if (villGoraInput.equals("V")) {
                System.out.println(bankKontoList.toString());

            } else if (villGoraInput.equals("K")) {
                aktiveraKonto( anvandarInput, bankKontoList);

            } else if ( villGoraInput.equals("P")) {
                skapaKonto(anvandarInput,bankKontoList);

            } else if ( villGoraInput.equals("D")) {
                deleteKonto(anvandarInput,bankKontoList);
            } else if (villGoraInput.equals("I")) {
                inaktiveraKonto(anvandarInput, bankKontoList);

            }
        }

        System.out.println("Tack för besöket, välkommen åter! ");
    }
    private void inaktiveraKonto(Scanner anvandarInput, List<BankKonto> bankKontoList) {

        System.out.println("Nu ska vi inaktivera ditt konto");
        System.out.println("ange personnummer som du vill inaktivera konton för? ");

        String personnummerInput = anvandarInput.nextLine();//sparar användarens svar i personnummerInput
        Person inaktiveraPerson =new Person(personnummerInput);// vi sparar svar från användarens i person konstruktoren
        BankKonto inaktiveraKonto = new BankKonto(inaktiveraPerson);// för att kunna inaktivera ett konto behöver vi skapa ett bankkonto och skcika in inaktiveraperson i konstrultoren

        for (BankKonto bankKonto : bankKontoList) {
            if( bankKonto.equals(inaktiveraKonto)){
                bankKonto.setAktiv(false);
            }

        }
        /*
        for(int i=0; i < bankKontoList.size(); i++) {
            BankKonto bankKonto = bankKontoList.get(i);
            if( bankKonto.equals(inaktiveraKonto)){
                bankKonto.setAktiv(false);
            }
        }
        */
    }
    private void skapaKonto(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Vi ska skapa ett konto för en person nu!");

        System.out.println("Vilken ort bor personen på?");
        String ortInput = anvandarInput.nextLine();
        System.out.println("Vilken gata bor personen på?");
        String gataInput = anvandarInput.nextLine();
        Adress adress = new Adress(ortInput, gataInput);

        System.out.println("Vad heter personen?");
        String namnInput = anvandarInput.nextLine();
        System.out.println("Vad har personen för personnummer?");
        String personnummerInput = anvandarInput.nextLine();
        Person person = new Person(namnInput, personnummerInput, adress);

        System.out.println("Vad är personens startkapital?");
        long kapitalStartInput = anvandarInput.nextLong();
        BankKonto bankKonto = new BankKonto(true, kapitalStartInput, person);

        bankKontoList.add(bankKonto);
    }
    private void deleteKonto(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Nu ska vi delete ett bankkonto? ");
        System.out.println(" ange personnummer som du vill radera konto för? ");

        String personummerInput = anvandarInput.nextLine();
        Person deletePerson = new Person(personummerInput);
        BankKonto deleteKonto = new BankKonto(deletePerson);

        boolean resultatDelete = bankKontoList.remove(deleteKonto);
        if (resultatDelete == true){
            System.out.println(" Ditt konto är avslutad");
        } else {
            System.out.println(" Hittar tyvärr inget konto att avsluta");
        }
    }
    private void aktiveraKonto(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Nu ska vi aktivera ditt bankkonto? ");

        System.out.println("Vad har personen för personnummer? ");
        String personnummerInput = anvandarInput.nextLine();
        Person aktiveraKontoPerson = new Person(personnummerInput);
        BankKonto aktiveraKonto = new BankKonto(aktiveraKontoPerson);

        for (BankKonto bankKonto : bankKontoList) {
            if( bankKonto.equals(aktiveraKonto)){
                bankKonto.setAktiv(true);
            }
        }
    }
    private void taUtPengar(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Hur mycket pengar vill du ta ut från ditt konto?");
        long beloppInput = anvandarInput.nextLong();
        System.out.println("Vad är ditt personnummret?");
        String personnummerInput = anvandarInput.nextLine();
        Person taUtPengar = new Person(personnummerInput);
        BankKonto taUtKonto = new BankKonto(taUtPengar);

        for (BankKonto bankKonto :bankKontoList){
            if(bankKonto.equals(taUtKonto)){
                long slutligUttag = bankKonto.taUtPengar(beloppInput);
                System.out.println(" vi kunde ta ut följande belopp åt dig " + slutligUttag);

            }
        }
    }
    private void sattaInPengar(Scanner anvandarInput, List<BankKonto> bankKontoList) {
        System.out.println("Vad är ditt personnummer? ");
        String personnummerInput = anvandarInput.nextLine();
        System.out.println("Hur mycket pengar vill du sätta in på ditt konto");
        long beloppInput = anvandarInput.nextLong();
        Person sattaInPengar = new Person(personnummerInput);
        BankKonto sattaInPengarKonto = new BankKonto(sattaInPengar);

        for (BankKonto bankKonto : bankKontoList){
            if (bankKonto.equals(sattaInPengarKonto)){
                bankKonto.setBelopp(bankKonto.getBelopp()+beloppInput);

            }
        }

    }
}
