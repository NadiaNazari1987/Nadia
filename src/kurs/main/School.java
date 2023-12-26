package kurs.main;

import kurs.databarare.Kurs;
import kurs.databarare.Student;

public class School {

    public static void main(String[] args) {

        Student sara = new Student("Sara");
        Student anna = new Student("Anna");
        Student olof = new Student("Olof");
        Student anders = new Student("Anders");
        Student erik = new Student("Erik");

        Kurs biologi = new Kurs("Biologi", "Mahmoud");

        System.out.println("skriver ut tre studenter");
        System.out.println(anders);
        System.out.println(erik);
        System.out.println(olof);

        biologi.addStudent(sara);
        biologi.addStudent(anna);
        System.out.println("Skriver ut biologi kursen");
        System.out.println(biologi);


    }
}
