package CoreJava.LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;
    public DLL(){
        this.size = 0;
    }
    public  void InsertFirst(int val) {
        if(tail==null){
            tail = head;
        }
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null)
            head.prev = node;
        head = node;
        size+=1;
    }
    public void InsertLast(int val){
        if(head==null){
            InsertFirst(val);
            size+=1;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
//        Node creat = new Node(val,null,temp);
        Node creat = new Node(val);
//        creat.value = val;
        creat.next = null;
        creat.prev = temp;
        temp.next = creat;
        tail = creat;
        size+=1;

    }
    private class Node{

        private int value;
        private Node next;
        private Node prev;

        private int size;


        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayRev(){
//        Node temp = tail;
//        while(temp!=null){
//            System.out.print(temp.value + "-->");
//            temp = temp.prev;
//        }
//        System.out.println("End");Node temp = tail;
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        while(last!=null){
            System.out.print(last.value + "-->");
            last = last.prev;
        }

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
    public void insertingafter(int after,int val){
        Node pv = find(after);
        if(pv.next==null){
            InsertLast(val);
            return;
        }
        Node new_node =  new Node(val);
        if(new_node==null){
            System.out.println("node having that value doesnot exists");
            return;
        }
//        (pv.next).prev = new_node;
        new_node.next = pv.next;
        (new_node.next).prev = new_node;
        new_node.prev = pv;
        pv.next =new_node;
        size++;
    }
}
