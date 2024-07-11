package com.exampel.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long departmentId;

    @NotBlank(message = "Please add the department name")
//    @Length(max=10,min = 1,message = "Please check the length")
//    @Size(max=10,min=1,message = "Please check the size")
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @NegativeOrZero
//    @Past
//    @Future
//    @PastOrPresent
//    @FutureOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentcode;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departAddress) {
        this.departmentAddress = departAddress;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public Department(long departmentId, String departmentName, String departAddress, String departmentcode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departAddress;
        this.departmentcode = departmentcode;
    }
    public Department(){

    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departAddress='" + departmentAddress + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                '}';
    }
}
