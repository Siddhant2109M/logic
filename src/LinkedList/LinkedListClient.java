package LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.display();// 1
        list.addFirst(2);
        list.display();// 2 1
        list.addFirst(4);
        list.display();// 4 2 1
        list.addFirst(5);
        list.display();// 5 4 2 1
        list.addLast(0);
        list.display();// 5 4 2 1 0
        list.addLast(-1);
        list.display();// 5 4 2 1 0 -1
        list.addAt(3, 2);
        list.display();// 5 4 3 2 1 0 -1
        list.removeFirst();
        list.display();// 4 3 2 1 0 -1
        list.removeLast();
        list.display();// 4 3 2 1 0
        list.removeAt(2);
        list.display();// 4 3 1 0
    }
}
