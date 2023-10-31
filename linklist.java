// This code is for adding element at first and last position in linklist

class linklist{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Add element at first position
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;}

        // add last node

        public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        } 
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    
        System.out.println("Null");
    }
    public static void main (String args[]){
        linklist list=new linklist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
    }
}