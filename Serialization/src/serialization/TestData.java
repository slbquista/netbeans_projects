/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 1516392
 */
public class TestData {
    private static ArrayList<PersonalDetails> arraylist;
    private static String fileName;

//    public TestData (int personCount) {
//       arraylist = new ArrayList<>();
//       fileName = "person.txt";
//        if (personCount == 4) {    
//            
//            PersonalDetails person1 = new PersonalDetails("Finn", 21, "Male");
//            PersonalDetails person2 = new PersonalDetails("Michael", 18, "Male");
//            PersonalDetails person3 = new PersonalDetails("Patrick", 19, "Male");
//            PersonalDetails person4 = new PersonalDetails("Aisling", 22, "Female");
//
//            arraylist.add(person1);
//            arraylist.add(person2);
//            arraylist.add(person3);
//            arraylist.add(person4);
//            FileOutputStream fos = null;
//            ObjectOutputStream out = null;
//        } else {
//            System.out.println("Sorry personCount != 4");
//        }
//    }
    
    public TestData (int personCount) {
        arraylist = new ArrayList<>();
        fileName = "person.txt";
        
        for (int i = 0; i < personCount; i++) {
            Random rand = new Random();
            int n = rand.nextInt(128) + 1;
            
            String gender = "";
            
            if (n % 2 == 0) {
                gender = "female";
            } else {
                gender = "male";
            }
            
            PersonalDetails person = new PersonalDetails("name" + i, n, gender);
            
            arraylist.add(person);
        }
    }
    
    public int writeToDisk() {
        
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(arraylist);
            out.close();
            System.out.println("Object Persisted");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return arraylist.size();
    }
    
    public int readFromDisk() {

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis);
            arraylist = (ArrayList) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return arraylist.size();
    }
    
    @Override
    public String toString() {
        String localString = "";
        
       for (PersonalDetails person : arraylist){
           localString += "\n\n" + person.toString();
       }
      
       return localString;
    }

}