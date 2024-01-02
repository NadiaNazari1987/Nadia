package bank.databarare;

import java.util.Objects;

public class Person {

    private String namn;
    private String personNummer;
    private Adress adress;

    public Person(String namn, String personNummer, Adress adress) {
        this.namn = namn;
        this.personNummer = personNummer;
        this.adress = adress;
    }

    public Person(String personNummer) {
        this.personNummer = personNummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getPersonNummer() {
        return personNummer;
    }

    public void setPersonNummer(String personNummer) {
        this.personNummer = personNummer;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", personNummer='" + personNummer + '\'' +
                ", adress=" + adress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personNummer, person.personNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personNummer);
    }
}
