package ovrigt;

public class Main {
    public static void main(String[] args) {
        Dice.createFile();
        int[] intSamling = Dice.createArray();
        int[] hittadSamling = Dice.analyseArray(intSamling);
        // skriver ut resultatet
        System.out.println("Siffran " + 1 + " har jag hittat " + hittadSamling[0] + " gånger.");
        System.out.println("Siffran " + 2 + " har jag hittat " + hittadSamling[1] + " gånger.");
        System.out.println("Siffran " + 3 + " har jag hittat " + hittadSamling[2] + " gånger.");
        System.out.println("Siffran " + 4 + " har jag hittat " + hittadSamling[3] + " gånger.");
        System.out.println("Siffran " + 5 + " har jag hittat " + hittadSamling[4] + " gånger.");
        System.out.println("Siffran " + 6 + " har jag hittat " + hittadSamling[5] + " gånger.");
    }
}