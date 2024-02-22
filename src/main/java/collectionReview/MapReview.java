package collectionReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {

        //create hash map
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1,"Jack");
        studentMap.put(2,"Julia");
        studentMap.put(3,"Mary");

        String str = "JJavaDeveloper";

        System.out.println(findFirstNonRepeatedCharacter(str));

        int[] arr = {2,7,3,5,10};
        int[] arr2 = {4,7,2,11,10};
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr2,9)));

    }


    public static Character findFirstNonRepeatedCharacter(String str){

        //create a HashMap: this will cost space complexity
        Map<Character, Integer> map = new TreeMap<>();
        int count = 0;

        //count the frequency of chars
        for (Character each: str.toCharArray()) {
            if(map.containsKey(each)){
                count=map.get(each);
                map.put(each,count+1);
            }
            else {
                map.put(each,1);
            }
        }
        //start from the beginning and check if there is a char with frequency 1
        for (Character each: str.toCharArray()) {
            if(map.get(each)==1) return each;
        }
        return null;
    }

    //Optimized solution with HashMap, time complexity = O(n),
    // but there is space complexity is O(n) because we created new HashMap
    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <array.length ; i++) { //
            int potentialMatch = targetValue -array[i];
            if(map.containsKey(potentialMatch)){
                return new int[]{i, map.get(potentialMatch)};
            }else {
                map.put(array[i],i);
            }
        }

        return new int[]{};
    }
}
