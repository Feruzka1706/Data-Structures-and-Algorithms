package leetcodeAssignments;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

public class BrowserHistory {

    private Stack<String> historyStack;
    private Stack<String> forwardStack;

    private String currentUrl;

    public BrowserHistory() {
        this.historyStack = new Stack<>();
        this.forwardStack = new Stack<>();
        this.currentUrl=null;
    }
    public BrowserHistory(String currentUrl) {
        this.historyStack = new Stack<>();
        this.forwardStack = new Stack<>();
        this.currentUrl=currentUrl;
    }


    public void visit(String url){
       if(!StringUtils.isEmpty(this.currentUrl)){
           this.historyStack.push(this.currentUrl);
       }
        this.currentUrl=url;
        this.forwardStack.clear();
    }


    public String back(int numberOfBackSteps){ //1 == 0

        if(numberOfBackSteps<=0 || this.historyStack.isEmpty()){ //true
            return this.currentUrl;
        }

        int actualNumberOfBackSteps = numberOfBackSteps; //1
        if(actualNumberOfBackSteps > this.historyStack.size()){
            actualNumberOfBackSteps = this.historyStack.size();
        }

        while( actualNumberOfBackSteps > 0 ){
            if(!StringUtils.isEmpty(this.currentUrl)){
                this.forwardStack.push(this.currentUrl);
            }
            this.currentUrl=this.historyStack.pop();
            actualNumberOfBackSteps--;
        }
        return this.currentUrl;
    }

    public String forward(int numberOfForwardSteps){ // 2 size == 0

        if(numberOfForwardSteps <=0 || this.forwardStack.isEmpty()){ //2
            return this.currentUrl;
        }
        int actualNumberOfForwardSteps = numberOfForwardSteps; //3

        if(actualNumberOfForwardSteps > this.forwardStack.size()){
            actualNumberOfForwardSteps = this.forwardStack.size(); //2
        }

        while(actualNumberOfForwardSteps >0){
            if(!StringUtils.isEmpty(this.currentUrl)){
                this.historyStack.push(this.currentUrl);
            }
            this.currentUrl= this.forwardStack.pop();
            actualNumberOfForwardSteps--;
        }
        return this.currentUrl;
    }


    @Override
    public String toString() {
        return "BrowserHistory{" +
                "historyStack=" + historyStack +
                ", forwardStack=" + forwardStack +
                ", currentUrl='" + currentUrl + '\'' +
                '}';
    }
}
