package com.example.Result.Management.Entity;

import com.example.Result.Management.Entity.Enums.BranchName;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Grant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;

    private int amount;

    @OneToOne
    private BranchDepartment branch;
}