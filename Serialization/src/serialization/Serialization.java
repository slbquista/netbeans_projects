/**
 *
 * @author 1516392
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

    public static void main(String[] args) {
        //getPersonalDetails();
        //personPersist();
        output();
    }

    // Read
    public static ArrayList<PersonalDetails> getPersonalDetails() {
        String filename = "person.data";
        ArrayList<PersonalDetails> arrlist = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            arrlist = (ArrayList) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("ArrayList<PersonalDetails> Size: " + arrlist.size());
        System.out.println();
        
        return arrlist;
    }
    
    // Write
    public static void personPersist() {
        
        String filename = "person.txt";
        PersonalDetails person1 = new PersonalDetails("Finn", 21, "Male");
        PersonalDetails person2 = new PersonalDetails("Michael", 1, "Male");
        PersonalDetails person3 = new PersonalDetails("Patrick", 2, "Male");
        PersonalDetails person4 = new PersonalDetails("Aisling", 22, "Female");
        
        // List list = new ArrayList();
        ArrayList<PersonalDetails> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(list);
            out.close();
            System.out.println("Object Persisted");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void output() {
        TestData e = new TestData(10000);
        
        System.out.println(e.toString());
    }
}
