package randomgame;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class RandomGameTerminal {
    public static void main(String[] args) {
        RandomGameTerminal randomGameTerminal = new RandomGameTerminal();
        randomGameTerminal.run();
    }
    public void run(){
        // genererar slumptal. Skapar en objekt av typen random
        Random random = new Random();
        int randomInt = random.nextInt(100)+1;
        System.out.println(randomInt);

        boolean runProgram = true;
        while (runProgram == true){
            // läser in svar från användaren
            Scanner scan = new Scanner(System.in);
            System.out.println("Gissa ett slumpmässig nummer mellan 1 - 100");
            int svar = scan.nextInt();

            if (svar > randomInt){
                System.out.println("Jag tänker på ett lägre tal");
            } else if (svar < randomInt){
                System.out.println("Jag tänker på ett högre tal");
            } else if (svar == randomInt){
                System.out.println("Grattis, du har gissat rätt, Vill du spela igen? Tryck på S ");
                String svarForsatta = scan.nextLine();
                if ( !svarForsatta.equals("S")){
                    runProgram = false;
                }
            }
        }
    }
}
