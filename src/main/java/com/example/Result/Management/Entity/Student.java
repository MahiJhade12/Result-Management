package com.example.Result.Management.Entity;


import com.example.Result.Management.Entity.Enums.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String rollNo;

    @Enumerated(value=EnumType.STRING)
    private BranchName branchName;

    private int marks;

    @ManyToOne
    @JoinColumn
    private BranchDepartment branchDepartment;
}
