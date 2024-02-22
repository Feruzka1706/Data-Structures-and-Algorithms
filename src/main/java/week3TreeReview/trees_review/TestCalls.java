package week3TreeReview.trees_review;

public class TestCalls {
    public static void main(String[] args) {

        System.out.println(sum());
    }

    static int sum(){
        return methodA() + methodB();
    }

   static int methodA(){
        return 4;
    }

   static int methodB(){
        return 3;
    }

}
