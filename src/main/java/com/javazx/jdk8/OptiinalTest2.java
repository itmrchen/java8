package com.javazx.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author: itmrchen
 * @Description:公司员工Optional测试类
 * @date 2019/8/11 1:29
 */
public class OptiinalTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setCompanyName("javazxw");
        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        company.setEmployees(employeeList);
        Optional<Company> optionalCompany = Optional.ofNullable(company);
        System.out.println(optionalCompany.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));

    }
}
