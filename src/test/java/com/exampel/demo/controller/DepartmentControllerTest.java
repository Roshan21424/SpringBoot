package com.exampel.demo.controller;

import com.exampel.demo.entity.Department;
import com.exampel.demo.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department = new Department();
        department.setDepartmentId(2);
        department.setDepartmentAddress("Hyderabad");
        department.setDepartmentcode("IT-01");
        department.setDepartmentName("IT");
    }

    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment = new Department();
        inputDepartment.setDepartmentAddress("Hyderabad");
        inputDepartment.setDepartmentcode("IT-01");
        inputDepartment.setDepartmentName("IT");

        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{" +
                        "\"departmentName\":\"IT\"," +
                        "\"departmentAddress\":\"Hyderabad\"," +
                        "\"departmentcode\":\"IT-01\"" +
                        "}")
        ).andExpect(status().isOk());
    }

    @Test
    void fetchDepartmentById() throws Exception {
        Mockito.when(departmentService.fetchDepartmentFromId(2L)).thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.get("/departments/2")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));
    }
}
