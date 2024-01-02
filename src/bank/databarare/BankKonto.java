package bank.databarare;

import java.util.Objects;

public class BankKonto {

    private boolean aktiv;
    private long belopp;
    private Person person;

    public BankKonto(boolean aktiv, long belopp, Person person) {
        this.aktiv = aktiv;
        this.belopp = belopp;
        this.person = person;
    }

    public BankKonto(Person person){
        this.person = person;
    }

    public BankKonto(boolean aktiv, Person person) {
        this.aktiv = aktiv;
        this.person = person;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public long getBelopp() {
        return belopp;
    }

    public void setBelopp(long belopp) {
        this.belopp = belopp;
    }

    public Person getPerson() {
        return person;
    }

    public long taUtPengar(long uttagBelopp) {
        if (!aktiv) {
            throw new RuntimeException("Kontot är inte aktivt, abvryter transaktion");
        } else {
            if (uttagBelopp <= this.belopp) {
                this.belopp = this.belopp - uttagBelopp;
                return uttagBelopp;
            } else {
                uttagBelopp = this.belopp;
                this.belopp = 0;
                return uttagBelopp;
            }
        }
    }

    @Override
    public String toString() {
        return "BankKonto{" +
                "aktiv=" + aktiv +
                ", belopp=" + belopp +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankKonto bankKonto = (BankKonto) o;
        return Objects.equals(person, bankKonto.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }
}
