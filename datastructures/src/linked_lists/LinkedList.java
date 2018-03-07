package linked_lists;

public class LinkedList implements IList {
    
    Node head;
    Node tail;
    int size;
    
    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addToFront(int value) {
        Node node = new Node(value);
        if(head == null){
            head = node;
            size++;
            tail = node;
        }else{
            node.setNode(head);
            head = node;
            size++;
        }
    }

    @Override
    public void addToRear(int value) {
        Node node = new Node(value);
        if(head == null){
            head = node;
            size++;
            tail = node;
        } else {
            tail.setNode(node);
            size++;
            tail = node;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int peekAtFront() {
        if(head == null)
            return -1;
        else
            return head.data;
    }

    @Override
    public int peekAtRear() {
        if(tail == null)
            return -1;
        else
            return tail.data;
    }

    @Override
    public int removeFront() {
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    @Override
    public int removeRear() {
        Node temp = head;
        for(int i = 1; i < size -1; i++){
            temp = temp.next;
        }
        int value = tail.data;
        tail = temp;
        size--;
        return value;
    }

    @Override
    public int search(int target) {
        int pos = 0;
        Node temp = head;
        while (pos < size){
            if (temp.data == target)
                return pos;
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }
    
}
