package ru.skillbox.student.registration.event;
import org.springframework.context.ApplicationEvent;

public class StudentDeletionEvent extends ApplicationEvent {
    private final Long studentId;

    public StudentDeletionEvent(Object source, Long studentId) {
        super(source);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
}
