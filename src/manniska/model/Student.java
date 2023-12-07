package manniska.model;

public class Student extends Manniska{

    private int studentRabbat;
    private String studieOrt;


    public Student(int studentRabbat, String studieOrt,String fullstandigName, String personnummer, String adress, int dateOfBirth ) {
        super (fullstandigName, personnummer, adress, dateOfBirth);
        this.studentRabbat = studentRabbat;
        this.studieOrt = studieOrt;
    }// när vi ärver från en superklass, måste vi anropa en av konstruktorer hos superklassen.


    public int geStudentRabbat() {
        return studentRabbat;
    }
    // framför class-variabler superklassen skriver vi "super" i konstruktorern.
    //framför class-variabler subklassen skriver vi "this" i konstruktoren.


    @Override
    public String toString() {
        return "Student{" +
                "studentRabbat=" + studentRabbat +
                ", studieOrt='" + studieOrt + '\'' +
                '}';
    }



    // anropar getter och setter, ifall jag vill sätta eller ändra något värde.
    public int getStudentRabbat() {
        return studentRabbat;
    }

    public void setStudentRabbat(int studentRabbat) {
        this.studentRabbat = studentRabbat;
    }

    public String getStudieOrt() {
        return studieOrt;
    }

    public void setStudieOrt(String studieOrt) {
        this.studieOrt = studieOrt;
    }
}
