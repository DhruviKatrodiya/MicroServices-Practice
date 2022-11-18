/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bean;

import entity.Department;
import entity.Employee;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class DataBean {

    @PersistenceContext(unitName = "ictpu")
    EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public Collection<Department> getAllDepartments()
    {
        return em.createNamedQuery("Department.findAll").getResultList();
    }
    
    public Collection<Employee> getAllEmployees()
    {
        return em.createNamedQuery("Employee.findAll").getResultList();
    }
    
}
