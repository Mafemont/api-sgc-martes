package presentation.console;

import models.Student;
import services.StudentService;

import java.util.Scanner;

public class StudentConsole {
private final StudentService studentService;
private final Scanner scanner;

    public StudentConsole(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = scanner;
    }
public StudentService getStudentService(){
        return studentService;
    }

public void createStudent (){
    System.out.println("Crear Estudiante");
    System.out.println("Ingrese ID");
    Long id = Long.parseLong(scanner.nextLine());
    System.out.println("Ingrese Nombre");
    String firstName = scanner.nextLine();
    System.out.println("Ingrese Apellido");
    String lastName = scanner.nextLine();
    System.out.println("Ingrese Email");
    String email = scanner.nextLine();
    System.out.println("Ingrese Teléfono");
    String phone = scanner.nextLine();

    Student student = new Student(id, firstName, lastName, email, phone);
    studentService.save(student);
    System.out.println("Estudiante creado con Éxito");

}

}

