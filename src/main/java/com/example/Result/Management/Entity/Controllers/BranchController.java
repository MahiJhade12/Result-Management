package com.example.Result.Management.Entity.Controllers;

import com.example.Result.Management.Entity.Grant;
import com.example.Result.Management.Services.BranchService;
import com.example.Result.Management.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    StudentService studentService;


    @Autowired
    BranchService branchService;

    @GetMapping("/getHodOfMaxPassingStudents")
    public List<String> getMaxListHodsOfPassingStudents(){
        return branchService.findMaxListHods();
    }

    @GetMapping("/getGrant")
    public Grant maximumStudentGrant(){
     return branchService.getMaxtimumGrant();
    }

}
