package com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Services;



import com.san.j2ee_springboot_rest_api_mysql_jdbc_crud.Models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {

    boolean addEmployee(Employee emp) throws ClassNotFoundException, SQLException;
    boolean editEmployee(Employee emp) throws ClassNotFoundException, SQLException;
    List<Employee> listEmployee() throws SQLException, ClassNotFoundException;
    boolean deleteEmployee(int id) throws ClassNotFoundException, SQLException;
}
