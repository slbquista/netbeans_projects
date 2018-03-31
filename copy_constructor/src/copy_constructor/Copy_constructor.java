package copy_constructor;

//import copy_constructor.Row;
//import copy_constructor.Table;
import customexceptions.NoRecordFound;

/**
 * @author 1516392
 */

public class Copy_constructor {

    public static void main(String[] args) {
        test1();
    }
    
    public static int test1() {
        Table t = new Table();
        Row r = new Row(1,100,"string1","string2"); //Default not locked
        t.addRow(r);
        
        try {
            System.out.println(t.findInColumn3("string1"));
            t.displayAllRows(); //"table" NOT changed
        } catch (NoRecordFound n) {
            System.out.println(n.toString());
        }
        System.out.println("---------------------------------------------");
        
        try {
            System.out.println(t.findInColumn3("random string"));
        } catch (NoRecordFound n) {
            System.out.println(n.toString());
        }
        System.out.println("---------------------------------------------");
        
        try {
            System.out.println(t.lockARow("string1")); // "table modified
        } catch (NoRecordFound n) {
            System.out.println(n.toString());
        }
        
        t.displayAllRows();
        System.out.println("---------------------------------------------");
        return 0;
    }
    
}
