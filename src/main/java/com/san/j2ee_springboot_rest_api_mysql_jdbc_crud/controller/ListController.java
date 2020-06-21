package com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.controller;

import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Implmentation.EmployeeImpl;
import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Models.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee/")
public class ListController {
    @GetMapping("list")
    public List<Employee> showEmployees() throws SQLException, ClassNotFoundException {
        ArrayList<Employee> employees=null;
        employees=new EmployeeImpl().listEmployee();
        System.out.println("Employees List in Json format");
        return employees;
        /*
        Note: Since, this is just Api, we are not sending this
        model to any views, so we don't bind this model

        Now, any UI (Angular, React can call this api and get the
        JSON data and show them in their views...
         */
    }
}
