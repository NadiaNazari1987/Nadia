package personhashmap;

import java.util.Objects;

public class Person {

    private String personNummer;
    private String namn;
    private String adress;

    public Person(String personNummer, String namn, String adress) {
        this.personNummer = personNummer;
        this.namn = namn;
        this.adress = adress;
    }

    @Override// skapar equals och hashCode endast för personnummer, för det är endast personnummer som pekar ut en specefik person.
    public boolean equals(Object o) {//equals är alltid boolean, är alltigen true eller false. den jämför med (objekt other)
        if (this == o) return true; // om den här ( this objektet == 0) då retunerar true;
        if (o == null || getClass() != o.getClass()) return false;// om (other objekt == null)Eller (getClass)inte är lika med other.getClass då retunerar den false;
        Person person = (Person) o;
        return Objects.equals(personNummer, person.personNummer);
    }

    @Override
    public int hashCode() {// hastCode ger alltid ett id som är i integer form.
        return Objects.hash(personNummer);
    }
}
