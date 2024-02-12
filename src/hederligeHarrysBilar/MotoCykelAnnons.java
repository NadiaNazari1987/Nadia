package hederligeHarrysBilar;

public class MotoCykelAnnons extends FordonAnnons implements Publishable{

    private String motorVolym;
    private String drivtyp;
    private String annonsText;

    public MotoCykelAnnons(int pris, String rubrik, String beskrivning, int arsModell, int antalMil, String annonsText, String motorVolym, String drivtyp, String annonsText1) {
        super(pris, rubrik, beskrivning, arsModell, antalMil, annonsText);
        this.motorVolym = motorVolym;
        this.drivtyp = drivtyp;
        this.annonsText = annonsText1;
    }

    public String getMotorVolym() {
        return motorVolym;
    }

    public void setMotorVolym(String motorVolym) {
        this.motorVolym = motorVolym;
    }

    public String getDrivtyp() {
        return drivtyp;
    }

    public void setDrivtyp(String drivtyp) {
        this.drivtyp = drivtyp;
    }

    @Override
    public void setAnnonsText(String annonsText) {
        this.annonsText = annonsText;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return  superString + "MotoCykelAnnons{" +
                "motorVolym='" + motorVolym + '\'' +
                ", drivtyp='" + drivtyp + '\'' +
                ", annonsText='" + annonsText + '\'' +
                '}';
    }
    public String publishable(){
        return ("publishable"+ getRubrik()+getPris());
    }

}
