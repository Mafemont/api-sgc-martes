package data;

import models.Course;
import models.Enrollment;
import models.Student;
import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static List<Student> studentList = new ArrayList<>();
    private static List<Course> courseList;
    private static List<Enrollment> enrollmentList;

    public DataStore() {

        courseList = new ArrayList<>();
        enrollmentList = new ArrayList<>();
    }

    public static List<Student> getStudents() {
        return studentList;
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudent(Long id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Long id) {
        Student student = getStudent(id);
        if (student != null) {
            studentList.remove(student);
        }
    }



    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Long id) {
        Course course = findCourseById(id);
        if (course != null) {
            courseList.remove(course);
        }
    }

    public Course findCourseById(Long id) {
        for (Course course : courseList) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }



    public List<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollmentList.add(enrollment);
    }

    public Enrollment findEnrollmentById(Long id) {
        for (Enrollment enrollment : enrollmentList) {
            if (enrollment.getStudentId().equals(id)) {
                return enrollment;
            }
        }

        return null;
    }

    public void removeEnrollment(Long id) {
        Enrollment enrollment = findEnrollmentById(id);
        if (enrollment != null) {
            enrollmentList.remove(enrollment);
        }
    }


}
