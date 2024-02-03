package week2StackReview;

public class GStack<T> {
    GLinkedList<T> list = new GLinkedList<>();

    boolean isEmpty(){
        return list.isEmpty();
    }

    void push(T t){
        list.addFirst(t);
    }

    T pop(){
        return list.removeFirst();
    }

    T peek(){
        if(isEmpty()) return null;
        else return list.head.value;
    }

    int size(){
        return list.size;
    }

    //Adapter pattern in OOP (reusing the existing method in another method) - Design pattern by GOF
}
