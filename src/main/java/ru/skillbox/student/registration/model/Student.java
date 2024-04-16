package ru.skillbox.student.registration.model;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    // Конструкторы, геттеры и сеттеры будут автоматически сгенерированы Lombok'ом

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

