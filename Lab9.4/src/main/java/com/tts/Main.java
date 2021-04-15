package com.tts;
import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        Write a program that does the following:
//        Asks the user for 5 numbers
//        Stores them in an array list
//        Finds the sum, product, largest, and smallest of those numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in any 5 numbers that you want!");
        int myNumber1 = scanner.nextInt();
        int myNumber2 = scanner.nextInt();
        int myNumber3 = scanner.nextInt();
        int myNumber4 = scanner.nextInt();
        int myNumber5 = scanner.nextInt();
        List<Integer> arrNumbers = new ArrayList<>();
        arrNumbers.add(myNumber1);
        arrNumbers.add(myNumber2);
        arrNumbers.add(myNumber3);
        arrNumbers.add(myNumber4);
        arrNumbers.add(myNumber5);
        System.out.println(arrNumbers);
        int sum = 0, product = 1, max = arrNumbers.get(0), min = arrNumbers.get(0);
        for(int i = 0; i < 5; i++) {
            sum += arrNumbers.get(i);
            product *= arrNumbers.get(i);
            max = Math.max(max, arrNumbers.get(i));
            min = Math.min(min, arrNumbers.get(i));
        }
// printing the output.
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The Max is: " + max);
        System.out.println("The Min is: " + min);
        // You are a car dealer. Create a hash map of vehicles.
        // The model is the Key, the make is the Value.
        // Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
        // (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        // creates our Hashmap where we store keys and their values
        HashMap<String, String> vehicles = new HashMap <> ();
        vehicles.put("cybertruck", "Tesla");
        vehicles.put("x6", "BMW");
        vehicles.put("r8", "Audi");
        vehicles.put("tundra", "Toyota");
        vehicles.put("wrangler", "Jeep");
        // prints out our Hashmap
       // System.out.println(vehicles);
        System.out.println("Hey what is your name?");
        String yourName = scanner.next();
        System.out.println("Hello " + yourName + ". What model would you like?");
        // we made our input lowercase so that it matches the keys in our Hashmap if the words are spelled correctly (since all the words in our Hashmap are lowercase as well).
        String carModel = scanner.next().toLowerCase();
        // returns a particular output if the input matches a key in our Hashmap
        if (vehicles.containsKey(carModel)) {
            System.out.println("Oh, you're looking for a " + carModel + "? Our " + carModel +  " selection is right over here at our " + vehicles.get(carModel) + " dealership.");
        } else {
            System.out.println("Sorry, we don't have a " + carModel + ". Please try something else.");
        }
    }
}