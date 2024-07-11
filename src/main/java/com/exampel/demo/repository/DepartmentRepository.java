package com.exampel.demo.repository;

import com.exampel.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
    public Department findByDepartmentName(String Name);
}
