package ru.skillbox.student.registration;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.skillbox.student.registration.service.StudentInitService;

@Component
public class ApplicationStartup {

    private final StudentInitService studentInitService;

    @Autowired
    public ApplicationStartup(StudentInitService studentInitService) {
        this.studentInitService = studentInitService;
    }

    @PostConstruct
    public void init() {
        studentInitService.init();
    }
}
