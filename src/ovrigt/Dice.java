package ovrigt;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void createFile() {
        // random ger mig random tal
        Random random = new Random();
        // deklarerar en int array variabel med plats för 1000 int värden
        int[] intSamling = new int[1000];
        for (int i = 0; i < intSamling.length; i++) {
            // får en integer mellan 0 och 5, så plusar till 1 så jag får mellan 1 och 6
            int anInt = random.nextInt(6) + 1;
            // sparar int värdet i arrayen. pekar ut vilken palts i arrayen med i variabeln
            intSamling[i] = anInt;
        }
        try {
            // skapar en utfil och måste ha en try-catch för IOException
            var utfil = new PrintWriter(new BufferedWriter(new FileWriter("utfil.txt")));

            for (int i = 0; i < intSamling.length; i++) {
                // skriver ut alla int talen i utfilen
                // måste ha plus " " för att få mellanrum mellan mina int
                utfil.print(" " + intSamling[i]);
            }

            // stänger utfilen för jag är klar med att använda den
            utfil.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] createArray() {
        // deklarerar en int array variabel med plats för 1000 int värden.
        // den här variabeln ska min metod returnera, variabeln måste deklareras högst upp för att metoden ska returnera den.
        int[] intSamling = new int[1000];

        try {
            // skapar en utfil och måste ha en try-catch för IOException
            Scanner scanner = new Scanner(new File("utfil.txt"));

            // i variabeln säger vart i arrayen jag ska spara integern som jag läser från filen
            int i = 0;
            // så länge det finns kvar en int i filen så ska jag läsa från den
            while(scanner.hasNextInt()) {
                // läser in int från filen
                int anInt = scanner.nextInt();
                // sparar int i arrayen
                intSamling[i] = anInt;
                // räknar upp i så vi sparar i nästa plats i arrayen
                i++;
            }
            // stänger filen för jag är klar med den
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return intSamling;
    }

    public static int[] analyseArray(int[] intSamling) {
        // deklarerar en int array variabel med plats för 6 olika int värden.
        // den här variabeln ska min metod returnera, variabeln måste deklareras högst upp för att metoden ska returnera den.
        int[] hittadSamling = new int[6];
        for (int i = 0; i < intSamling.length; i++) {
            // tar ut den int som finns och sparar ner den i en variabel
            int hittadInt = intSamling[i];
            // sparar värdet på int som vi har  hittat
            if (hittadInt == 1) {
                hittadSamling[0] = (hittadSamling[0] + 1);
            }
            if (hittadInt == 2) {
                hittadSamling[1] = hittadSamling[1] + 1;
            }
            if (hittadInt == 3) {
                hittadSamling[2] = hittadSamling[2] + 1;
            }
            if (hittadInt == 4) {
                hittadSamling[3] = hittadSamling[3] + 1;
            }
            if (hittadInt == 5) {
                hittadSamling[4] = hittadSamling[4] + 1;
            }
            if (hittadInt == 6) {
                hittadSamling[5] = hittadSamling[5] + 1;
            }
        }
        return hittadSamling;
    }
}