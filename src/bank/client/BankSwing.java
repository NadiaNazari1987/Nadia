package bank.client;

import bank.databarare.Adress;
import bank.databarare.BankKonto;
import bank.databarare.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.*;

public class BankSwing {
    public static void main(String[] args) {
        BankSwing bankSwing = new BankSwing();
        bankSwing.run();// skriv alltid class-namnet förre .run();

    }

    private void run() {
        boolean runProgram = true;
        List<BankKonto> bankKontoList = new ArrayList<>();

        while (runProgram == true) {
            try {

                String villGoraInput = JOptionPane.showInputDialog(null, "vad vill du göra? 'S'atta in Pengar, ta'U't Pengar, 'V'isa konton, a'K'tivera konto," +
                        " 'I'naktivera konto, 'A'vsluta program , ska'P'a konto, 'D'elete ");


                if (villGoraInput.equals("A")) {
                    runProgram = false;

                } else if (villGoraInput.equals("S")) {
                    sattaInPengar(bankKontoList);

                } else if (villGoraInput.equals("U")) {
                    taUtPengar(bankKontoList);

                } else if (villGoraInput.equals("V")) {
                    System.out.println(bankKontoList.toString());

                } else if (villGoraInput.equals("K")) {
                    aktiveraKonto(bankKontoList);

                } else if (villGoraInput.equals("P")) {
                    skapaKonto(bankKontoList);

                } else if (villGoraInput.equals("D")) {
                    deleteKonto(bankKontoList);
                } else if (villGoraInput.equals("I")) {
                    inaktiveraKonto(bankKontoList);

                }

            } catch (Exception exception) {
                runProgram = false;
                JOptionPane.showMessageDialog(null, "Tack för besöket, välkommen åter! ");
            }
        }
    }

    private void inaktiveraKonto(List<BankKonto> bankKontoList) {

        JOptionPane.showMessageDialog(null, "Nu ska vi inaktivera ditt konto");
        String personNummerInput = JOptionPane.showInputDialog(null, "ange personnummer som du vill inaktivera konton för? ");
        Person person = new Person(personNummerInput);
        BankKonto bankKontoInaktiv = new BankKonto(person);
        for (BankKonto bankKonto : bankKontoList) {
            if (bankKonto.equals(bankKontoInaktiv)) {
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

    private void skapaKonto(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Vi ska skapa ett konto för en person nu!");

        String ortInput = JOptionPane.showInputDialog(null, "Vilken ort bor personen på?");
        String gataInput = JOptionPane.showInputDialog(null, "Vilken gata bor personen på?");
        Adress adress = new Adress(ortInput, gataInput);

        String namnInput = JOptionPane.showInputDialog(null, "Vad heter personen?");
        String personNummerInput = JOptionPane.showInputDialog(null, "Vad har personen för personnummer?");
        Person person = new Person(namnInput, personNummerInput, adress);

        String kapitalStartInput = JOptionPane.showInputDialog(null, "Vad är personens startkapital?");
        long kapitalStartLong = Long.parseLong(kapitalStartInput);// vi får tillbaka en String från JOP. vi måste konvertera Stringgen till Long/int/double.
        BankKonto bankKonto = new BankKonto(true, kapitalStartLong, person);

        bankKontoList.add(bankKonto);
    }

    private void deleteKonto(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Nu ska vi delete ett bankkonto? ");
        String personNummerInput = JOptionPane.showInputDialog(null, " ange personnummer som du vill radera konto för? ");

        Person deletePerson = new Person(personNummerInput);
        BankKonto deleteKonto = new BankKonto(deletePerson);

        boolean resultatDelete = bankKontoList.remove(deleteKonto);
        if (resultatDelete == true) {
            System.out.println(" Ditt konto är avslutad");
        } else {
            System.out.println(" Hittar tyvärr inget konto att avsluta");
        }
    }

    private void aktiveraKonto(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Nu ska vi aktivera ditt bankkonto? ");

        String personNummerInput = JOptionPane.showInputDialog("Vad har personen för personnummer? ");
        Person aktiveraKontoPerson = new Person(personNummerInput);
        BankKonto aktiveraKonto = new BankKonto(aktiveraKontoPerson);

        for (BankKonto bankKonto : bankKontoList) {
            if (bankKonto.equals(aktiveraKonto)) {
                bankKonto.setAktiv(true);
            }
        }
    }

    private void taUtPengar(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Nu ska vi ta ut pengar från ditt bankkonto?");
        String beloppInput = JOptionPane.showInputDialog(null, "Hur mycket pengar vill du ta ut från ditt konto?");

        long beloppLong = Long.parseLong(beloppInput);// vi får tillbaka en String från JOP. vi måste konvertera Stringgen till Long/int/double.
        String personNummerInput = JOptionPane.showInputDialog(null, "Vad är ditt personnummret?");
        Person taUtPengar = new Person(personNummerInput);
        BankKonto taUtKonto = new BankKonto(taUtPengar);

        for (BankKonto bankKonto : bankKontoList) {
            if (bankKonto.equals(taUtKonto)) {
                long slutligUttag = bankKonto.taUtPengar(beloppLong);
                JOptionPane.showMessageDialog(null, " vi kunde ta ut följande belopp åt dig " + slutligUttag);

            }
        }
    }

    private void sattaInPengar(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Nu ska vi sätta in pengar på ditt bankkonto");
        String personNummerInput = JOptionPane.showInputDialog(null, "Vad är ditt personnummer? ");
        String beloppInput = JOptionPane.showInputDialog(null, "Hur mycket pengar vill du sätta in på ditt konto");

        long beloppLong = Long.parseLong(beloppInput); // vi får tillbaka en String från JOP. vi måste konvertera Stringgen till Long/int/double.
        Person sattaInPengar = new Person(personNummerInput);
        BankKonto sattaInPengarKonto = new BankKonto(sattaInPengar);

        for (BankKonto bankKonto : bankKontoList) {
            if (bankKonto.equals(sattaInPengarKonto)) {
                bankKonto.setBelopp(bankKonto.getBelopp() + beloppLong);

            }
        }

    }

    private void visaKonto(List<BankKonto> bankKontoList) {
        JOptionPane.showMessageDialog(null, "Nu ska vi visa ditt bankkonto");
        String personNummerInput = JOptionPane.showInputDialog(null, "Vad är ditt personNummer?");
        Person visaPerson = new Person(personNummerInput);
        BankKonto visaBankKonto = new BankKonto(visaPerson);

        for (BankKonto bankKonto : bankKontoList) {
            if (bankKonto.equals(visaBankKonto)) {
                bankKonto.toString();
            }

        }
    }

}

