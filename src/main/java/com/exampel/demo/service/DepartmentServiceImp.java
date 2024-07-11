package com.exampel.demo.service;

import com.exampel.demo.entity.Department;
import com.exampel.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }


    @Override
    public List<Department> fetchDepartmentList(){
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentFromId(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentFromId(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartmentById(Long id, Department department) {
        Department dep = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDepartmentName()) && ! "".equalsIgnoreCase(department.getDepartmentName())){
            dep.setDepartmentName(department.getDepartmentName());

        }
        if(Objects.nonNull(department.getDepartmentAddress()) && ! "".equalsIgnoreCase(department.getDepartmentAddress())){
            dep.setDepartmentAddress(department.getDepartmentAddress());

        }
        if(Objects.nonNull(department.getDepartmentcode()) && ! "".equalsIgnoreCase(department.getDepartmentcode())){
            dep.setDepartmentcode(department.getDepartmentcode());

        }
        return departmentRepository.save(dep);
    }


}
