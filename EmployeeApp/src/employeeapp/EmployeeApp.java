/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.ArrayList;

/**
 *
 * @author 1516392
 */
public class EmployeeApp {

    //What does static and final mean again?
    //Follows the format:  - datatype - object? - name - new - type
    static ArrayList<Employee> al = new ArrayList<>();
    static final int maxal = 10;

    public static void main(String[] args) {
        //Test1(); //Test adding and writing a single employee
        //Test2(); //Test adding 10 and writing out all employees
        //Test3(); //Test using ArrayList in main
        Test4(); //Test writing Staff ArrayList as string
        Test5(); //Test total salary
        Test6(); //Test average salary
        Test7(); //Test max salary
        Test8(); //Test min salary
    }

    public static void Test1() {
        // This follows the format: datatype - name - new - object
        Employee e = new Employee(1, "finn", "turnbull", 15000, 5);

        System.out.println(e.toString());
    }

    // The return type here is void, meaning we return nothing to the Employee class
    public static void Test2() {
        for (int i = 0; i < 10; i++) {
            Employee e = new Employee(i, "first" + i, "last" + i, i * 1000, i * 10);

            System.out.println(e.toString());
            System.out.println("-----------------------");
        }
    }

    public static void Test3() {
        for (int i = 0; i < maxal; i++) {
            Employee e = new Employee(i, "first" + i, "last" + i, i * 1000, i * 10);
            al.add(e);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).toString());
        }

    }

    public static void Test4() {
        Staff s = new Staff();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee(i, "first" + 1, "last" + i, i * 1000, i * 10);
            s.addEmployee(emp);
        }

        System.out.println(s.toString2());
    }
    
    public static void Test5() {
        Staff s = new Staff();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee(i, "first" + 1, "last" + i, i * 1000, i * 10);
            s.addEmployee(emp);
        }
        
        System.out.println("\n" + "Total salary of staff: " + s.sumSalary());
    }
    
    public static void Test6() {
        Staff s = new Staff();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee(i, "first" + 1, "last" + i, i * 1000, i * 10);
            s.addEmployee(emp);
        }
        
        System.out.println("\n" + "Average salary of staff: " + s.averageSalary());
    }

    public static void Test7() {
        Staff s = new Staff();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee(i, "first" + 1, "last" + i, i * 1000, i * 10);
            s.addEmployee(emp);
        }
        
        System.out.println("\n" + "Max salary of staff: " + s.maxSalary());
    }
    
    public static void Test8() {
        Staff s = new Staff();

        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee(i, "first" + 1, "last" + i, i * 1000, i * 10);
            s.addEmployee(emp);
        }
        
        System.out.println("\n" + "Min salary of staff: " + s.minSalary());
    }
}
