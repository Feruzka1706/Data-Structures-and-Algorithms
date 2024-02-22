package week3TreeReview.trees_review.oracle;

import java.util.ArrayList;

public class Tree {
    Node root;

    boolean isEmpty(){
        return root==null;
    }

    void insert(int value){
        Node newNode = new Node(value);
         if(isEmpty()){
             root = newNode;
         }
         Node current = root;
         while(true){

             if(value < current.value){ //case 1: data < root
                 if(current.leftChild==null){
                     current.leftChild=newNode;
                     break;
                 }else {
                     current=current.leftChild;
                 }
             }else if(value > current.value){   //case 2: data > root
                 if(current.rightChild==null){
                     current.rightChild=newNode;
                     break;
                 }else {
                     current=current.rightChild;
                 }

             } else break; //case 3 : data == root  break the loop do not insert duplicate value
         }

    }

     public ArrayList<Integer> findPath(int value){
        ArrayList<Integer> result = new ArrayList<>();
        if(isEmpty()) return result;
        Node current = root;

        while(current !=null){
            if(value < current.value){
                result.add(current.value);
                current = current.leftChild;
            }else if(value > current.value){
                result.add(current.value);
                current=current.rightChild;
            }else { //if value is equal with current value case
                result.add((current.value));
                return result;
            }
        }
        return new ArrayList<>(); //if I cannot find it will return new empty ArrayList
    }
}
