package CoreJava.LinkedList;

public class LL {
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;//if we use tail we can insert at last position in O(1), otherwise it may require O(n)
    private int size;
    public LL(){
        this.size= 0;

    }
    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head=node;
        size+=1;
        if(tail==null){
            tail = head;
        }
    }
    public void DelFirst(){
        if(size==1){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        size--;
    }
    public void DelLast(){
        if(size==1){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while((temp.next).next!=null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    public int DeleteLast(){
        int value;
        if(size==1){
            value = head.value;
            head = null;
            tail = null;
            size--;
            return value;
        }
        Node SecondLast = get(size-2);
//        while((temp.next).next!=null){
//            temp = temp.next;
//        }
        value = SecondLast.value;
        SecondLast.next = null;
        tail = SecondLast;
        size--;
        return value;
    }
    public void InsertNext(int value){
        Node node = new Node(value);
        if(tail==null){
            System.out.println("no nodes present so inserting it in first position");
            InsertFirst(value);
        }
        else {
            tail.next = node;
            tail = node;
            size += 1;
        }
    }
    public void insert(int val, int index){
        if(index>size || index<0){
            return ;
        }
        if(index == 0){
            InsertFirst(val);
            return;
        }
        if(index==size){
            InsertNext(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;


    }
    public void Del(int index){
        if (index == 0){
            DelFirst();
            return;
        }
        if(index==size-1){
            DelLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }
        temp.next = (temp.next).next;
        size--;
    }
    public void Delete(int index){
        if (index == 0){
            DelFirst();
            return;
        }
        if(index==size-1){
            DelLast();
            return;
        }
        Node prev = get(index-1);
        prev.next = (prev.next).next;
        size--;
    }
    public void Display(){
        Node temp =head;
//        temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            if(temp.next!=null){
                System.out.print("-->");
            }
            temp=temp.next;

        }
        System.out.println("");
    }
    public Node get(int index){
        if (index==0)
            return head;
        if(index ==size-1){
            return tail;
        }
        Node temp = head;
        for (int i = 1; i <=index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int getValue(int index){
        if (index==0)
            return head.value;
        if(index ==size-1){
            return tail.value;
        }
        Node temp = head;
        for (int i = 1; i <=index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp =temp.next;
        }
        return null;
    }
}
