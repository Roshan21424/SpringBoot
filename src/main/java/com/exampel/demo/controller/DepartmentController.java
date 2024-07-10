package com.exampel.demo.controller;

import com.exampel.demo.entity.Department;
import com.exampel.demo.service.DepartmentService;
import com.exampel.demo.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody  Department department){
        return departmentService.saveDepartment(department);

    }

}
