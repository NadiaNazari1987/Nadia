package ovrigt;

import bank.databarare.Adress;
import bank.databarare.BankKonto;
import bank.databarare.Person;

public class BankManagerAnteckning {
    public class BankManager {
        public static void main(String[] args) {

            Adress aliAdress = new Adress("Stockholm", "Storgatan");
            Person aliperson = new Person("Ali AKbari", "19846534-2463", aliAdress);
            BankKonto aliBankKonto = new BankKonto(true, 10000,aliperson);
            //System.out.println(aliBankKonto);


            Adress nadiasAdress = new Adress("Stockholm","Valhallavägen 128");
            Person nadiasPerson = new Person("Nadia Nazari",  "198709542-3178", nadiasAdress);
            BankKonto nadiasBankKonto = new BankKonto(false, 5000,nadiasPerson);
            //System.out.println(nadiasBankKonto);

            System.out.println("ali konto belopp "+ aliBankKonto.getBelopp());
            System.out.println("nadia konto belopp "+ nadiasBankKonto.getBelopp() );
            long uttag = aliBankKonto.taUtPengar(20000);
            nadiasBankKonto.setBelopp(nadiasBankKonto.getBelopp()+ uttag);
            System.out.println("ali konto belopp "+ aliBankKonto.getBelopp());
            System.out.println("nadia konto belopp "+ nadiasBankKonto.getBelopp() );

        }
    }

        /*aliBankKonto.setAktiv(true);// ändra boolean på aliBankKonto
        System.out.println("Statusen för alis bankkonto " + aliBankKonto);
        aliBankKonto.setBelopp(100);
        System.out.println(aliBankKonto);
        aliBankKonto.getBelopp();
        System.out.println("Ali har så mycket pengar på sitt konto" + aliBankKonto);

        nadiasBankKonto.setAktiv(true);
        System.out.println(nadiasBankKonto);
        nadiasBankKonto.getBelopp();
        System.out.println(nadiasBankKonto);*/
}
