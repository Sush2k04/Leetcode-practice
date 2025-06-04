class DoublyLinkedList{
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }   
    }
    private Node head = null;
    
    private Node tail = null;
    
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
}
class Main{
    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtEnd(10);
        dl.insertAtEnd(20);
        dl.insertAtEnd(4);
        dl.display();
    }
}
