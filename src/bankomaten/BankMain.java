package bankomaten;

public class BankMain {
    public static void main(String[] args) {

        double ranteSats = 0.04;


        Konto ryanKonto = new Konto(100000, "Sparkonto",ranteSats);
        Personal nadiaPersonal = new Personal("Nadia","20181018",20000, ryanKonto);
        System.out.println(nadiaPersonal);


        Kund ryankKund = new Kund("Ryan","20181018", 123456,ryanKonto);
        System.out.println(ryankKund);

    }

}
