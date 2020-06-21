package com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.controller;

import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Implmentation.EmployeeImpl;
import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@RestController
@RequestMapping("/api/employee/")
public class AddController {

    @PostMapping("add")
    public String doAdd(@RequestBody  Employee emp){
        System.out.println("Adding student..");

        //Employee newEmployee=new Employee(0,name,address,email);

        try {
            new EmployeeImpl().addEmployee(emp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Record Added..");
        return "{status:OK}";
    }
}
