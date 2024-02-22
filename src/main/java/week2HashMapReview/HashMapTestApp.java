package week2HashMapReview;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestApp {

    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);

       // System.out.println(hashMap.get(3));
        hashMap.put(3,25);
        hashMap.remove(3);
        System.out.println(hashMap.get(3));
//        hashMap.put(-2,30);
//        System.out.println(hashMap.get(-2));


        Map<Integer,Integer> map2 = new HashMap<>();
        map2.put(-2,30);
        System.out.println(map2.get(-2));

    }
}
