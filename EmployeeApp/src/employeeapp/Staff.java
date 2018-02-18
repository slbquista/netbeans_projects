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
public class Staff {
    
    //Created ArrayList called al
    private ArrayList <Employee> al;
    
    //Contstructor is equivelant to creating empty table
    public Staff() {
        al = new ArrayList<>();
    }
    
    //Adds an Employee object called emp to the ArrayList
    //This calls the Employee class and fills a row of data into the 'empty table'
    public Staff addEmployee (Employee e) {
        al.add(e);
        return this;
    }
    
    //Creates a string then adds all the data to it from the ArrayList
    public String toString2(){
       String localString = "" ;
       
       for (Employee e : al){
           localString += "\n\n" + e.toString();
       }
      
       return localString;
    }
    
    public double sumSalary() {
        double sum = 0;
        
        for (Employee e : al) {
            sum += e.getSalary(); 
        }
        
        return sum;
    }
    
    public double averageSalary() {
        double sum = 0;
        double average = 0;
        
        for (Employee e : al) {
            sum += e.getSalary();
        }
        
        average = sum / al.size();
        
        return average;
    }
    
    public double maxSalary() {
        double maxValue = Double.MIN_VALUE;

        
        for (Employee e : al) {
            double value = e.getSalary();
            
            if (value > maxValue) {
                maxValue = value;
            }
        }
        
        return maxValue;
    }
    
    public double minSalary() {
        
        double minValue = Double.MAX_VALUE;

        
        for (Employee e : al) {
            double value = e.getSalary();
            
            if (value < minValue) {
                minValue = value;
            }
        }
        
        return minValue;
    }
}
