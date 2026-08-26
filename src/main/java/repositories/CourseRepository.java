package repositories;

import models.Course;
import models.Student;

import java.util.List;

public interface CourseRepository {

    void save (Course course);
    Course findById (long Id);
    void deleteById (long Id);
    List<Course> findAll();

}


