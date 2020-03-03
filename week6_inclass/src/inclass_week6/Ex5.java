package inclass_week6;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int size = suits.length * ranks.length;
        Random rand = new Random();
        String[] deck = new String[size];

        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++){
                // i = 0-13 = 14
                // j = 0-3 = 4
                // on the first run, this gives you deck[0] 4 * 0 + 0
                // on the second run, this gives you deck[1] 4 * 0 + 1
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }

        System.out.println("DECK");
        for (int i = 0; i < deck.length; i++) {
                System.out.printf("%s%n", deck[i]);
            }

        for (int i = 0; i < deck.length; i++) {
            int r = rand.nextInt(size);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        System.out.println("SHUFFLED DECK");
        for (int i = 0; i < deck.length; i++) {
            System.out.printf("%s%n", deck[i]);
        }
    }
}
