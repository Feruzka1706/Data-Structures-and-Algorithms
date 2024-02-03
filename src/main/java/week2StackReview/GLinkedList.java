package week2StackReview;

public class GLinkedList<T> {

    SNode<T> head;
    SNode<T> tail;

    int size;
    boolean isEmpty(){
        return head==null;
    }

    void addFirst(T t){
        //create new node from T
        SNode<T> node= new SNode<>(t);

        //case 1: list is empty
        if(isEmpty()){
            head=tail=node;
        }else {//case 2; list is not empty
            node.next=head;
            head=node;
        }

        size++;
    }

    T removeFirst(){
        if(isEmpty()) return null;
        T result =null;
        //case 1: list has only 1 element
         if(head==tail){
            result = head.value;
            head= tail=null;
         }else {//case 2: list has more than one element
             result=head.value;
             head= head.next;
         }
        size--;

         return result;
    }

    void printNodes(){
        SNode<T> current = head;
        while (current!=null){
            System.out.println(current.value);
        }
    }

}
