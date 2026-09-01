package services;

import models.Enrollment;

import java.util.List;

public interface EnrollmentService {
    void save (Enrollment enrollment);
    Enrollment findById (long Id);
    List<Enrollment> deleteById (long Id);
    List<Enrollment> findAll();

}
