public class DoubleLinkedList {
    Node head;
    Node tail;

public DoubleLinkedList(){
    this.head = null;
    this.tail = null;
}

public void insertBeginning(int data){
Node temp = new Node(data);
    if(head == null){
        head = temp;
        tail = temp;
    } else {
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
}


public void insertEnd(int data){
    Node temp = new Node(data);


    if(tail == null){
        head = temp;
        tail = temp;
    }else{
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }
}


public void traverseFoward(){
    Node current = head;
    while(current != null){
        System.out.println(current.data+ " ");
        current = current.next;
    }
    System.out.println();
}



public void traverseBackward(){
    Node current = tail;
    while(current != null){
        System.out.println(current.data+ " ");
        current = current.prev;
    }
    System.out.println();

}


    }
