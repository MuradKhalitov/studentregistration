package ru.skillbox.student.registration.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.skillbox.student.registration.model.Student;
import ru.skillbox.student.registration.service.StudentService;

import java.util.List;

@ShellComponent
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ShellMethod(value = "Display all students", key = "show-all")
    public String showAllStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            return "No students found";
        }
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }

    @ShellMethod(value = "Add a new student", key = "add-student")
    public String addStudent(String firstName, String lastName, int age) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        studentService.addStudent(student);
        return "Student added successfully";
    }

    @ShellMethod(value = "Delete a student by id", key = "delete-student")
    public String deleteStudentById(Long id) {
        studentService.deleteStudentById(id);
        return "Student deleted successfully";
    }

    @ShellMethod(value = "Clear all students", key = "clear-students")
    public String clearStudents() {
        studentService.clearStudents();
        return "All students cleared successfully";
    }
}

