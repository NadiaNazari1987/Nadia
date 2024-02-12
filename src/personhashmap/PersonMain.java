package personhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class PersonMain {
    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();
        personMain.run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personHasmap = new HashMap<>();
        boolean runProgram = true;
        while (runProgram== true){
            try {
                System.out.println("Vad vill du göra? 'A'vsluta, 'V'isa, 'L'ägga till, 'D'elete");
                String svarInput = scanner.nextLine();
                if ( svarInput.equals("A")){
                    runProgram = false;
                    System.out.println(" Nu avslutar vi programmet, tack för besöket och välkomen åter");
                } else if (svarInput.equals("V")) {
                    visaMap(personHasmap);
                } else if (svarInput.equals("L")) {
                    laggaTillPerson(scanner, personHasmap);// behöver två parameter,

                }

            } catch (Exception e){
                break;
            }
        }
    }

    private void laggaTillPerson(Scanner scanner, Map<String, Person> personHasmap) {
        System.out.println("Nu lägger vi till en person i listan");

        System.out.println("Vad har personen för personnummer? ");
        String personnummerKey = scanner.nextLine();
        System.out.println("Vad heter personen? ");
        String namn = scanner.nextLine();
        System.out.println("På vilken adress bor personen? ");
        String adress = scanner.nextLine();

        Person person = new Person(personnummerKey, namn, adress);
        personHasmap.put(personnummerKey, person);

    }

    private void visaMap(Map<String, Person> personHasmap) {
        System.out.println("Nu visa vi listan");
        for (String personKey: personHasmap.keySet()) {
            Person person = personHasmap.get(personKey);
            System.out.println(personHasmap);
            System.out.println(person);
        }
    }
}
