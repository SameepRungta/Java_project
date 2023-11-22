class LinkedList{

    class Node{

        int data;
        Node next;

            public Node(int data){

                this.data=data;
                this.next= null;

            }

    }


    public void addFirst(int data){
        
        
        //Step-1 Creating a new Node
        Node newNode = new Node(data);
        
            if(head==null){
                head=tail= newNode;
                return;
            }
        
        //Step-2 
        newNode.next=head; //link

        //step-3
        head= newNode;
    }

public static void main(String[] args){

    LinkedList ll1= new LinkedList();
    ll1.addFirst(10);

    LinkedList ll2= new LinkedList();
    ll2.addFirst(20);
    

}


}