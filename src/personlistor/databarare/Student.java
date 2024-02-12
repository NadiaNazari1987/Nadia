package personlistor.databarare;

import java.util.Objects;

public class Student extends Person {

    private String kurs;
    private String studielangd;
    private String StudieOrt;
    private int arskurs;
    private int studentRabbat;

    public Student(String name, String efterNamne, String personnummer, String dateOfBirth, String adress, String kurs, String studielangd, String studieOrt, int arskurs, int studentRabbat) {
        super(name, efterNamne, personnummer, dateOfBirth, adress);
        this.kurs = kurs;
        this.studielangd = studielangd;
        StudieOrt = studieOrt;
        this.arskurs = arskurs;
        this.studentRabbat = studentRabbat;

    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "kurs='" + kurs + '\'' +
                ", studielangd='" + studielangd + '\'' +
                ", StudieOrt='" + StudieOrt + '\'' +
                ", arskurs=" + arskurs +
                ", studentRabbat=" + studentRabbat +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return arskurs == student.arskurs && studentRabbat == student.studentRabbat && Objects.equals(kurs, student.kurs) && Objects.equals(studielangd, student.studielangd) && Objects.equals(StudieOrt, student.StudieOrt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kurs, studielangd, StudieOrt, arskurs, studentRabbat);
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getStudielangd() {
        return studielangd;
    }

    public void setStudielangd(String studielangd) {
        this.studielangd = studielangd;
    }

    public String getStudieOrt() {
        return StudieOrt;
    }

    public void setStudieOrt(String studieOrt) {
        StudieOrt = studieOrt;
    }

    public int getArskurs() {
        return arskurs;
    }

    public void setArskurs(int arskurs) {
        this.arskurs = arskurs;
    }

    public int getStudentRabbat() {
        return studentRabbat;
    }

    public void setStudentRabbat(int studentRabbat) {
        this.studentRabbat = studentRabbat;
    }
}
