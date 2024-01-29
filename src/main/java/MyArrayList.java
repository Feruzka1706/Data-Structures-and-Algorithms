import java.util.Arrays;

public class MyArrayList {

    //Define an array
    int[] numbers;
    int size;

    public MyArrayList(){
        this.numbers=new int[10];
        this.size=0;
    }

    public MyArrayList(int capacity){
        this.numbers=new int[capacity];
        this.size=0;
    }

    void add(int value){
        if(size>=(int) numbers.length*0.75){
            System.out.println("Before adding " + value + " size was: " + numbers.length);
            numbers = grow();
            System.out.println("After adding " + value + " size was: " + numbers.length);
        }
        numbers[size++]=value;

    }

    int[] grow(){
//        int[] newArray = new int[numbers.length*2]; //100% grow
//        for (int i = 0; i < numbers.length; i++) {
//            newArray[i] = numbers[i];
//        }
//        numbers=newArray;
//        return numbers;
        return Arrays.copyOf(numbers, numbers.length*2);
    }



}
