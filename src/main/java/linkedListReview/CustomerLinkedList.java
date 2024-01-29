package linkedListReview;

public class CustomerLinkedList {

    CNode head;
    CNode tail;
    int size;
    public CustomerLinkedList() {

    }
    //methods
    boolean isEmpty(){
        return head==null;
    }

    void insertLast(CNode customerNode){

        if(isEmpty()){ //case 1: list is empty
            head = tail = customerNode;
        }else {  //case 2: list is not empty
            tail.next=customerNode;
            tail=customerNode;
        }

        size++;
    }

    void printNames(){
        CNode current = head;

        while (current!=null){
            if(current==head) System.out.print(" Head ");
            else if(current==tail) System.out.print(" Tail ");
            System.out.print(current.name + " => ");
            if(current.next==null) System.out.print("null");
            current=current.next;
        }

    }

    void deleteByName(String name){
        CNode prev = head;
        CNode current = head;
        while (current !=null){
            if(current.name.equals(name)){

                if(current==head){  //case 1: it's head
                    //sub case one element in list which is head == tail
                    if(head==tail){
                      tail=null; //assigning head and tail as null
                    }
                    head=current.next;
                    current.next=null; //optional not required

                }else if(current==tail) {  //case 2: it's tail
                    prev.next = null;
                    tail=prev;

                }else { //case 3: it's in the middle
                    prev.next=current.next;
                    current.next=null; //optional not required
                }
                size--;

            }

            prev=current;
            current=current.next;

        }

    }

}
