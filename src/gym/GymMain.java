package gym;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class GymMain {
    public static void main(String[] args) {
        // kundLista en lista som endast får innehålla Kund objekt
        // väljer typen ArrayList för den passar när man vill lägga till i slutet på listan
        List<Kund> kundLista = new ArrayList<>();

        // läs in värden(kunder) från filen och sparar ner i kundlistan
        lasInFil(kundLista);

        String besokare = "."; // skapar besökar variabel och sätter den till punkt för att while loopen ska köras
        while (besokare != "") { // så länge besökare inte är lika med tom sträng (användaren har inte skrivit något, bara tryckt enter)
            besokare = lasinBesokare(kundLista);
        }
    }

    private static void lasInFil(List<Kund> kundLista) {
        String filNamn = "src\\gym\\customers.txt"; // path(sökväg) börjar från src mappen
        Kund kund = null; // deklarerar en ny kund variabel som har värdet null
        try (Scanner inputFil = new Scanner(new File(filNamn))) { // öppnar filen med 'try with resource' och då stänger java automatiskt filen åt mig när try/catch är klar
            boolean personnummerOchNamn = true; // skapar boolean som säger vilken typ av rad som vi ska läsa in, första raden som vi läser är person info rad
            // så länge inputFil(filen) har en rad till så kör vi while loopen
            while (inputFil.hasNextLine()) { // kontrollerar/frågar om ny rad finns och håller på tills nextLin inte finns längre
                if (personnummerOchNamn == true) { // kontrollerar om det är personNr och namn som vi läser in
                    kund = new Kund(); // skapar en ny kund
                    lasInPerson(inputFil, kund); // läs in personNr och namn till kund variabeln
                    personnummerOchNamn = false; // ska inte läsa in personNr och namn nästa gång
                } else {
                    lasinDatum(inputFil, kund); // läs in datum/ skapar en metod för att läsainDatum
                    kundLista.add(kund); // nu är vi klara med information för en kund och sparar ner kunden i kundListan
                    personnummerOchNamn = true; // läs in personNr och namn nästa gång
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen finns inte");
        } catch (IOException e) {
            System.out.println("Filen kan inte användas");
        }
    }

    private static void lasInPerson(Scanner inputFil, Kund kund) {
        // läser in nästa rad och sparar ner den i en string som heter rad.
        String rad = inputFil.nextLine();
        // plockar ut kommatecknet
        int kommatecknetPosition = rad.indexOf(",");
        String personnummer = rad.substring(0,kommatecknetPosition); // skapa en ny sträng från 0 position till innan kommateknets position
        kund.setPersonnummer(personnummer); // sparar personnummer i kund
        String namn = rad.substring(kommatecknetPosition+2, rad.length()); // skapar en ny sträng och startpositionen tar jag plus 2 för att hoppa över kommatecknet och mellanslaget innan namn
        kund.setNamn(namn); // sparar namn
    }

    private static void lasinDatum(Scanner inputFil, Kund kund) {
        // läser in inputdatumet .nextline och sparar den i rad stingen
        String rad = inputFil.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // konverterings klass för string till datum, och säger hur datumet är skrivet i string
        try {
            Date betaldMedlemskap = dateFormat.parse(rad); // anropar konverterings metod
            kund.setBetaldMedlemskap(betaldMedlemskap); // sparar betal datum
        } catch (ParseException e) {// ifall datumet har fel format
            System.out.println("Datum i filen är inte av format yyyy-MM-dd.");
        }
    }

    private static String lasinBesokare(List<Kund> kundLista) {
        String besokare; // först skapar jag en string som heter besökare.
        System.out.println("Vem besöker gymmet? Tryck enbart på Enter om du vill avsluta programmet");
        Scanner inputTangentbord = new Scanner(System.in); // läser in från tangentbordet
        besokare = inputTangentbord.nextLine(); // sparar besökaren som anges av användaren
        boolean traff = false;// en variabeln av typpen boolean som anger ifall vi har fått träff eller ej
        for (Kund kund : kundLista) { // forEach kund i kundLista, betyder att vi loopar igenom hela listans alla kunder
            if (besokare.equals(kund.getPersonnummer()) || besokare.equals(kund.getNamn())) { // ifall match på personnummer eller namn bli traff.
                traff = true; // vi har fått träff
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.YEAR, -1); // skapar en calender som är ett år gammal i tiden
                Date oneYearAgo = cal.getTime(); // får ett date objekt som är ett år sedan
                if (kund.getBetaldMedlemskap().after(oneYearAgo)) { // kontrollerar ifall betalmedlemskap är efter ett år sen
                    System.out.println("Kunden är en nuvarande medlem.");
                    sparaBesok(kund); // sparar besök för PT
                } else {
                    System.out.println("Kunden är en föredetta kund");//ifall mer än ett år sen, sparar inte ner besöket
                }
                break; // vi har hittat kunden och behöver inte leta mer i kundLista. break'ar/avslutar for-each loopen
            }
        }
        if (traff == false) {// om vi aldrig får en träff.
            System.out.println("Personen inte finns i filen och har därför aldrig varit medlem och är obehörig.");
        }
        return besokare;// retunerar användarens input till while-loppen som kontrollerar om användare vill köra igen eller avsluta programmet
    }

    private static void sparaBesok(Kund kund) {
        String fileName = "src\\gym\\besok.txt"; // Skapar en ny filnamn. path(sökvägen)
        // gör en try-with-resource med en utfil som stängs automatiskt av java
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {//skapar en buffer writer till en fil och appendar
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // konverterings object för från date till string
            Date dagensDatum = new Date(); // java ger mig dagens datum
            writer.append(kund.getPersonnummer() + ", " + kund.getNamn() + ", " + dateFormat.format(dagensDatum)); // konverterar från java-datum till string
            writer.append("\r\n"); // lägger till en radbrytning
        } catch (IOException e) {
            System.out.println("Kunde inte skriva till filen");
        }
    }

}
