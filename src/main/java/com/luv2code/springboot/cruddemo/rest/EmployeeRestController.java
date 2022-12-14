package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    //inject employee DAO
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {

        employeeService = theEmployeeService;
    }


    //expose "/employees" and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {

        return employeeService.findAll();
    }
}
















