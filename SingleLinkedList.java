class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head = null;
    public void insertFromBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertFromEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insertFromEnd(10);
        ll.insertFromEnd(20);
        ll.insertFromEnd(30);
        ll.insertFromEnd(40);
        ll.insertFromEnd(50);
        ll.display();
    }
}
