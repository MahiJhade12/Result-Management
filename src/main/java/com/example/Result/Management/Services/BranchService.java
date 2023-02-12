package com.example.Result.Management.Services;

import com.example.Result.Management.Entity.BranchDepartment;
import com.example.Result.Management.Entity.Grant;
import com.example.Result.Management.Entity.Student;
import com.example.Result.Management.Repository.BranchDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class BranchService {
       @Autowired
       BranchDepartmentRepository branchRepository;

        public List<String> findMaxListHods(){

            List<BranchDepartment> branchList = branchRepository.findAll();

            int maxPassingStudents = 0;
            HashMap<BranchDepartment,Integer> branchPassingStudentsMap = new HashMap<>();

            for(BranchDepartment branch : branchList){
                List<Student> studentList = branch.getStudentsList();
                int passStudents = 0;
                for(Student student : studentList){
                    if(student.getMarks()>=40)
                        passStudents++;
                }
                if(passStudents>maxPassingStudents){
                    maxPassingStudents = passStudents;
                }
                branchPassingStudentsMap.put(branch,passStudents);
            }
            List<String> hodPhoneNumbers = new ArrayList<>();

            for(BranchDepartment branch : branchPassingStudentsMap.keySet()){
                if(branchPassingStudentsMap.get(branch) >= maxPassingStudents){
                    hodPhoneNumbers.add(branch.getContactNo());
                }
            }

            return hodPhoneNumbers;
        }

        public Grant getMaxtimumGrant(){
            List<BranchDepartment> branchList = branchRepository.findAll();

            int maxPassingStudents = 0;
            HashMap<BranchDepartment,Integer> branchPassingStudentsMap = new HashMap<>();

            for(BranchDepartment branch : branchList){
                List<Student> studentList = branch.getStudentsList();
                int passStudents = 0;
                for(Student student : studentList){
                    if(student.getMarks()>=40)
                        passStudents++;
                }
                if(passStudents>maxPassingStudents){
                    maxPassingStudents = passStudents;
                }
                branchPassingStudentsMap.put(branch,passStudents);
            }
             Grant grant= null;

            for(BranchDepartment branch : branchPassingStudentsMap.keySet()){
                if(branchPassingStudentsMap.get(branch) > maxPassingStudents){
                    grant=branch.getGrant();
                }
            }

            return grant;
        }
}
