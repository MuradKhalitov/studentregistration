package ru.skillbox.student.registration.service;
import org.springframework.stereotype.Service;
import ru.skillbox.student.registration.model.Student;
import ru.skillbox.student.registration.repository.StudentRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class StudentService implements StudentRepository {


    private final Map<Long, Student> students = new ConcurrentHashMap<>();
    private Long idCounter = 1L;

    @Override
    public List<Student> getAllStudents() {
        return students.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return Optional.ofNullable(students.get(id));
    }

    @Override
    public Student addStudent(Student student) {
        student.setId(generateId());
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public void deleteStudentById(Long id) {
        students.remove(id);
    }

    @Override
    public void clearStudents() {
        students.clear();
    }

    private synchronized Long generateId() {
        return idCounter++;
    }
}


