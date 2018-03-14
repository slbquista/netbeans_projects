package generics.object_list;

/**
 *
 * @author kevin.mcdonald
 * @date 24th November 2016
 */
public class Student {
    String name;
    int age;
    public Student(String _name, int _age){
        name = _name;
        age = _age;
    }
    
    @Override
    public String toString(){
        return "Name:" + name + ", Age:" + age;
    }
    
}
