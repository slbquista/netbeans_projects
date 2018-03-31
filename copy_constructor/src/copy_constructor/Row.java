package copy_constructor;

/**
 * @author 1516392
 */

public class Row {
    private int column1;
    private int column2;
    private String column3;
    private String column4;
    private boolean rowLocked;
    
    public Row (int column1, int column2, String column3, String column4) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.rowLocked = false;
    }
    
    @Override
    public String toString() {
        return "Row(" + "column1=" + column1 + ", column2=" + column2 + ", column3=" + column3 + ", column4=" + column4 + ", rowLocked=" + rowLocked;
    }

    public int getColumn1() {
        return column1;
    }

    public int getColumn2() {
        return column2;
    }

    public String getColumn3() {
        return column3;
    }

    public String getColumn4() {
        return column4;
    }
    
    public boolean isLocked() {
        return this.rowLocked;
    }
    
    public boolean unlockTheRow() {
        this.rowLocked = false;
        return this.rowLocked;
    }
    
    public boolean lockTheRow() {
        this.rowLocked = true;
        return this.rowLocked;
    }
    
    public Row(Row aRow) {
        this.column1 = aRow.column1;
        this.column2 = aRow.column2;
        this.column3 = aRow.column3;
        this.column4 = aRow.column4;
        this.rowLocked = aRow.rowLocked;
    }
}
