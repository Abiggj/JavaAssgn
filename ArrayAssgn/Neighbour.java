package ArrayAssgn;

import java.util.ArrayList;

public class Neighbour {
    public static void main(String[] args) {
            
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Integer first, second;
        // ArrayList manually declared
        numbers.add(78);
        numbers.add(45);
        numbers.add(12);
        numbers.add(34);
        numbers.add(23);
        numbers.add(90);
        numbers.add(67);
        numbers.add(1);
        numbers.add(89);
        // if the number is 1 forward or 1 back, it is a neighbour
        // so for all the numbers from 0 to last index are checked
        // the elements in front are checked
        for(int i = 0; i < numbers.size(); i++){
            first = numbers.get(i);
            for(int j = i + 1;j < numbers.size(); j++){
                second = numbers.get(j);
                if((first + 1) == second || (first - 1) == second){
                    System.out.println("The address of the neighbour numbers " + numbers.get(i) + " " + numbers.get(j) + " is " + i);
                }
            }
            }   
        }
    }
