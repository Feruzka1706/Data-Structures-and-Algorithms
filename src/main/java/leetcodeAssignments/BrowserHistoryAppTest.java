package leetcodeAssignments;


public class BrowserHistoryAppTest {

    public static void main(String[] args) {

        BrowserHistory history = new BrowserHistory();

        history.visit("leetcode.com");
        history.visit("google.com");
        history.visit("selenium.com");
        history.visit("miss dior.com");
        //history.visit("");
        System.out.println(history.back(2));
        System.out.println(history);
        System.out.println(history.forward(1));
        System.out.println(history);
    }
}
