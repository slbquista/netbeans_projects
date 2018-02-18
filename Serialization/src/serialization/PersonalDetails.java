/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author 1516392
 */
public class PersonalDetails implements Serializable {


    private String name;
    private int age;
    private String sex;
    
    public PersonalDetails(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Override
    public String toString() {
        return ("name = " + name + "\nage = " + age + "\nsex = " + sex);
    }
    
}
