package week2StackReview;

public class GenericStackTest {

    public static void main(String[] args) {
        GStack<Integer> myStack = new GStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }
}
