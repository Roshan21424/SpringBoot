package com.exampel.demo.controller;

import com.exampel.demo.entity.Department;
import com.exampel.demo.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    public final Logger logger = LoggerFactory.getLogger(Department.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid  @RequestBody  Department department){
        logger.info("inside the saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentBy(){
        logger.info("inside the fetchDepartmentBy method of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id){
        logger.info("inside the fetchDepartmentById method of DepartmentController");
        return  departmentService.fetchDepartmentFromId(id);
    }

    @DeleteMapping("/departments/{id}")
    public String  deleteDepartmentById(@PathVariable("id") Long id){
        logger.info("inside the deleteDepartmentById method of DepartmentController");
        departmentService.deleteDepartmentFromId(id);
        return "delete Successfull";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id")  Long id,@RequestBody Department department){
        logger.info("inside the updateDepartmentById method of DepartmentController");
        return departmentService.updateDepartmentById(id,department);

    }


}
