package com.javazx.jdk8;

import java.util.List;

/**
 * @author: itmrchen
 * @Description: 公司类
 * @date 2019/8/11 1:28
 */
public class Company {
    private String companyName;
    private List<Employee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
