package personListor.databarare;

public class Person {

    private String name;
    private String efterNamne;
    private String personnummer;
    private String dateOfBirth;
    private String adress;

    public Person(String name, String efterNamne, String personnummer, String dateOfBirth, String adress) {
        this.name = name;
        this.efterNamne = efterNamne;
        this.personnummer = personnummer;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }

    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", efterNamne='" + efterNamne + '\'' +
                ", personnummer='" + personnummer + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEfterNamne() {
        return efterNamne;
    }

    public void setEfterNamne(String efterNamne) {
        this.efterNamne = efterNamne;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
