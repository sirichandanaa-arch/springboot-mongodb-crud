package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read all
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Read by ID
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    // Delete
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    // Update
    public Student updateStudent(String id, Student updatedStudent) {

        Optional<Student> optionalStudent =
                studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();

            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setDepartment(updatedStudent.getDepartment());
            student.setEmail(updatedStudent.getEmail());

            return studentRepository.save(student);
        }

        return null;
    }
}