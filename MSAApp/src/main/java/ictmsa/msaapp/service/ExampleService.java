package ictmsa.msaapp.service;

import bean.DataBean;
import entity.Department;
import entity.Employee;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleService {

    @Inject DataBean db;
    
    @GET
    @RolesAllowed("Admin")
    public String SayHello() {
        return "Hello, world of MSA App! and MSA Client";
    }
    
    @GET
    @Path("getalldepartments")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("Admin")
    public Collection<Department> getAllDepartments()
    {
        return db.getAllDepartments();
    }
    
    @GET
    @Path("getallemployees")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("Admin")
    public Collection<Employee> getAllEmployees()
    {
        return db.getAllEmployees();
    }

}
