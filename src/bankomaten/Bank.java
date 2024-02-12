package bankomaten;

public class Bank {

    private int bankId;
    private String bankNamn;
    private String bankAdress;
    private Personal personal;// referens till personal

    public Bank(int bankId, String bankNamn, String bankAdress, Personal personal) {
        this.bankId = bankId;
        this.bankNamn = bankNamn;
        this.bankAdress = bankAdress;
        this.personal = personal;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankNamn() {
        return bankNamn;
    }

    public void setBankNamn(String bankNamn) {
        this.bankNamn = bankNamn;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankNamn='" + bankNamn + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", personal=" + personal +
                '}';
    }
}
