package com.example.Result.Management.Repository;


import com.example.Result.Management.Entity.Grant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrantRepository extends JpaRepository<Grant,Integer> {
}
