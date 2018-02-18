/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author 1516392
 */
public class Employee {
    
    int employee_id;
    String first_name;
    String last_name;
    double salary;
    int department_id;
    
    // Constructor
    public Employee(int employee_id, String first_name, String last_name, double salary, int department_id) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.department_id = department_id;
    }

    // @Override specifies that the method following is user created, even though it has the same name as an inbuilt method.
    @Override
    public String toString() {
        return ("employee_id = " + employee_id + "\nfirst_name = " + first_name + "\nlast_name = " + last_name + "\nsalary = " + salary + "\ndepartment_id = " + department_id);
    }
    
    //Getters
    public int getEmployee_id() {
        return employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment_id() {
        return department_id;
    }
    
    //Setters
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
