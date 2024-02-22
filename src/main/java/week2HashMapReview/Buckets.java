package week2HashMapReview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Buckets {

    LinkedList<KeyValue<Integer, Integer>> bucketList;

    public Buckets() {
        this.bucketList = new LinkedList<>();
    }

   public int get(int key) {
        //it will search key and if there is key value pair it will return value of that key pair
        for (KeyValue<Integer, Integer> pair : bucketList) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return -1;
    }

   public void update(int key, int value){
        boolean found = false;
       for (KeyValue<Integer, Integer> pair : bucketList) {
           if (pair.key.equals(key)) {
              pair.value=value;
              found=true;
           }
       }
       if(!found){
           this.bucketList.add(new KeyValue<>(key,value));
       }
   }

   public void remove(int key){

       for (KeyValue<Integer, Integer> pair : bucketList) {
           if (pair.key.equals(key)) {
               this.bucketList.remove(pair);
               break;
           }
       }

   }


}
