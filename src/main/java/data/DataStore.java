package data;

import models.Course;
import models.Enrollment;
import models.Student;

import java.util.ArrayList;
import java.util.List;


public class DataStore {
    private final List<Student> studentList;
    private final List<Course> courseList;
    private final List<Enrollment> enrollmentList;

    public DataStore(){
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
        enrollmentList = new ArrayList<>();
    }

// STUDENT
public List<Student> getStudent(){
        return studentList;
    }
public void addStudent(Student student){
        studentList.add(student);
    }

public Student getStudent(Long id){
   for (Student student : studentList) {
       if (student.getId()==(id)) {
         return student;
         }
     }
     return null;
   }

public void removeStudent(Long id){
   Student student = getStudent(id);
    if (student != null){
       studentList.remove(student);
       }
    }
       
//COURSE: ADD, REMOVE, FIND(get)
public List<Course> getCourse(){
      return courseList;
      }

public void addCourse(Course course){ courseList.add(course);}

public void removeCourse(Long id){
     Course course = findCourseById(id);
      if (course != null){
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

//ENROLLMENT: Add, find, remove
public List<Enrollment> getEnrollment(){
  return enrollmentList;
     }

public void addEnrollment(Enrollment enrollment) {enrollmentList.add(enrollment);}

public Enrollment getEnrollment(Long id) {
  for (Enrollment enrollment : enrollmentList) {
    if (enrollment.getStudentId().equals(id)) {
      return enrollment;
      }
     }
   return null;
  }

public void removeEnrollment(Long id){
   Enrollment enrollment = getEnrollment(id);
    if (enrollment != null){
       enrollmentList.remove(enrollment);
       }
      }

public Enrollment findEnrollmentById(Long id) { //??
   for (Enrollment enrollment : enrollmentList) {
    if (enrollment.getStudentId().equals(id)) {
      return enrollment;
        }
       }
       return null;
      }
}
