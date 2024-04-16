package ru.skillbox.student.registration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.skillbox.student.registration.event.StudentCreationEvent;

@Component
public class StudentCreationListener {

    @EventListener
    public void handleStudentCreation(StudentCreationEvent event) {
        System.out.println("Student created: " + event.getStudent());
    }
}
