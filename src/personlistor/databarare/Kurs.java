package personlistor.databarare;

import kurs.databarare.Student;

import java.util.List;

public class Kurs {
    private String kursName;// en class-variabel
    private Larare larare;// referens till larare

    private List<Student> studentsList;

    public Kurs(String kursName, Larare larare, List<Student> studentsList) {
        this.kursName = kursName;
        this.larare = larare;
        this.studentsList = studentsList;
    }

    public Kurs(String kursName) {
        this.kursName = kursName;
    }
 
    @Override
    public String toString() {
        return "Kurs{" +
                "kursName='" + kursName + '\'' +
                ", larare='" + larare + '\'' +
                '}';
    }
    public void addStudent(kurs.databarare.Student newStudent){
        studentsList.add(newStudent);
    }

    public void removeStudent(Student student){
        studentsList.remove(student);
    }

}

