package app;

import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg){

        List<Students> listStudents = new ArrayList<>();

        listStudents.add(new Students(1L, "Maria", "Montoya", "ma@correo.com", "34534"));
        listStudents.add(new Students(2L, "Mar", "Rios", "mar@correo.com", "34535"));
        listStudents.add(new Students(3L, "Luisa", "Hoyos", "lui@correo.com", "34536"));
        listStudents.add(new Students(4L, "Danilo", "Polo", "danilo@correo.com", "34537"));
        listStudents.add(new Students(5L, "Sara", "Sanchez", "sara@correo.com", "34538"));

        System.out.println("List of Students");
        for (Students student : listStudents){
            System.out.println("ID: " + student.getId() +", Name: " + student.getFirstName());
        }
    }
}
