package com.exampel.demo.service;

import com.exampel.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentFromId(Long id);
    public void  deleteDepartmentFromId(Long id);
    public Department updateDepartmentById(Long id,Department department);

}
