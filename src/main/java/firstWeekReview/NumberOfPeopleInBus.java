package firstWeekReview;

import java.util.ArrayList;

public class NumberOfPeopleInBus {

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0}); //first stop getting people
        list.add(new int[] {3,5});
        list.add(new int[] {2,5}); //last stop

        System.out.println(countOfPassengers(list));

    }

    public static int countOfPassengers(ArrayList<int[]> stops){
        //Runs in O(n) complexity because there is a single loop with size n
        int numberOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numberOfPeople = numberOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }

        return numberOfPeople;
    }


}
