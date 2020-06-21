package com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.controller;

import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Implmentation.EmployeeImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@RestController
@RequestMapping("/api/employee/")
public class DeleteController {

    @GetMapping("delete/{id}")
    public String test(@PathVariable("id") int id){
        //System.out.println("Add Controller called");
        try {
            new EmployeeImpl().deleteEmployee(id);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deleted...");
        return "{status:OK}";
    }
}
