package ru.skillbox.student.registration.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import ru.skillbox.student.registration.model.Student;

import java.util.List;

@Service
@ConfigurationProperties(prefix = "student.init")
public class StudentInitService {
    private boolean enabled;
    @Autowired
    private final StudentService studentService;
    private List<Student> students;

    @Autowired
    public StudentInitService(StudentService studentService, StudentService studentService1) {
        this.studentService = studentService1;
        this.enabled = false; // По умолчанию отключаем создание студентов
    }

    public void init() {
        if (enabled && students != null) {
            for (Student student : students) {
                studentService.addStudent(student);
            }
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
