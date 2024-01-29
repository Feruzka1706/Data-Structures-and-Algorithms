package linkedListReview;

public class CustomerAppTest {

    public static void main(String[] args) {
        CustomerLinkedList list = new CustomerLinkedList();

        list.insertLast(new CNode("John", "Smith"));
        list.insertLast(new CNode("Carol", "Walker"));
        list.insertLast(new CNode("Susan", "Walker2"));

        list.printNames();
        list.deleteByName("Meryl");
        System.out.println("*****************************************************************");
        list.printNames();

    }
}
