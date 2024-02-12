package person.client;

import person.model.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person ali = new Person("Ali", "Valhallavägen", 39);
        Person nadia = new Person("Nadia", "Styrmansgatan", 35);

        ali.presenteraDig();
        nadia.presenteraDig();

        nadia.setAdress("Valhhallavägen");

        int alder = -12; // vi läser in ålder från scanner
        nadia.setAlder(-23);
        nadia.presenteraDig();
    }
}
