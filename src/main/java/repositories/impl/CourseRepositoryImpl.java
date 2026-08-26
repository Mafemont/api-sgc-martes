package repositories.impl;

import models.Course;
import models.Enrollment;
import models.Student;
import repositories.CourseRepository;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final List<Course> courses;

    public CourseRepositoryImpl(List<Course> courses) {
        this.courses = courses;
    }


    @Override
    public void save(Course course) {
        courses.add(course);
    }

    @Override
    public Course findById(long Id) {
        for (Course course : courses) {
            if (course.getId().equals (Id)){
                return  course;
            }
        }
        return null;

    }

    @Override
    public void deleteById(long Id) {
        Course course = findById(Id);
        if (course != null){
            courses.remove(course);

        }
    }



    @Override
    public List<Course> findAll() {
        return courses;
    }
}
