/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author kevin.mcdonald
 */
public class ArrayList implements IList{
    
    int[] array;
    int maxSize;
    int size;
    int position;
    
    public ArrayList(){
        this.size = 0;
        this.maxSize = 10;
        this.position = -1;
        this.array = new int[maxSize];
    }

    @Override
    public void addToFront(int value) {
        //  Shuffle everything up 1 index.
        System.arraycopy(array, 0, array, 1, array.length-1);
        //  Add to front.
        array[0] = value;
        position++;
        size++;
        if (size > (maxSize * 0.7)){
            enlargeArray();
        }
    }

    @Override
    public void addToRear(int value) {
        array[++position] = value;
        size++;
        if (size > (maxSize * 0.7)){
            enlargeArray();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int peekAtFront() {
        return array[0];
    }

    @Override
    public int peekAtRear() {
        return array[position];
    }

    @Override
    public int removeFromFront() {
        int value = array[0];
        System.arraycopy(array, 1, array, 0, array.length-1);
        size--;
        position--;
        return value;
    }

    @Override
    public int removeFromRear() {
        int value = array[position];
        position--;
        size--;
        return value;
    }

    @Override
    public int search(int item) {
        int index = 0;
        while (index < array.length){
            if (array[index] == item)
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }
    
    private void enlargeArray(){
        maxSize = (int)(maxSize * 1.5 + 1);
        int[] tempArray = new int[maxSize];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        array = tempArray;
    }
    
}
