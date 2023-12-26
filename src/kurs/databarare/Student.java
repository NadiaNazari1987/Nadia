package kurs.databarare;

import java.util.Objects;

public class Student {

    private String name;


    public Student(String name) {
        this.name = name;
    }

    // toString metoden används allatid i java för att skriva ut info om en databärarre. (arvs från objekt-classen för java.)
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
// equals används i java. för att jämföra en databärares instanser med varandra (skrivs allatid tillsammans med hashCode).
// de här behövs när man lägga till och ta bort från en lista.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }
// hashCode används i java. för att ge ett idintitet till ett annat.
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
