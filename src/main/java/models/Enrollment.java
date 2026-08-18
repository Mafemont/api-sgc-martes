package models;
import java.time.LocalDateTime;

public class Enrollment {

    private Long studentId;
    private Long courseId;
    private String status;
    private String createdAt;


    public Enrollment()
    {
    }

    public Enrollment(long studentId, long courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = status;
        this.createdAt = LocalDateTime.now().toString();
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


}
