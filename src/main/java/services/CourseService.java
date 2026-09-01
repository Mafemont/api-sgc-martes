package services;

import models.Course;

import java.util.List;

public interface CourseService {

    void save (Course course);
    Course findById (long Id);
    void deleteById (long Id);
    List<Course> findAll();
}


