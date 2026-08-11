package app;

import models.Courses;
import models.Enrollments;
import models.Students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] arg){

        List<Students> studentList = new ArrayList<>();

        studentList.add(new Students(1L, "Maria", "Montoya", "ma@correo.com", "34534"));
        studentList.add(new Students(2L, "Mar", "Rios", "mar@correo.com", "34535"));
        studentList.add(new Students(3L, "Luisa", "Hoyos", "lui@correo.com", "34536"));
        studentList.add(new Students(4L, "Danilo", "Polo", "danilo@correo.com", "34537"));
        studentList.add(new Students(5L, "Sara", "Sanchez", "sara@correo.com", "34538"));

        System.out.println("Student List");
        for (Students student : studentList){
            System.out.println("ID: " + student.getId() +", Name: " + student.getFirstName() + ", Last Name: " + student.getLastName());
        }
        List<Courses> courseList = new ArrayList<>();

        courseList.add(new Courses(101L, "C12", "Ciencias Naturales", "Curso para Primaria y Secundaria", 20,LocalDateTime.now().toString()));
        courseList.add(new Courses(201L, "M1", "Matemáticas", "Matemáticas básica para Primaria", 20, LocalDateTime.now().toString()));
        courseList.add(new Courses(301L, "F2", "Física", "Clase de Física para Secundaria", 20, LocalDateTime.now().toString()));
        courseList.add(new Courses(401L, "Q12", "Química", "Curso de Química para Primaria y Secundaria", 20, LocalDateTime.now().toString()));


        System.out.println("Course List");
        for (Courses courses : courseList){
            System.out.println("ID: " + courses.getId() +", Name: " + courses.getname() + ". Description: " + courses.getDescription() + ". Registration Time: " + courses.getCreatedAt() );
        }

        List<Enrollments> enrollmentList = new ArrayList<>();

        enrollmentList.add(new Enrollments(1L, 101L, "Active", LocalDateTime.now().toString()));
        enrollmentList.add(new Enrollments(1L, 301L, "Active", LocalDateTime.now().toString()));
        enrollmentList.add(new Enrollments(2L, 201L, "Active", LocalDateTime.now().toString()));
        enrollmentList.add(new Enrollments(3L, 401L, "Deactivated", LocalDateTime.now().toString()));


        System.out.println("Enrollment List");
        for (Enrollments enrollments : enrollmentList){
            System.out.println("Student ID: " + enrollments.getStudentId() + ". Status: " + enrollments.getStatus() + ". Registration Time: " + enrollments.getEnrollmentDate());
        }


    }
}
