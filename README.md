# javaEE_SpringBoot_WebApi_Mysql_Jdbc_Crud

Basic Web API with Mysql and Jdbc using SpringBoot

GET
localhost:8085/api/employee/list


POST
localhost:8085/api/employee/add
{
         "name": "Rest",
        "address": "In",
        "email": "res@yahoo.com"
}


POST/PUT
localhost:8085/api/employee/edit

 {
        "id": 32,
        "name": "RIP",
        "address": "In",
        "email": "res@yahoo.com"
    }
    
    
POST/DELETE

localhost:8085/api/employee/delete/1

