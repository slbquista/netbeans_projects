/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1516392
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        String expResult = "employee_id = " + 1 + "\nfirst_name = " + "Finn" + "\nlast_name = " + "Turnbull" + "\nsalary = " + 15000 + "\ndepartment_id = " + 5;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee_id method, of class Employee.
     */
    @Test
    public void testGetEmployee_id() {
        System.out.println("getEmployee_id");
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        int expResult = 1;
        int result = instance.getEmployee_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst_name method, of class Employee.
     */
    @Test
    public void testGetFirst_name() {
        System.out.println("getFirst_name");
        //Employee instance = null;
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        String expResult = "Finn";
        String result = instance.getFirst_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLast_name method, of class Employee.
     */
    @Test
    public void testGetLast_name() {
        System.out.println("getLast_name");
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        String expResult = "Turnbull";
        String result = instance.getLast_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        double expResult = 15000.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 15000.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment_id method, of class Employee.
     */
    @Test
    public void testGetDepartment_id() {
        System.out.println("getDepartment_id");
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        int expResult = 5;
        int result = instance.getDepartment_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirst_name method, of class Employee.
     */
    @Test
    public void testSetFirst_name() {
        System.out.println("setFirst_name");
        String first_name = "";
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        instance.setFirst_name(first_name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLast_name method, of class Employee.
     */
    @Test
    public void testSetLast_name() {
        System.out.println("setLast_name");
        String last_name = "";
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        instance.setLast_name(last_name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 0.0;
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment_id method, of class Employee.
     */
    @Test
    public void testSetDepartment_id() {
        System.out.println("setDepartment_id");
        int department_id = 0;
        Employee instance = new Employee(1, "Finn", "Turnbull", 15000, 5);
        instance.setDepartment_id(department_id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
