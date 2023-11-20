package com.example.demo;

public class Member {
    private Department department;
    private String memberName;

    private Integer memberAge;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }


    public void work() {
        System.out.println(this.memberName + " working, age is " + this.memberAge);
        department.work();
    }
}
