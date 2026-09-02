package repositories.impl;

import models.Enrollment;
import repositories.EnrollmentRepository;

import java.util.List;

public class EnrollmentRepositoryImpl implements EnrollmentRepository {
    private final List<Enrollment> enrollments;

    public EnrollmentRepositoryImpl(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    @Override
    public Enrollment findById(long Id) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudentId().equals(Id)) {
                return enrollment;
            }
        }
        return null;

    }

    @Override
    public List<Enrollment> findAll() {
        return enrollments;
    }

    @Override
    public void deleteById(long Id) {
        Enrollment enrollment = findById(Id);
        if (enrollment != null) {
            enrollments.remove(enrollment);
        }
    }
}


