package com.exampel.demo.repository;

import com.exampel.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department,Long>{
}
