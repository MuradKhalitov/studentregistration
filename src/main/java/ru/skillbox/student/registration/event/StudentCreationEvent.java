package ru.skillbox.student.registration.event;
import org.springframework.context.ApplicationEvent;
import ru.skillbox.student.registration.model.Student;

public class StudentCreationEvent extends ApplicationEvent {
    private final Student student;

    public StudentCreationEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}

