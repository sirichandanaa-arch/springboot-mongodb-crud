package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.util.ExcelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveExcelData() {

        try {
            InputStream is =
                    new ClassPathResource("students.xlsx").getInputStream();

            List<Student> students =
                    ExcelHelper.excelToStudents(is);

            studentRepository.saveAll(students);

            System.out.println("Excel data saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}