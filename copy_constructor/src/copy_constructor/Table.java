package copy_constructor;

import customexceptions.NoRecordFound;
import java.util.ArrayList;

/**
 * @author 1516392
 */

public class Table {
    private ArrayList< Row > tablerows;
    
    public Table() {
        this.tablerows = new ArrayList<>();
    }
    
    public void addRow (Row aRow) {
        tablerows.add( aRow );
    }
    
    //Return type: aRow (!)
    //Tablerows (list entries) not modified
    public Row findInColumn3( String searchStr ) throws NoRecordFound {
        for (int i = 0; i < tablerows.size(); i++) {
            if (tablerows.get(i).getColumn3().equalsIgnoreCase(searchStr) && !tablerows.get(i).isLocked()) {
                //Label the row as locked
                //Use the copy constructor
                Row temp = new Row(tablerows.get(i));
                temp.lockTheRow();
                return temp;
            }
        }
        
        throw new NoRecordFound( "{" + searchStr + "} NOT found in column3!");
    }
    
    //
    public Row lockARow( String searchStr ) throws NoRecordFound {
        for (int i = 0; i < tablerows.size(); i++) {
            if (tablerows.get(i).getColumn3().equalsIgnoreCase(searchStr) && !tablerows.get(i).isLocked()) {
                //Label the row as locked
                //Use the copy constructor
                Row temp = new Row(tablerows.get(i));
                temp.lockTheRow();
                tablerows.remove(i);
                tablerows.add(temp);
                return temp;
            }
        }
        
        throw new NoRecordFound( "{" + searchStr + "} NOT found in column3!");
    }
    
    public void displayAllRows() {
        for (Row r : tablerows) {
            System.out.println(r.toString());
        }
    }
}
