package com.bridgelabz;

public class DeckOfCards {

    String[] suits = {"clubs", "diamond", "hearts", "spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int deck[] = new int[52];

    public void shuffle()
    {   int i;
        for(i=0;i<52;i++)
            deck[i]=i;
        for (i = 0; i < 52; i++) {
           int randomIndex = (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
    }
    }
        public void displayCards()
        {
            for (int i = 0; i < 52; i++) {
                String suit = suits[deck[i] / 13];
                String rank = ranks[deck[i] % 13];
                System.out.println(rank + " of " + suit);

            }



        }

}
