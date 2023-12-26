package kurs.databarare;

import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private String name;
    private String teacher;
    private List<Student> studentsList;

    public Kurs(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        studentsList = new ArrayList<>();
    }
    @Override
    public String toString() {

        return "Kurs{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", studentsList=" +
                studentsList
                +
                '}';
    }

    public void addStudent(Student newStudent){
        studentsList.add(newStudent);
    }

    public void removeStudent(Student student){
        studentsList.remove(student);
    }






}








