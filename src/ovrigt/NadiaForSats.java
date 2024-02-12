package ovrigt;

import java.util.*;

public class NadiaForSats {
    public static void main(String[] args) {

        String namn = "Ryan Adrina";
        int i = 0;
        int antal = 0;

        var scan = new Scanner(System.in);
        System.out.println("Skriv en mening!");
        String s =scan.nextLine();


        while(i< s.length() ) {
            if (s.charAt(i) == ' ')
                antal = antal + 1;
            i++;
        }
        System.out.println("Antal blanka tecken: " + antal);
    }
}
