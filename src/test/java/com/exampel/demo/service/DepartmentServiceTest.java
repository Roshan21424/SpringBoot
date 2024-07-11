package com.exampel.demo.service;

import com.exampel.demo.entity.Department;
import com.exampel.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp(){
        Department dep= new Department();
        dep.setDepartmentName("IT");
        dep.setDepartmentAddress("Hyderabad");
        dep.setDepartmentcode("IT-01");


        Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(dep);

    }
    @Test
    @DisplayName("When the department is found for a valid department Name")
    public void whenValidDepartmentId_thenDepartmentShouldFound()throws Exception{
        String  departmentName = "IT";
        Department found =departmentService.fetchDepartmentFromName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());

    }
}