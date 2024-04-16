package ru.skillbox.student.registration.repository;
import org.springframework.stereotype.Repository;
import ru.skillbox.student.registration.model.Student;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {
    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student addStudent(Student student);

    void deleteStudentById(Long id);

    void clearStudents();
}


