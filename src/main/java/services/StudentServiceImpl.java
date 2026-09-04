package services;

import models.Student;
import repositories.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{


    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(long Id) {
        return studentRepository.findById(Id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
