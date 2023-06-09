package CoreJava.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        list.InsertFirst(12);
//        list.InsertFirst(13);
//        list.InsertFirst(14);
//        list.InsertFirst(15);
//        list.InsertFirst(16);
//        list.InsertFirst(17);
//        list.InsertFirst(18);
        list.InsertNext(11);
        list.InsertNext(12);
        list.InsertNext(13);
        list.InsertNext(14);
        list.InsertNext(15);
        list.insert(33,3);

        list.Display();
//        System.out.println((list.getValue(3)));
//        list.Del(3);
        list.DeleteLast();

        list.Display();
//        list.DelLast();
//        list.Display();
//        list.DelFirst();
//        list.Display();
    }
}
