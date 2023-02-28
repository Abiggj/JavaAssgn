package ArrayAssgn;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
    public static void main(String[] args) {
        // ArrayList defined manually
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(78);
        numbers.add(45);
        numbers.add(12);
        numbers.add(34);
        numbers.add(23);
        numbers.add(90);
        numbers.add(67);
        numbers.add(1);
        numbers.add(89);

        // Integer array of the ArrayList size is initialised and converted to array into it
        Integer[] numbersArray = new Integer[numbers.size()]; 
        numbersArray = numbers.toArray(numbersArray);
        System.out.println("The converted array is:");
        for (Integer num : numbersArray)
                System.out.print(num + " ");   
        System.out.println("\n\nThe converted arraylist is:");
        // New ArrayList to convert the Array back 
        ArrayList<Integer> numberArrayList = new ArrayList<Integer>(Arrays.asList(numbersArray));
        for(int i = 0; i < numberArrayList.size(); i++){
            System.out.print(numberArrayList.get(i) + " ");
        }

    }

}
