package djur.client;

import djur.databarare.*;

import javax.swing.*;

public class djurmain {
    public static void main(String[] args) {

        Bjorn bamse = new Bjorn("Bams", "is björn", "300 kg", 30);
        Lejon kungen = new Lejon("kungen", " 240 kg", 15, "240 kg" );
        Giraf langhals = new Giraf("långhals", "prickig", "1200 kg", 25);
        Elefant boheem = new Elefant( "Boheem", "stor öra", 65, "6 ton");
        Delfin selda = new Delfin( "Selda", " simmkunnig", 40, "250 kg");

        System.out.println(bamse);
        System.out.println(kungen);
        System.out.println(langhals);
        System.out.println(boheem);
        System.out.println(selda);

    }
}
