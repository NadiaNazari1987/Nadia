package kalender;

public class KalenderMain {
    public static void main(String[] args) {
        Vecka vecka = Vecka.MANDAG;
        System.out.println("Idag är det " + vecka);
        System.out.println("Idag är det " + vecka.getUtskriftsvanligNamn());

        if (vecka.equals(Vecka.MANDAG)) {
            System.out.println("Kämpa det är måndag!");
        } else {
            System.out.println("Skönt att veckan har kommit igång, måndagar är så jobbigt!");
        }
    }
}
