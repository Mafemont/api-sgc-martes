package models;

public class Enrollments {

    private Long id;
    private Long studentId;
    private Long courseId;
    private String status;
    private String createdAt;

    public class Students {
        private String firstName;
        private String lastName;
    }

    public class Courses {
        private String name;
    }

    public Enrollments()
    {
    }

    public Enrollments(long id, long studentId, long courseId, String status, String createdAt) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = status;
        this.createdAt = createdAt;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
