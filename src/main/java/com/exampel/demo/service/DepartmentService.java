package com.exampel.demo.service;

import com.exampel.demo.entity.Department;
import com.exampel.demo.exceptions.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentFromId(Long id) throws DepartmentNotFoundException;
    public void  deleteDepartmentFromId(Long id);
    public Department updateDepartmentById(Long id,Department department);

}
