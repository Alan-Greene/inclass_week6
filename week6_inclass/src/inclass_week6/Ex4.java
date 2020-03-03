package inclass_week6;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[][] nums = new int[5][10];
        Random rand = new Random();

        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++){
                nums[row][col] = rand.nextInt(499);
            }
        }

        System.out.println("Unsorted");
        for (int i = 0; i < nums.length; i++){
            for (int col = 0; col < nums[i].length; col++){
                System.out.printf("%5d", nums[i][col] );
            }
            System.out.println();
        }

        System.out.println("Sorted");
        for (int row = 0; row < nums.length; row++){
            boolean sorted = true;
            do{
                for (int col = 0; col < nums[row].length; col++){
                    if (nums[row][col] > nums[row][col + 1]){
                        sorted = false;
                        int temp = nums[row][col];
                        nums[row][col] = nums[row][col+1];
                        nums[row][col+1] = temp;
                    }
                }
            } while (!sorted);
        }

        System.out.println("Unsorted");
        for (int i = 0; i < nums.length; i++){
            for (int col = 0; col < nums[i].length; col++){
                System.out.printf("%5d", nums[i][col] );
            }
            System.out.println();
        }
    }
}
