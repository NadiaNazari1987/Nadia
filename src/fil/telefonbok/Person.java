package fil.telefonbok;

import java.util.Objects;

public class Person {
    private String namn;
    private long telefonnummer;

    public Person(String namn, long telefonnummer) {
        this.namn = namn;
        this.telefonnummer = telefonnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public long getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(long telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return telefonnummer == person.telefonnummer && Objects.equals(namn, person.namn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namn, telefonnummer);
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", telefonnummer=" + telefonnummer +
                '}';
    }
}
