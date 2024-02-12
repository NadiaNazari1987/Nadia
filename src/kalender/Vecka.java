package kalender;

public enum Vecka { // 1: först skapar jag en enum
    MANDAG("Måndag"), // 2: sen skapar jag instanserna/datamängden som får finnas tex MANDAG
    TISDAG("Tisdag"), // 5: anropar nya konsturktorn med string för vänligt utskrift, text MANDAG("måndag")
    ONSDAG("Onsdag");

    Vecka(String utskriftsvanligNamn) {
        // 4: skapar en konstruktor som tillåter att man anger utskriftsvanligNamn för enum.
        this.utskriftsvanligNamn = utskriftsvanligNamn;
    }

    private String utskriftsvanligNamn; // 3: skapar en egenskap(privat) som jag vill lägga till tex utskriftsvänlig text

    public String getUtskriftsvanligNamn() { // 6: skapar getter så klient/main kan accessa utskriftvänliga namnet
        return utskriftsvanligNamn;
    }
}
