package fil.telefonbok;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelefonbokHardCode {
    public static void main(String[] args) {
        TelefonbokHardCode telefonbokHardCode = new TelefonbokHardCode();
        telefonbokHardCode.run();
    }

    private void run() {
        List<Person> telefonbok = new ArrayList<>();
        skapaTelefonbok(telefonbok); // använd denna eller laddaTelefonbokFil()
        sparaTelefonbokTillFil(telefonbok); // använd denna eller laddaTelefonbokFil()
        //laddaTelefonbokFil(telefonbok); // använd denna eller skapaTelefonbok()/sparaTelefonbokTillFil()
        visaTelefonbok(telefonbok);
    }

    private void skapaTelefonbok(List<Person> telefonbok) {
        Person personEtt = new Person("Kalle Kula", 123456789);
        telefonbok.add(personEtt);
        Person personTva = new Person("Orvar Orm", 987654321);
        telefonbok.add(personTva);
        Person personTre = new Person("Maja Mus", 556677);
        telefonbok.add(personTre);
        Person personFyra = new Person("Gustav Grävling", 119988);
        telefonbok.add(personFyra);
    }

    private void sparaTelefonbokTillFil(List<Person> telefonbok) {
        try (FileWriter fileWriter = new FileWriter("telefonbok.txt")) {
            for (Person person : telefonbok) {
                fileWriter.write(person.getNamn() + ";" + person.getTelefonnummer() + "\r");
            }
        } catch (IOException exception) {
            System.out.println("Kunde inte spara ner till Fil." + exception.getMessage());
        }
    }

    private void laddaTelefonbokFil(List<Person> telefonbok) {
        try (Scanner scanner = new Scanner(new File("telefonbok.txt"))) {
            while (scanner.hasNextLine()) {
                String rad = scanner.nextLine();
                String[] parts = rad.split(";");
                Person person = new Person(parts[0], Long.parseLong(parts[1]));
                telefonbok.add(person);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Kunde inte läsa filen." + exception.getMessage());
        }
    }

    private void visaTelefonbok(List<Person> telefonbok) {
        for (Person person : telefonbok) {
            System.out.println(person.toString());
        }
    }
}
