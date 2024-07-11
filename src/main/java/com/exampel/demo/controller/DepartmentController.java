package com.exampel.demo.controller;

import com.exampel.demo.entity.Department;
import com.exampel.demo.service.DepartmentService;
import com.exampel.demo.service.DepartmentServiceImp;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody  Department department){
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentBy(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id){
        return  departmentService.fetchDepartmentFromId(id);
    }

    @DeleteMapping("/departments/{id}")
    public String  deleteDepartmentById(@PathVariable("id") Long id){
        departmentService.deleteDepartmentFromId(id);
        return "delete Successfull";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id")  Long id,@RequestBody Department department){
        return departmentService.updateDepartmentById(id,department);

    }


}
