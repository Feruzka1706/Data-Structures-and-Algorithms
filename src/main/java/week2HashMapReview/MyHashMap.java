package week2HashMapReview;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    public List<Buckets> hashMap;
    public int modulusNumber;

    public MyHashMap() {
        this.modulusNumber=2341;
        this.hashMap = new ArrayList<>();
        for (int i = 0; i < 2341; i++) {
            this.hashMap.add(new Buckets());
        }
    }

    public void put(int key, int value){
        //calculate index
        int hashCode = key % modulusNumber;
        this.hashMap.get(hashCode).update(key,value); //call method (update()) from linkedlist

    }

    public int get(int key){
       //calculate index
        int hashCode = key % modulusNumber;
      return   this.hashMap.get(hashCode).get(key);
    }

    public void remove(int key){
        //calculate index
        int hashCode = key % modulusNumber;
        this.hashMap.get(hashCode).remove(key);
    }



}
