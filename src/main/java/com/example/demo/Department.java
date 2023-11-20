package com.example.demo;

public class Department {

    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void work(){
        System.out.println("Department work");
    }
}
