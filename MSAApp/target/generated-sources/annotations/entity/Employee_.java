package entity;

import entity.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-11-18T20:45:20")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Integer> empId;
    public static volatile SingularAttribute<Employee, String> empName;
    public static volatile SingularAttribute<Employee, Department> deptId;
    public static volatile SingularAttribute<Employee, Integer> salary;

}