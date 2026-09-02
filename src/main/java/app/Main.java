package app;

import data.DataStore;
import models.Course;
import models.Enrollment;
import models.Student;
import presentation.console.StudentConsole;
import repositories.StudentRepository;
import repositories.impl.StudentRepositoryImpl;
import services.StudentService;
import services.StudentServiceImpl;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] arg){

        /*List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1L, "Maria", "Montoya", "ma@correo.com", "34534"));
        studentList.add(new Student(2L, "Mar", "Rios", "mar@correo.com", "34535"));
        studentList.add(new Student(3L, "Luisa", "Hoyos", "lui@correo.com", "34536"));
        studentList.add(new Student(4L, "Danilo", "Polo", "danilo@correo.com", "34537"));
        studentList.add(new Student(5L, "Sara", "Sanchez", "sara@correo.com", "34538"));

        System.out.println("Student List");
        for (Student student : studentList){
            System.out.println("ID: " + student.getId() +", Name: " + student.getFirstName() + ", Last Name: " + student.getLastName());
        }
        List<Course> courseList = new ArrayList<>();

        courseList.add(new Course(101L, "C12", "Ciencias Naturales", "Curso para Primaria y Secundaria", 20));
        courseList.add(new Course(201L, "M1", "Matemáticas", "Matemáticas básica para Primaria", 20));
        courseList.add(new Course(301L, "F2", "Física", "Clase de Física para Secundaria", 20));
        courseList.add(new Course(401L, "Q12", "Química", "Curso de Química para Primaria y Secundaria", 20));


        System.out.println("Course List");
        for (Course course : courseList){
            System.out.println("ID: " + course.getId() +", Name: " + course.getname() + ". Description: " + course.getDescription() + ". Registration Time: " + course.getCreatedAt() );
        }

        List<Enrollment> enrollmentList = new ArrayList<>();

        enrollmentList.add(new Enrollment(1L, 101L, "Active"));
        enrollmentList.add(new Enrollment(1L, 301L, "Active"));
        enrollmentList.add(new Enrollment(2L, 201L, "Active"));
        enrollmentList.add(new Enrollment(3L, 401L, "Deactivated"));


        System.out.println("Enrollment List");
        for (Enrollment enrollment : enrollmentList){
            System.out.println("Student ID: " + enrollment.getStudentId() + ". Status: " + enrollment.getStatus());
        }

        DataStore dataStore = new DataStore();

        dataStore.addStudent(new Student(1L, "Cristian", "Polo", "polo@gmail.com", "12345678"));
        dataStore.addStudent(new Student(2L, "Juli", "Mardach", "mardach@gmail.com", "987654321"));
        dataStore.addStudent(new Student(3L, "Andrea", "Bru", "Bru@gmail.com", "112255336"));

        dataStore.getStudentList().forEach(student -> {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName());
        });
        dataStore.addCourse(new Course(1L,"A01","LÓGICA PROGRAMACIÓN", "Clase de lógica con PSeint", 30));
        dataStore.addCourse(new Course(2L,"A02","SQL", "Clase de BASE DE DATOS", 10));

        dataStore.getCourseList().forEach(course -> {
            System.out.println("ID: " + course.getId() + ", Code: " + course.getCode() + " " + course.getname()+ " " + course.getDescription());
        });

        dataStore.addEnrollment(new Enrollment(1L,1L,"Activo"));
        dataStore.addEnrollment(new Enrollment(1L,1L,"Inactivo"));

        dataStore.getEnrollmentList().forEach(enrollment -> {
            System.out.println("ID: " + enrollment.getStudentId() + ", Curso: " + enrollment.getCourseId() + " " + enrollment.getStatus());
        });*/


        StudentRepository studentRepository = new StudentRepositoryImpl(DataStore.getStudents());
        StudentService studentService = new StudentServiceImpl(studentRepository);
        Scanner scanner = new Scanner(System.in);
        StudentConsole studentConsole = new StudentConsole(studentService, scanner);

        studentConsole.createStudent();



    }
}
//public Enrollment(long studentId, long courseId, String status) {