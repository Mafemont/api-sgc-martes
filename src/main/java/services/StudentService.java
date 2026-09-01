package services;

import models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void save (Student student);
    Student findById (long Id);
    void deleteById(Long id);

}