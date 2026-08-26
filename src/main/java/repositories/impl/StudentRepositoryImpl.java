package repositories.impl;

import models.Student;
import repositories.StudentRepository;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private final List<Student> students;

    public StudentRepositoryImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(long Id) {
        for (Student student : students) {
            if (student.getId().equals (Id)){
                return  student;
            }
        }
        return null;

        }

    @Override
    public void deleteById(Long id){
        Student student = findById(id);
        if (student != null){
            students.remove(student);

        }
    }


        @Override
        public List<Student> findAll () {
            return students;
        }
    }

