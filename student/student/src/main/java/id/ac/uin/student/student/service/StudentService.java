package id.ac.uin.student.student.service;

import id.ac.uin.student.student.entity.Student;

import java.util.Optional;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Optional<Student> findById(Long id);

    Optional<Student> findByEmail(String email);

    Student save (Student std);

    void deleteById(Long id);
}
