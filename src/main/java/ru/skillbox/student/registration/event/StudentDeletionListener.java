package ru.skillbox.student.registration.event;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.skillbox.student.registration.event.StudentDeletionEvent;

@Component
public class StudentDeletionListener {

    @EventListener
    public void handleStudentDeletion(StudentDeletionEvent event) {
        System.out.println("Student deleted with id: " + event.getStudentId());
    }
}
