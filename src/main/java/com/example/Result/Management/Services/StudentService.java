package com.example.Result.Management.Services;

import com.example.Result.Management.Entity.Enums.BranchName;
import com.example.Result.Management.Entity.Student;
import com.example.Result.Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;



    public String createStudent(String name, BranchName branchName) {
        try {
            Student newStudent = new Student();

            newStudent.setName(name);
            newStudent.setBranchName(branchName);

            studentRepository.save(newStudent);

            return "Student successfully created";
        } catch (Exception e) {
            return "Error in Student creation";
        }
    }
}
