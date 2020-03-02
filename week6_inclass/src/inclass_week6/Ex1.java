package inclass_week6;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =0;

        System.out.println("Please type in any sequence of up to 10 numbers (type return to end): ");
        String values = in.nextLine();

        int[] nums = new int[values.length()];
        int[] occurs = new int[10];

        // convert characters to integers
        for (i = 0; i < values.length(); i++){
            nums[i] = Character.getNumericValue(values.charAt(i));
        }

        // count the number of times each value occurs
        for (i = 0; i < nums.length; i++){
            occurs[nums[i]] ++;
        }

        for (i = 0; i < occurs.length; i ++){
            System.out.printf("%d occurs %d time(s)%n", i, occurs[i]);
        }
    }
}
