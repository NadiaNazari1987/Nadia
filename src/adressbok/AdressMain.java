package adressbok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressMain {
    public static void main(String[] args) {
        AdressMain adressMain = new AdressMain();
        adressMain.run();
    }
    private void run() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Adress> adressHashMap = new HashMap<>();

        boolean runProgram = true;
        while (runProgram) {
            System.out.println("Vad önskar du göra: 'A'vsluta, 'L'ägg till, 'V'isa lista, visa 'P'erson , 'T'a bort ");
            String svarAnvandare = scanner.nextLine();

            if (svarAnvandare.equals("P")) {
                visaPersonAdress(scanner, adressHashMap);
            } else if (svarAnvandare.equals("T")) {
                tabortPersonAdress(scanner, adressHashMap);
            } else if (svarAnvandare.equals("L")) {
                laggTillPersonAdress(scanner, adressHashMap);
            } else if (svarAnvandare.equals("V")) {
                visaMap(adressHashMap);
            } else if (svarAnvandare.equals("A")) {
                runProgram = false;
                System.out.println("Tack för att du använt mitt adress program. Välkommer åter!");
            }
        }
    }
    private void visaPersonAdress(Scanner scanner, Map<String, Adress> adressHashMap) {
        System.out.println("Vad heter personen?");
        String personNamn = scanner.nextLine();
        Adress adress = adressHashMap.get(personNamn);
        if (adress == null) {
            System.out.println("Personen saknas i adress listan.");
        } else {
            System.out.println(personNamn + " " + adress);
        }
    }
    private void tabortPersonAdress(Scanner scanner, Map<String, Adress> adressHashMap) {
        System.out.println("Vad heter personen?");
        String personNamnTabort = scanner.nextLine();
        Adress removed = adressHashMap.remove(personNamnTabort);
        if (removed == null) {
            System.out.println("Personen saknar en adress.");
        } else {
            System.out.println("Personen är borttagen ur adresslistan");
        }
    }

    public static void visaMap(Map<String, Adress> adressHashMap) {
        // iterera/loopa över alla poster
        for (String person : adressHashMap.keySet()) {
            Adress adress = adressHashMap.get(person);
            System.out.print(person + " ");
            System.out.println(adress);
        }
    }
    private void laggTillPersonAdress(Scanner scanner, Map<String, Adress> adressHashMap) {
        System.out.println("Vad heter personen?");
        String personNamn = scanner.nextLine();
        System.out.println("Vad heter orten?");
        String ort = scanner.nextLine();
        System.out.println("Vad är det för postnummer?");
        String postnummer = scanner.nextLine();
        System.out.println("Vad heter gatan?");
        String gata = scanner.nextLine();
        Adress adress = new Adress(ort, postnummer, gata);
        adressHashMap.put(personNamn, adress);
    }
}