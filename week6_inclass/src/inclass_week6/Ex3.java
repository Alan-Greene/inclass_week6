package inclass_week6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] alphabet = new char[26];
        char letter = 'a';
        int[] occurs = new int[26];

        for (int i = 0; i < alphabet.length; i++){
            alphabet[i] = letter;
            letter++;
        }

        System.out.println("Please type in any sequence of letters (type return to end): ");
        String letters = in.nextLine();

        for (int i = 0; i < letters.length(); i++){
            char current_letter = letters.charAt(i);

            switch (current_letter) {
                case 'a':
                    occurs[0]++;
                    break;
                case 'b':
                    occurs[1]++;
                    break;
                case 'c':
                    occurs[2]++;
                    break;
                case 'd':
                    occurs[3]++;
                    break;
                case 'e':
                    occurs[4]++;
                    break;
                case 'f':
                    occurs[5]++;
                    break;
                case 'g':
                    occurs[6]++;
                    break;
                case 'h':
                    occurs[7]++;
                    break;
                case 'i':
                    occurs[8]++;
                    break;
                case 'j':
                    occurs[9]++;
                    break;
                case 'k':
                    occurs[10]++;
                    break;
                case 'l':
                    occurs[11]++;
                    break;
                case 'm':
                    occurs[12]++;
                    break;
                    case 'n':
                    occurs[13]++;
                    break;
                case 'o':
                    occurs[14]++;
                    break;
                case 'p':
                    occurs[15]++;
                    break;
                case 'q':
                    occurs[16]++;
                    break;
                case 'r':
                    occurs[17]++;
                    break;
                case 's':
                    occurs[18]++;
                    break;
                case 't':
                    occurs[19]++;
                    break;
                case 'u':
                    occurs[20]++;
                    break;
                case 'v':
                    occurs[21]++;
                    break;
                case 'w':
                    occurs[22]++;
                    break;
                case 'x':
                    occurs[23]++;
                    break;
                case 'y':
                    occurs[24]++;
                    break;
                case 'z':
                    occurs[25]++;
                    break;

            }
        }

        for (int i = 0; i < occurs.length; i++){
            if (occurs[i] == 1){
                System.out.printf("%c occurs %d time%n", alphabet[i], occurs[i]);
            } else if (occurs[i] > 1){
                System.out.printf("%c occurs %d times%n", alphabet[i], occurs[i]);

            }
        }

    }
}
