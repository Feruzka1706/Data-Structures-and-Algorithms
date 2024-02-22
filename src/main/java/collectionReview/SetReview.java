package collectionReview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1.create a set
        Set<Student> set = new LinkedHashSet<>();

        // 2. add element
        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4,"Mary"));
        System.out.println(set.add(new Student(4, "Mary")));


        set.forEach(System.out::println);

        String word = "Javva Developer";
        System.out.println(firstRepeatedCharacter(word));

    }

    public static Character firstRepeatedCharacter(String str){
        // What is the time complexity of the following code? O(n)
        if(str.isEmpty() || str.isBlank()){
            return null;
        }
        str=str.toLowerCase();

        //create a HashSet
        Set<Character> chars = new HashSet<>(); //in here Space complexity of O(n)

        //iterate over the char array and add chars into HashSet
        for (Character eachChar: str.toCharArray()){
            if( !chars.add(eachChar)){
                return eachChar;
            }
        }
        //if add operation is false return that char to user
        return null;
    }



}
