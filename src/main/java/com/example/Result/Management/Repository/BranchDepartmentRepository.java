package com.example.Result.Management.Repository;

import com.example.Result.Management.Entity.BranchDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchDepartmentRepository extends JpaRepository<BranchDepartment,Integer> {
}
