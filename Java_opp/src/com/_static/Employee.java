package com._static;

public class Employee {
    private String name;
    private String department;
    private int employeeId;

    //생성자
    public Employee(String name) {
        this.name = name;
        //클래스 변수를 활용해보자.Company.empSerialNumber
        //클래스 이름으로 접근할 수 있다.
        employeeId = Company.empSerialNumber;
        Company.empSerialNumber++;
        //employeeId = 1;
    }
    //getter

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }


}
