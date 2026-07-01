package com.example.demo.util;

import com.example.demo.model.Student;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelHelper {

    public static List<Student> excelToStudents(InputStream is) {
        List<Student> students = new ArrayList<>();

        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheetAt(0);

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {

                Row row = sheet.getRow(rowIndex);

                if (row == null) {
                    continue;
                }

                Student student = new Student();

                student.setName(row.getCell(0).getStringCellValue());
                student.setAge((int) row.getCell(1).getNumericCellValue());
                student.setDepartment(row.getCell(2).getStringCellValue());
                student.setEmail(row.getCell(3).getStringCellValue());

                students.add(student);
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}