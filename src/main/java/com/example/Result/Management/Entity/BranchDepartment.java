package com.example.Result.Management.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "branch")
@Data
public class BranchDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String BranchName;
    private String HodName;
    private  String contactNo;

    @OneToMany(mappedBy = "branchDepartment",cascade =CascadeType.ALL )
    List<Student> studentsList;

    @OneToOne(mappedBy = "branch",cascade = CascadeType.ALL)
    private Grant grant;
}
