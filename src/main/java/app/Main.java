package app;

import data.DataStore;
import models.Course;
import models.Enrollment;
import models.Student;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] arg){

        DataStore dataStore = new DataStore();

        dataStore.addStudent(new Student(1L, "John", "Doe", "john@mail.com", "564565"));
        dataStore.addStudent(new Student(2L, "Jane", "Smith", "janen@mail.com", "564455"));

        dataStore.getStudent().forEach(student -> {
                    System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName());
                });

        dataStore.addCourse(new Course(1L, "ReactVite", "Curso de React con vite", "Aprende ReactVite", 30));
        dataStore.addCourse(new Course(2L, "LogProg", "Logica de Programacion", "Aprende Logica", 30));

        dataStore.getCourse().forEach(course -> {
                    System.out.println("ID: " + course.getId() + ", Name: " + course.getname());
                });

        dataStore.addEnrollment(new Enrollment(1L, 2L, "ACTIVE"));
        dataStore.addEnrollment(new Enrollment(2L, 2L, "ACTIVE"));

        dataStore.getEnrollment().forEach(enrollment -> {
            System.out.println("ID: " + enrollment.getStudentId() + ", Course ID: " + enrollment.getCourseId());
        });

        System.out.println();
        System.out.println(dataStore.getEnrollment());


    }
}
