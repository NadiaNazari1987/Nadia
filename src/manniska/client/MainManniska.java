package manniska.client;

import fordon.model.Bike;
import manniska.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainManniska {

    public MainManniska() {
    }

    public static void main(String[] args) {


        Kund kund = new Kund("klader", 200, "Kalle petterson", "123456789-9876", "Storgatan 123", 19870920);
        Chef chef = new Chef("Nadia", "19879829-5465", "Storgatan 18", 1987, 1234975475, 2000, 40000);
        Anstalld anstalld = new Anstalld("Nadia Nazari", "89754545467", "John Ericssonsgatan 234", 1965, 38735, 25000, "20%");
        Student studentAnna = new Student(400, "Uppsala", "Anna Andersson","196397534", "Styrmansgatan 5 ", 1932);

        /*
        System.out.println(kund);
        System.out.println(chef);
        System.out.println(anstalld);
        System.out.println(studentAnna);

         */

        studentAnna.setAdress("valhallagatan 126");
        studentAnna.setStudieOrt("Sundsvall");


        int rabbat = studentAnna.getStudentRabbat();
        System.out.println(studentAnna.getFullstandigName() + " har följande rabbat " + rabbat);


        studentAnna.setStudieOrt("kista");

        int alder = studentAnna.getDateOfBirth();// när man använder get-funktionen och får ut något värde, så måste man spara det i en variabel.
        System.out.println("ålder är "+ alder);// och skriva ut variabeln sedan.



        kund.setVaruinkorg("mat");
        kund.setKundRabbat(300);

        String varukorg = kund.getVaruinkorg();// vi användning av get-funktionen måste man ange om det är ( String eller Int). parantesen ska vara tom.
        System.out.println("Det nya varuinkorgen för kunden innehåller " + varukorg);




        anstalld.setForsaljningsBonus("857665");
        anstalld.setFullstandigName("Kalle Andersson");


        String adress = anstalld.getAdress();// vi användning av get-funktionen måste man ange om det är ( String eller Int). parantesen ska vara tom.
        System.out.println( "adressen till den nya anställden är följande "  + adress);


        chef.setFullstandigName("hassan hassan");
        chef.setBonus(5000);




        System.out.println(studentAnna.toString());
        System.out.println(studentAnna.toString());
        System.out.println(kund);
        System.out.println(anstalld);
        System.out.println(chef);



        List<Manniska>Manniskasamling = new ArrayList<>();
        Manniskasamling.add(kund);
        Manniskasamling.add(anstalld);
        Manniskasamling.add(chef);

        for (Manniska Manniska : Manniskasamling) {
            Manniska.printMe();
        }



    }
}
