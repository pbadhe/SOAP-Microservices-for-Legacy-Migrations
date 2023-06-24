package com.workspace.soap.service;

import com.workspace.employee.Employee;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeFactory;
import java.util.Arrays;
import java.util.List;

@Service
public class BackendService {

    List<Employee> getEmployeesByName(String firstName, String lastName) throws Exception{
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstname("Kate");
        employee1.setLastname("Winslett");
        employee1.setGender("F");
        employee1.setBirthdate(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("1998-02-01"));

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstname("Roger");
        employee2.setLastname("Goyal");
        employee2.setGender("M");
        employee2.setBirthdate(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("2002-02-03"));

        return Arrays.asList(employee1, employee2);
    }

    Employee getEmployeeById(long id) throws Exception{
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstname("Tyler");
        employee.setLastname("Smith");
        employee.setBirthdate(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("1987-02-06"));
        return employee;
    }
}